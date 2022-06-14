<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="addBootstrap.jsp"/>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/navbar.css" type="text/css"></link>
<style type="text/css">
body {
	margin: 0;
	font-weight: 800;
}

.container {
	width: 80%;
	margin: 0 auto;
	
}

header {
  background: #fff;
  box-shadow: 0 2px 2px -2px rgba(0,0,0,.2);
}

header::after {
  content: '';
  display: table;
  clear: both;
}

.logo {
  float: left;
  padding: 10px 0;
}

nav {
  float: right;
}

nav ul {
  margin: 0;
  padding: 0;
  list-style: none;
}

nav li {
  display: inline-block;
  margin-left: 70px;
  padding-top: 23px;

  position: relative;
}

nav a {
  color: #444;
  text-decoration: none;
  text-transform: uppercase;
  font-size: 14px;
}

nav a:hover {
  color: #000;
}

nav a::before {
  content: '';
  display: block;
  height: 5px;
  background-color: #444;

  position: absolute;
  top: 0;
  width: 0%;

  transition: all ease-in-out 250ms;
}

nav a:hover::before {
  width: 100%;
}	

</style>
</head>

<body>
	<header>
		<div class="container">
			<h1 class="logo"></h1>
			<nav >
				<ul>
					<li><a href="Login.jsp">Home</a></li>
					<li><a href="Login.jsp">Login</a></li>
					<li><a href="registration.jsp">Signup</a></li>
				</ul>
			</nav>
		</div>
	</header>
  
</body>
</html>