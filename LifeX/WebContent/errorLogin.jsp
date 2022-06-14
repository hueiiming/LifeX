<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="addBootstrap.jsp" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="cache-control" content="private, max-age=0, no-cache">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="expires" content="0">
<title>Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css"></link>

<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if (session.getAttribute("username") != null) {
	request.getRequestDispatcher("HomePage.jsp").forward(request, response);	
}

%>

</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6 col-sm-6">
				<img style="position: absolute; top: 80px; left: 20%;" src="${pageContext.request.contextPath}/images/lifestyle.jpg" width="100%">
			</div>
			<div class="col-md-6 col-sm-6">
				<div class="logInbox">
					<form action="LoginServlet" method="post">
						<h1>LifeX</h1>
						<input type="text" name="username" placeholder="Enter Username"
							autocomplete="off"> <input type="password"
							name="password" placeholder="Enter Password">
						<div style="color: red">Invalid Username and Password!\n Please try again.</div>
						<input type="submit" name="btnSubmit" value="Login"> <a
							href="forgetPassword.jsp">Lost your password?</a><br> <a
							href="registration.jsp">Don't have an account?</a>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>