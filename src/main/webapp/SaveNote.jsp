<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Notes</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>

	<%@include file="Navbar.jsp"%>
	<%

	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if(session.getAttribute("userEmail")==null)
	{
		response.sendRedirect("Login.jsp");
	}
	%>


	<h1 style="text-align: center; color: blue; margin-top: 30px">
		 NOTES ADDEDD SUCCESS FULLY !!</h1>
	<div class="container text-center">
		<a href="AddNote.jsp"><button type="submit" class="btn btn-outline-primary btn-lg mt-4"> Add More</button></a>
	</div>
	<div class="container text-center">
		<a href="ShowNotes.jsp"><button type="submit" class="btn btn-outline-primary btn-lg mt-4"> Show Notes</button></a>
	</div>
	

</body>
</html>