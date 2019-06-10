package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoanStaffDAO;
import DAO.LoginDAO;
import VO.LoanStaffVO;
import VO.LoginVO;
import utils.BaseMethod;

/**
 * Servlet implementation class LoanStaffController
 */
@WebServlet("/LoanStaffController")
public class LoanStaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoanStaffController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		String birthDate=request.getParameter("bdate");
		String address=request.getParameter("address");
		
		
		BaseMethod baseMethod = new BaseMethod();
		String password  =  baseMethod.generatePassword();
		
		baseMethod.sendMail(email, password,firstName);
		
		
		
		
		LoginVO loginVO = new LoginVO();
			loginVO.setEmail(email);
			loginVO.setPassword(password);
			loginVO.setRole("ROLE_STAFF");
		
		LoginDAO loginDAO = new LoginDAO();
			loginDAO.insert(loginVO);
			
		
		LoanStaffVO loanStaffVO =new LoanStaffVO();
		loanStaffVO.setFirstName(firstName);
		loanStaffVO.setLastName(lastName);	
		loanStaffVO.setGender(gender);
		loanStaffVO.setNumber(phone);
		loanStaffVO.setAddress(address);
		loanStaffVO.setBirthDate(birthDate);
		loanStaffVO.setLoginVO(loginVO);
			
		LoanStaffDAO loanStaffDAO =new LoanStaffDAO();
			loanStaffDAO.insert(loanStaffVO);
		
			
			
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String flag =request.getParameter("flag");
		if(flag.equals("insert"))
		{
		insert(request,response);	
		response.sendRedirect("admin/addLoanStaff.jsp");
		}
		}
	}


