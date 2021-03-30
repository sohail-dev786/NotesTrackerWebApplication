<%@page import="com.todo.entity.NoteTodo"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.todo.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Notes</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>
	<%@include file="Navbar.jsp"%>
	<center>
		<h1>Edit Notes</h1>
	</center>
	
	<%
		int note_id = Integer.parseInt(request.getParameter("note_id").trim());

		Session sess2 = FactoryProvider.getSessionFactory().openSession();

		NoteTodo notes=sess2.get(NoteTodo.class, note_id);

		sess2.close();
		%>

	<main class="d-flex align-items-center col-md-6 offset-md-3">
		<div class="container ">
			<form action="UpdateNote" method="post">
				
				<div class="form-group">
					<label for="id"><strong>Notes ID</strong></label> <input
						type="text" name="id" required="required" class="form-control" id="id"
						 placeholder="Enter Notes Title" value="<%= notes.getId()%>" readonly="readonly">		
				</div>
			
				<div class="form-group">
					<label for="title"><strong>Notes Title</strong></label> <input
						type="text" name="title" required="required" class="form-control" id="title"
						 placeholder="Enter Notes Title" value="<%= notes.getTitle()%>">		
				</div>
				
				<div class="form-group">
					<label for="description"><strong>Notes Descriptions</strong></label> 
					<textarea rows="6" cols="4"
					class="form-control" name="description" id="description" required="required"
					placeholder="Enter Notes Description"><%= notes.getDescription() %></textarea>
				</div>
		
				<div class="container text-center" >
				<button type="submit" class="btn btn-primary btn-lg">Save</button>
				</div>
			</form>
		</div>
	</main>

</body>
</html>