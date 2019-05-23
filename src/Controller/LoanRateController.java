package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoanRateDAO;
import DAO.LoanTypeDAO;
import VO.LoanRateVO;
import VO.LoanTypeVO;



/**
 * Servlet implementation class LoanRateController
 */
@WebServlet("/LoanRateController")
public class LoanRateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanRateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String flag = request.getParameter("flag");
		
		if(flag.equals("loadLoanRate")){
			loadLoanType(request,response);
			response.sendRedirect("admin/addLoanRate.jsp");
			}
		if(flag.equals("viewLoanRate")){
			viewLoanRate(request,response);
			response.sendRedirect("admin/viewLoanRate.jsp");
		}
		
		if(flag.equals("deleteLoanRate")){
			deleteLoanRate(request,response);
			viewLoanRate(request,response);
			response.sendRedirect("admin/viewLoanRate.jsp");
		}
		
		if(flag.equals("editLoanRate")){
			loadLoanType(request, response);
			editLoanRate(request,response);
			response.sendRedirect("admin/editLoanRate.jsp");
		}
		
	}

	private void editLoanRate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		 	int id = Integer.parseInt(request.getParameter("id"));
			
		 	LoanRateVO loanTypeVO = new LoanRateVO();
			loanTypeVO.setId(id);
			
			LoanRateDAO loanRateDAO = new LoanRateDAO();
			List ls = loanRateDAO.editLoanRate(loanTypeVO);
			
			HttpSession session = request.getSession();
			session.setAttribute("list", ls);
			    
		
		
	}

	private void deleteLoanRate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		LoanRateVO loanRateVO = new LoanRateVO();
		loanRateVO.setId(id);
		
		LoanRateDAO loanRateDAO = new LoanRateDAO();
		loanRateDAO.deleteLoanType(loanRateVO);
		
	}

	private void viewLoanRate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	LoanRateVO loanRateVO = new LoanRateVO();
		
		LoanRateDAO loanRateDAO = new LoanRateDAO();
		List ls = loanRateDAO.searchLoanRate(loanRateVO);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", ls);
		
	}

	private void loadLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		LoanTypeDAO loanTypeDAO  = new LoanTypeDAO();
		List loanTypelist = loanTypeDAO.loadLoanType();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("loanTypeList", loanTypelist);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String flag = request.getParameter("flag");
		
		if(flag.equals("addLoanRate")){
			addLoanRate(request,response);
			response.sendRedirect("admin/addLoanRate.jsp");
		}
		if(flag.equals("updateLoanRate")){
			updateLoanRate(request,response);
			loadLoanType(request, response);
			viewLoanRate(request, response);
			response.sendRedirect("admin/viewLoanRate.jsp");
		}
	}

	private void updateLoanRate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		int loanType = Integer.parseInt(request.getParameter("loanType"));
		String loanRateDescription = request.getParameter("loanRateDescription");
		int loanRate = Integer.parseInt(request.getParameter("loanRate"));
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setId(loanType);
		
		LoanRateVO loanRateVO = new LoanRateVO();
		loanRateVO.setLoanRate(loanRate);
		loanRateVO.setLoanRateDescription(loanRateDescription);
		loanRateVO.setId(id);
		loanRateVO.setLoanType(loanTypeVO);
		
			
		LoanRateDAO loanRateDAO = new LoanRateDAO();
		loanRateDAO.updateLoanRate(loanRateVO);
		
	}

	private void addLoanRate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		int loanRate = Integer.parseInt(request.getParameter("loanRate"));
		String loanRateDescription = request.getParameter("loanRateDescription");
		int id = Integer.parseInt(request.getParameter("loanType"));
		
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setId(id);
		
		LoanRateVO loanRateVO  = new LoanRateVO();
		loanRateVO.setLoanRate(loanRate);
		loanRateVO.setLoanRateDescription(loanRateDescription);
		loanRateVO.setLoanType(loanTypeVO);
		
		LoanRateDAO loanRateDAO = new LoanRateDAO();
		
		loanRateDAO.insert(loanRateVO);
		
		
	}

}
