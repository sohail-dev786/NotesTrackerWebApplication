<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Notes App</title>
<%@include file="All_css_js.jsp" %>
</head>
<body>
	<div class="container-fluid">
		<%@include file="Navbar.jsp"%>
	
	</div>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	%>
	<center class="c1">
		<h1 class="t2">NIIT</h1>
		<h1 class="t2 mt-4">Welcome To Note Tracker Application</h1>
	</center>

			<div class="container text-center">
			
			 <% if(session_username==null)  {%>
				<a class="btn btn-outline-primary mr-3 mt-4 btn-lg" href="Login.jsp">Login</a> 
				<a class="btn btn-outline-primary mt-4 btn-lg" href="Register.jsp">Sign up</a>
			</div>
			<% } %>



</body>
</html>