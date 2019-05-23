package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoanTypeDAO;

import VO.LoanTypeVO;







/**
 * Servlet implementation class LoanTypeController
 */
@WebServlet("/LoanTypeController")
public class LoanTypeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanTypeController() {
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
		if(flag.equals("viewLoanType")){
			viewLoanType(request,response);
			response.sendRedirect("admin/viewLoanType.jsp");
			
		}
		
		if(flag.equals("deleteLoanType")){
			deleteLoanType(request,response);
			viewLoanType(request,response);
			response.sendRedirect("admin/viewLoanType.jsp");
		}
		
		if(flag.equals("editLoanType")){
			editLoanType(request,response);
			response.sendRedirect("admin/editLoanType.jsp");
		}
		
		
	}

	private void editLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
		 int id = Integer.parseInt(request.getParameter("id"));
			
		 LoanTypeVO loanTypeVO = new LoanTypeVO();
			loanTypeVO.setId(id);
			
			LoanTypeDAO loanTypeDAO = new LoanTypeDAO();
			List ls = loanTypeDAO.editLoanType(loanTypeVO);
			
			HttpSession session = request.getSession();
			session.setAttribute("list", ls);
			    
		
	}

	private void deleteLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setId(id);
		
		LoanTypeDAO loanTypeDAO = new LoanTypeDAO();
		loanTypeDAO.deleteLoanType(loanTypeVO);
		
	}

	private void viewLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		
		LoanTypeDAO loanTypeDAO = new LoanTypeDAO();
		List ls = loanTypeDAO.searchLoanType(loanTypeVO);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", ls);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String flag = request.getParameter("flag");
		
		if(flag.equals("addLoanType")){
			addLoanType(request,response);
			response.sendRedirect("admin/addLoanType.jsp");
		}
		if(flag.equals("updateLoanType")){
			updateLoanType(request,response);
			viewLoanType(request, response);
			response.sendRedirect("admin/viewLoanType.jsp");
		}
		
	}

	
	private void updateLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		
		String loanType = request.getParameter("loanType");
		String loanDescription = request.getParameter("loanDescription");
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setLoanType(loanType);
		loanTypeVO.setLoanDescription(loanDescription);
		loanTypeVO.setId(id);
			
		LoanTypeDAO loanTypeDAO = new LoanTypeDAO();
		loanTypeDAO.updateLoanType(loanTypeVO);
		
		//List ls = loanTypeDAO.searchLoanType(loanTypeVO);
		
		//HttpSession session = request.getSession();
	 //	session.setAttribute("list", ls);
		    
		
		
	}

	private void addLoanType(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	

		  
		String loanType = request.getParameter("loanType");
		String loanDescription = request.getParameter("loanDescription");

		LoanTypeVO loanTypeVO = new LoanTypeVO();
		
		loanTypeVO.setLoanType(loanType);
		loanTypeVO.setLoanDescription(loanDescription);
		
		
		LoanTypeDAO loanTypeDAO = new LoanTypeDAO();
		
		loanTypeDAO.insert(loanTypeVO);
		  
		
				  
		  
		
		
			
		
		
		
	}

}
