package common;

public class ResetEmailMsg {
	
	public static String message(String username, String url) {
		return "<table style='margin: auto;'>\r\n" + 
				"		<tr><td style='font-size: 20px;'>LifeX</td></tr>\r\n" + 
				"		<tr><td style='border: 0.1px solid #ddd; width: 100px; height: 0px;' ></td></tr>\r\n" + 
				"		<tbody style='color: #565a5c;'>\r\n" + 
				"			<tr style='font-size: 20px;'>\r\n" + 
				"				<td>\r\n" + 
				"					<p>Hi, " +  username + "</p>\r\n"  +
				"					<p>We got a request to reset your LifeX password.</p>\r\n" + 
				"				</td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr><td></td></tr>\r\n" + 
				"			<tr><td><a href='"+ url + "'<button style=' border-collapse: collapse;\r\n" + 
				"    border-radius: 3px;\r\n" + 
				"    text-align: center;\r\n" + 
				"    display: block;\r\n" + 
				"    border: solid 1px #009fdf;\r\n" + 
				"    padding: 10px 16px 14px 16px;\r\n" + 
				"    min-width: 80px;\r\n" + 
				"    text-decoration: none;\r\n" + 
				"    color: #fff;\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    background-color: #47a2ea;'>Reset Your Password</button><a></td></tr>\r\n" + 
				"			<tr><td><p>If you ignore this message, your password will not be changed. If you didn't request a password reset, let us know.</p></td></tr>\r\n" + 
				"	</table>";
	}

}
