<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="addBootstrap.jsp"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/registration.css" type="text/css"></link>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if (session.getAttribute("username") != null) {
	request.getRequestDispatcher("HomePage.jsp").forward(request, response);	
}

%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type='submit']:disabled{
	cursor: not-allowed !important;
	opacity: .3 !important;
}

input:focus ~ .floating-label,
input:not(:focus):valid ~ .floating-label{
  top: 182px;
  left: 515px;
  font-size: 9px;
  opacity: 1;
}

.floating-label {
  position: absolute;
  pointer-events: none;
  left: 515px;
  top: 185px;
  transition: 0.2s ease all;
}
</style>
</head>
<body>

	<div class="container-fluid">
		<div class="registerInbox">
			<h1>LifeX</h1>
			<p style="text-align: center;"><em>Sign up to become a better version of yourself.</em></p>
			<br>
			<form action="RegServlet" method="post" id="regForm">
				<table>
					<tr><td><p id="emailResult" style="color: red;"></p></td></tr>
					<tr><td><input type="text" id="email" name="email" placeholder="Email Address" required></td></tr>
					<tr><td><p id="usernameResult" style="color: red;"></p></td></tr>
					<tr><td><input id="username" type="text" name="username" placeholder="Username" required></td></tr>
					<tr><td><input id="firstName" type="text" name="first_name" placeholder="First Name" required></td></tr>
					<tr><td><input id="lastName" type="text" name="last_name" placeholder="Last Name" required></td></tr>
					<tr><td><input id="password" type="password" name="password" placeholder="Password" required></td></tr>
					<tr><td><p id="passResult" style="color: red"></p></td></tr>
					<tr><td><input id="cPassword" type="password" name="cPassword" placeholder="Re-enter Password" required></td></tr>
				</table>
				<input id="signUp" type="submit" name="btnSubmit" value="Sign up" disabled="disabled">
				<br>
				<div class="tandc">
					<em style="color:darkgrey;">By signing up, you agree to our</em> <p>Terms, Data Policy</p> <em style="color:darkgrey;">and</em> <p>Cookies Policy.</p>
				</div>
			</form>
		</div>
	</div>
	<div class="container-fluid">
		<div class="goBack">
			<p style="font-size: 14px; text-align: center; padding: 10px;">Already have an account?<a style="text-decoration: none; color: blue" href="Login.jsp"> &nbsp&nbspLogin</a></p>
		</div>
	</div>
	<script>
		$(document).ready(function(){
			$('#email').change(function(){
				var email = $('#email').val();
				
				$.ajax({
					type:'POST',
					data:{email:email},
					url:'CheckUsernameEmailServlet',
					success: function(result) {
						console.log(result);
						if(result == 'Email Already Exists') {
							$('#emailResult').html(result);
						    $("#signUp").prop("disabled", true);    
						} else {
							$('#emailResult').html('');
						    $("#signUp").prop("disabled", false);    
						}
					}
				});
			});
			$('#username').change(function(){
				var username = $('#username').val();
				
				$.ajax({
					type:'POST',
					data:{username:username},
					url:'CheckUsernameEmailServlet',
					success: function(result) {
						console.log(result);
						if(result == 'Username Already Exists') {
							$('#usernameResult').html(result);
						    $("#signUp").prop("disabled", true);    
						} else {
							$('#usernameResult').html('');
						    $("#signUp").prop("disabled", false);    
						}
					}
				});
			});
			$('#password, #cPassword').on('keyup', function () {
				  if ($('#password').val() == $('#cPassword').val()) {
				    $('#passResult').html('');
				    $("#signUp").prop("disabled", false);    
				  } else {
				    $('#passResult').html('Password Doesn\'t\ match');
				    $("#signUp").prop("disabled", true);    
				}});
			});
		
		
	</script>
</body>
</html>