<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="addBootstrap.jsp"/>
<jsp:include page="navbar2.jsp"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/forgetPassword.css" type="text/css"></link>

</head>
<body>
	<div class="container-fluid bigBox">
		<div class="row">
			<div class="col-md-1">
	
			</div>
			<div class="col-md-10">
				<div class="box2">
					<div class="box1">
					
					</div>
					<div class="box3">
					<h2 class="txt1">Reset Password</h2>
					<p class="txt1">We can help you reset your password using the email address linked to your LifeX account.</p>
					<form action="ResetServlet" method="post">
						<div class="enter">
							<div style="color:red">${errorMessage}</div>
							<b>Enter Email</b> &nbsp;&nbsp;&nbsp;<input id="message" type="text" name="resetPassword">
						</div>
						<input type="submit" id="resetBtn" name="resetBtn" value="Reset Password" >
					</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
	$(document).ready(function(){
		$('#resetBtn').attr('disabled',true);
		$('#message').keyup(function(){
		  if($(this).val().length !=0)
		      $('#resetBtn').attr('disabled', false);            
		  else
		      $('#resetBtn').attr('disabled',true);
		});
	});
</script>
</body>
</html>