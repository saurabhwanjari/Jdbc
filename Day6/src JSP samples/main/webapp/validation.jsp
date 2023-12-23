<html>
<head> <title> Validation JSP Page</title>
</head>
<body>
<% 
String id=request.getParameter("uid");
String pass=request.getParameter("upass");
out.println("hello "+id);
pageContext.setAttribute("UName", id, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("UPassword", pass, PageContext.REQUEST_SCOPE);
%>
<a href="display.jsp">Click here to see what you have entered </a>
</body>
</html>