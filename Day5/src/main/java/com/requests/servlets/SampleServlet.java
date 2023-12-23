package com.requests.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = {"/sample"},
initParams=@WebInitParam (name="params",value="Good evening"))
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ServletContext context= getServletContext();
		String msg=context.getInitParameter("MESSAGE");
		
		System.out.println("................"+msg);
		pw.println("<body>"); 
		pw.println("<h3> Welcome : THE MESSAGE IS from context  "+msg+ "</h3>");
		
		ServletConfig config= getServletConfig();
		String initmsg=config.getInitParameter("params");
		
		System.out.println("................"+initmsg);
		pw.println("<body>"); 
		pw.println("<h3> Welcome : THE MESSAGE from config IS "+initmsg+ "</h3>");
		
		
	}

}
