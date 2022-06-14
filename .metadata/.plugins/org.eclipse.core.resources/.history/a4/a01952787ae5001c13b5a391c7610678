package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import config.DaoStaticNames;
import config.HashPassword;
import dao.DAO;
import models.User;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		User user = new User();

		HashPassword hashPassword = new HashPassword();
		
		user.setUsername(request.getParameter(DaoStaticNames.USERNAME));
		user.setEmail(request.getParameter(DaoStaticNames.EMAIL));
		user.setFirstName(request.getParameter(DaoStaticNames.FIRST_NAME));
		user.setLastName(request.getParameter(DaoStaticNames.LAST_NAME));
		String password = request.getParameter(DaoStaticNames.PASSWORD);
		String checkPassword = request.getParameter(DaoStaticNames.C_PASSWORD);
		
		HttpSession session = request.getSession(true);
		
		try {
			DAO dao = new DAO();
			boolean checkUsername = dao.checkDuplicate(DaoStaticNames.USERNAME, user.getUsername());
			boolean checkEmail = dao.checkDuplicate(DaoStaticNames.EMAIL, user.getEmail());

			if(checkUsername == true) {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("Username Already Exists");
			} 
			
			if(checkEmail == true) {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("Email Already Exists");
			} 

			user.setPassword(hashPassword.hashPassword(password));
			dao.regUser(user);
			response.sendRedirect("Login.jsp");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
