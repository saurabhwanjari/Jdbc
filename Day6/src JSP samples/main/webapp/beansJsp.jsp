<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="com.beans.beanspkg.StudentBean" scope="application"></jsp:useBean>

<p>name of the student : </p><jsp:getProperty property="name" name="student"/>
<p>password of the student : </p> <jsp:getProperty property="pwd" name="student"/>

</body>
</html>