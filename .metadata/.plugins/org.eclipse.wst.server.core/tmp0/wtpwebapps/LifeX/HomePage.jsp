<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/homePageCSS.css" type="text/css"></link>
	<%@page import="models.User" %>
	<%User myUser = (User) session.getAttribute("User_Info");%>
	<jsp:include page="addBootstrap.jsp"/>
	<title>Home</title>

<style type="text/css">
	@charset "ISO-8859-1";
	
	body {
		background-color: #FFF9ED !important; 
		background-size: cover;
		background-position: center;
	}
	
	::-webkit-scrollbar {
		display: none;
	}
	
	.col-md-12 >.text-center {
		font-family: 'Josefin Sans', sans-serif;
		padding: 20px;
	}
	
	.container-fluid .row .text-center {
		padding: 17px;
	}
	
	.container-fluid .row .text-center .shadowBox > h4 {
		font-family: 'Yanone Kaffeesatz', sans-serif;
		font-size: 30px;
	}
	
	.container-fluid .row .text-center .shadowBox > h6 {
		font-family: 'Quicksand', sans-serif;
		font-size: 20px;
	}
	
	#second {
		background-image: url(images/pexels-photo-1122405.jpeg);
		background-size: auto;
		background-position: center center;
		color: white;
		padding: 30px;
		border-radius: 10px;
	}
	
	.shadowBox:hover {
		background: rgba(0, 0, 0, 0.7);
		border-radius: 10px;
		transition: background 1s ease-in-out;
		border: 2px solid white;
	}
	
	#facebook {
		padding: 2rem;
		font-size: 4.5em;
		color: #3B5998; 
	}
	
	#twitter {
		padding: 2rem;
		font-size: 4.5em;
		color: #00ACED;
	}
	
	#snapchat {
		padding: 2rem;
		font-size: 4.5em;
		color: #000000;
	}
	
	#instagram {
		padding: 2rem;
		font-size: 4.5em;
		color: #c32aa3;
	}
	
	#youtube {
		padding: 2rem;
		font-size: 4.5em;
		color: #BB0000;
	}
	
	#twitter:hover, #instagram:hover{
		transition: color 0.5s ease;
		color: #fd1d1d;
	}
	
	#facebook:hover, #snapchat:hover, #youtube:hover{
		transition: color 0.5s ease;
		color: #fc466b;
	}
</style>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if (session.getAttribute("username") == null) {
	request.getRequestDispatcher("Login.jsp").forward(request, response);	
}

%>
</head>
<!-- Description -->
<body>
<jsp:include page="navbar.jsp"/>

	<div class="container-fluid" style="padding-top: 50px;">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center" style="font-family: 'Pacifico', cursive;">Welcome To LifeX, ${username} </h1>
				
				<form action="openRequest" method="post">
					<p style="color: red; font-weight: bold;">You have 
				<input type="submit" value="${totalRequest}" name="btnSubmit"> friend requests</p>
				</form>
				<form action="logoutServlet">
					<input type="submit" name="logout" value="Logout">
				</form>
			</div>
	</div>
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center">LifeX is an Intellectual, All-In-One Web-Application that aids Teenagers' to improve their Life Management Skills.</h2>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
			</div>
			<div class="col-md-4 text-center" id="second">
				<form action="" method="post">
					<div class="col-md-12 shadowBox">
							<input type="image" onclick="form.action='RedirectFriends';" src="images/applouse-xxl.png" style="max-width: 25%; height: auto;">
						<h4>#Friends @Huei Ming</h4>
						<h6><strong>Connect</strong> with people around you</h6>
					</div>
				</form>
			</div>
			<div class="col-md-4">
			</div>
		</div>
	</div>
		<!-- Connect -->
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12 text-center" style="padding: 10px;">
					<h1 style="font-family: 'Pacifico', cursive;">Connect With Us</h1>
				</div>
				<div class="col-md-12 text-center" style="padding: 10px;">
					<a href="#"><i class="fa fa-facebook" id="facebook"></i></a>
					<a href="#"><i class="fa fa-twitter" id="twitter"></i></a>
					<a href="#"><i class="fa fa-snapchat" id="snapchat"></i></a>
					<a href="#"><i class="fa fa-instagram" id="instagram"></i></a>
					<a href="#"><i class="fa fa-youtube" id="youtube"></i></a>
				</div>
			</div>
		</div>

<!-- Footer -->
<jsp:include page="footer.jsp"/>
</body>
</html>