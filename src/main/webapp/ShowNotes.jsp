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
	<%

	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if(session.getAttribute("userEmail")==null)
	{
		response.sendRedirect("Login.jsp");
	}
	%>

	<center>
		<h1>Show Notes</h1>
	</center>

	<main class="d-flex align-items-center col-md-6 offset-md-3">
		<div class="container ">

			<div class="row">
				<div class="col-12">
					<%
					Session session1 = FactoryProvider.getSessionFactory().openSession();

					Query query = session1.createQuery("from NoteTodo");
					List<NoteTodo> noteList = query.list();

					for (NoteTodo note1 : noteList) {
					%>

					<div class="card mt-3">
						<h5 class="card-header bg-primary text-white">NOTES-ID : &nbsp;<%=note1.getId()%></h5>
						<div class="card-body">
							<h3 class="card-title"><%=note1.getTitle()%></h3>
							<p class="card-text p1-4"><%=note1.getDescription()%></p>
							<blockquote class="blockquote mb-0">
								<footer class="blockquote-footer">
									<%= note1.getAddedDate() %>
								</footer>
							</blockquote>
							
							<a href="EditNote.jsp?note_id=<%= note1.getId() %>" class="btn btn-outline-warning text-dark font-weight-bold mr-3 btn-lg">EDIT</a>
							<a href="DeleteNote?note_id=<%= note1.getId() %>"	class="btn btn-outline-danger text-dark font-weight-bold btn-lg">DELETE</a>

						</div>
					</div>

					<%
						}

					session1.close();
					%>
				</div>
			</div>
		</div>
	</main>
</body>
</html>