<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="addBootstrap.jsp"/>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/navbar.css" type="text/css"></link>
<style type="text/css">

.navbar {
  overflow: hidden;
  background-image: url(images/pexels-miguel-?-padri??n-19670.jpg);
  position: fixed; /* Set the navbar to fixed position */
  top: 0; /* Position the navbar at the top of the page */
  width: 100%; /* Full width */
  box-shadow: 0 2px 2px -2px rgba(0,0,0,.2);
}

.navbar a {
  margin: 0;
  padding: 0;
  list-style: none;
}

.navbar a {
  display: inline-block;
  margin-left: 70px;
  padding-top: 23px;

  position: relative;
}

.navbar a {
  color: #444;
  text-decoration: none;
  text-transform: uppercase;
  font-size: 14px;
}

.navbar a:hover {
  color: #000;
}

.navbar a::before {
  content: '';
  display: block;
  height: 5px;
  background-color: #444;

  position: absolute;
  top: 0;
  width: 0%;

  transition: all ease-in-out 250ms;
}

.navbar a:hover::before {
  width: 100%;
}	
</style>
</head>

<body>

 <div class="navbar navbar-fixed-top">
 	<a href="RedirectHmPage">Home</a>
 	<a href="#">E-Wallet</a>
 	<a href="#">Fashion</a>
 	<a href="#">Chat</a>
 	<a href="redirectProfile">Profile</a>
 </div>

 
</body>
</html>