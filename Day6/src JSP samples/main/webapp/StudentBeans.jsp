<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%String name =request.getParameter("uid");
String password =request.getParameter("upass");
%>  
<jsp:useBean id="student" class="com.beans.beanspkg.StudentBean" scope="application"></jsp:useBean>
<jsp:setProperty property="name" name="student" value="<%=name %>"/>
<jsp:setProperty property="pwd" name="student" value=<%=password %>"/>


<jsp:include page="beansJsp.jsp"></jsp:include>

</body>
</html>