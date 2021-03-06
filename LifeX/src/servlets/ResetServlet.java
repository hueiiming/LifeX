package servlets;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utils.DateUtil;
import common.PropertiesEmail;
import common.ResetEmailMsg;
import common.TokenGenerator;
import config.DaoStaticNames;
import config.EmailConstants;
import dao.DAO;

/**
 * Servlet implementation class resetServlet
 */
@WebServlet("/ResetServlet")
public class ResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String SMTP = "smtp";

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetServlet() {
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
//		doGet(request, response);
		String email = request.getParameter(DaoStaticNames.RESET_PASSOWRD);
		Properties props = new Properties();
		try {
			DAO dao = new DAO();			
			String username = dao.getUsername(email);
			if(dao.checkDuplicate(DaoStaticNames.EMAIL, email)) {
				String html = EmailConstants.URL + TokenGenerator.unique();
				props = PropertiesEmail.setEmailProperties();
				Session session = Session.getInstance(props, new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(EmailConstants.EMAIL, EmailConstants.PASSWORD);
					}
				});
				Message msg = new MimeMessage(session);
				msg.setFrom(new InternetAddress(EmailConstants.EMAIL));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
				msg.setSubject(EmailConstants.SUBJECT);
				msg.setText(ResetEmailMsg.message(username, html));
				Transport.send(msg);
				dao.updateTokenNTimestamp(TokenGenerator.unique(), DateUtil.getCurrentTimestamp(), email);
				System.out.println("Email sent successfully");
				response.sendRedirect("aftReset.jsp");

			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
