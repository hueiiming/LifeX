<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="org.json.JSONObject, java.util.Base64" %>
<jsp:include page="addBootstrap.jsp"/>
</head>
<body>
<%
	JSONObject jsonObj = (JSONObject) session.getAttribute("otherUserDetails");
	String pic = (String) session.getAttribute("profilePic");
%>
	<jsp:include page="navbar.jsp"/>
	<div class="container-fluid" style="margin-top: 80px;">
		<img src="data:image/png;base64,<%=pic%>" width="100px" style="border-radius: 50%;"/>
		<h1><%=jsonObj.get("first_name")%> <%=jsonObj.get("last_name")%></h1>
		<h2>@<%=jsonObj.get("username") %></h2>
		<%
		if(!jsonObj.get("friends").equals("")) {
		
		%>
			<h2>Friend request sent. Wait for <%=jsonObj.get("username")%> to approve your friend request.</h2>
		<%
		} else {
		%>
			</form>
			<form action="sendFriendServlet" method="post">
				<input type="submit" name="btnSubmit" value="Send Friend Request">
			</form>
		<%
		}
		%>
	</div>
</body>
</html>