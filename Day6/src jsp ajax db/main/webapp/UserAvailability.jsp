<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%
	Connection c = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dacsept23", "root", "root");
		System.out.println("Opened database successfully");

		String userName = request.getParameter("user");
		String id = request.getParameter("txtId");
		System.out.println("............" + userName);
		stmt = c.prepareStatement("select * from users where username='" + userName + "'"); // this is for name
		rs = stmt.executeQuery();
		if (rs.next()) {
			out.println("<font color=red>");
			out.println("Name already taken");
			out.println("</font>");

		} else {

			out.println("<font color=green>");
			out.println("Available");
			out.println("</font>");

		}

		stmt.close();
		c.close();
	} catch (SQLException e) {
		System.out.println(e);
	}
	%>

</body>
</html>