<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="org.json.JSONArray, org.json.JSONObject, Utils.GetImage" %>
<jsp:include page="addBootstrap.jsp"/>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Expires", "0"); //Proxies

if(session.getAttribute("username") == null) {
	request.getRequestDispatcher("Login.jsp").forward(request,response);
}


%>
<style type="text/css">
#myInput {
	width: 100%;
	font-size: 18px;
	padding: 11px;
	border:1px solid #ddd;
}

#myTable {
	border: 1px solid #fff;
	background-color: #fff;
	overflow-y: scroll;
}

.btnSel {
    background-color: #fff;
    border: none;
    color: #000;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

</style>
</head>
<body style="background-color: #fafafa;">
<jsp:include page="navbar.jsp"/>
	<div class="container-fluid" style="margin-top: 80px;">
		<div class="row">
			<div class="col-md-4">
			</div>
			<div class="col-md-4 text-center">
				<h1>Search for username</h1>
				<input type="text" id="myInput" onkeyup="ContactsearchFX()" autocomplete="off" placeholder="Search for users..">
				<br>
				<br>
				<%
				
				JSONArray allUsersList = (JSONArray) session.getAttribute("allUsers");
				
				if(allUsersList.length() == 0) {
				
				} else {
				
				%>
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<table id="myTable" class="ard">
							
					<%
					for(int i = 0; i < allUsersList.length(); i++) {
						JSONObject jsonObj = allUsersList.getJSONObject(i);
					%>
						<form action="OtherUserDetails" method="post">
							<tr>
								<td>
									<div style="background-color: #fff; border-bottom: 1px solid #fafafa; width: 200px;">
										<img src="data:image/png;base64,<%=GetImage.getImage(jsonObj)%>" width="50px" style="border-radius: 50%; position: absolute; left: 10px;"/>
										<input class="btnSel" type="submit" name="btnClicked" value="<%=jsonObj.get("username")%>">	
										<input id="userID" type="hidden" name="indexUser" value="<%=i%>">
									</div>
								</td>
							</tr>
						</form>
							
					<%
					}
					%>
					</table>
				</div>
				<%
				}
				%>
				</div>
			</div>
		</div>
	
	
<script type="text/javascript" language="javascript">
	window.onload = function() {
		var rows = document.querySelectorAll('tr:not(.header)');

		for (var i = 0; i < rows.length; i++) {
		  rows[i].style.display = 'none';
		}
	}

	function ContactsearchFX() {
	  var input, filter, table, tr, td, i;
	 
	  input = document.getElementById("myInput");

	  filter = input.value.toUpperCase();
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");
	  for (i = 0; i < tr.length; i++) {
	  	td = tr[i].getElementsByTagName("td")[0];
	    if (td) {
	      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";

	      }
	    }
	  }
	  
	   var rows = document.querySelectorAll('tr:not(.header)');
	   
	   if (input.value.length == 0) {
	    for (var i = 0; i < rows.length; i++) {
	      rows[i].style.display = 'none';
	    }
	  }
}
	
</script>
</body>
</html>