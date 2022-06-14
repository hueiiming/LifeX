package servlets;

import java.io.IOException;
import java.sql.Blob;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class OtherUsersDetails
 */
@WebServlet("/OtherUserDetails")
public class OtherUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OtherUserDetails() {
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
		HttpSession session = request.getSession(true);
		String username = request.getParameter("btnClicked");
		int index = Integer.valueOf(request.getParameter("indexUser"));
		JSONArray allUsersList = (JSONArray) session.getAttribute("allUsers");
		JSONObject obj = new JSONObject();
		try {
			for(int i = 0; i < allUsersList.length(); i++) {
				if(i == index) {
					obj = allUsersList.getJSONObject(i);
				}
			}
			Blob blob = (Blob) obj.get("profile_pic");
			int len = (int) blob.length();
			byte[] buf = blob.getBytes(1, len);	
			byte[] encodeBase64 = Base64.getEncoder().encode(buf);
			String base64Encoded = new String(encodeBase64, "UTF-8");
			session.setAttribute("otherUserDetails", obj);
			session.setAttribute("profilePic", base64Encoded);
			response.sendRedirect("otherUserDetails.jsp");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
