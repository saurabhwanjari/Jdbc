<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
out.print("User : "+request.getParameter("uid"));%>
	<jsp:include page="welcome.jsp">
	<jsp:param value="name" name="name"/>


	</jsp:include>

</body>
</html>