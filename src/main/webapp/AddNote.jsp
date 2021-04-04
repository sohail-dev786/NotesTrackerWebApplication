<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
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
	

	<center>
		<h1>Add Notes</h1>
	</center>

	<main class="d-flex align-items-center col-md-6 offset-md-3">
		<div class="container ">
			<form action="SaveNote" method="post">
				<div class="form-group">
					<label for="title"><strong>Notes Title</strong></label> <input
						type="text" name="title" required="required" class="form-control"
						id="title" placeholder="Enter Notes Title" autocomplete="off">
				</div>

				<div class="form-group">
					<label for="description"><strong>Notes
							Descriptions</strong></label>
					<textarea rows="6" cols="4" class="form-control" name="description"
						id="description" required="required"
						placeholder="Enter Notes Description"></textarea>
				</div>

				<div class="container text-center">
					<button type="submit" class="btn btn-primary btn-lg">Save</button>
				</div>
			</form>
		</div>
	</main>

</body>
</html>