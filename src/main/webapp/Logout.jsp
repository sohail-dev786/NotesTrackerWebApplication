<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	
	HttpSession session1=request.getSession();
	session1.removeAttribute("userEmail");
	session1.invalidate();
	
	response.sendRedirect("index.jsp");

	%>
</body>
</html>