<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String first_name=request.getParameter("fname");
String id=request.getParameter("id");
System.out.println(first_name+"\n"+id);
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/des","root","root");
System.out.println("connected............");
Statement st=c.createStatement();
int i=st.executeUpdate("insert into users values('"+first_name+"','"+id+"')");
//System.out.println("........................."+i);
//out.println("Data is successfully inserted!");
//response.setContentType("text/plain");
response.getWriter().write("success");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>