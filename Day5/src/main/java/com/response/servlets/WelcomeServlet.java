package com.response.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "welcome", urlPatterns = { "/welcome" })
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("txtUserName");
		pw.println("<body>");
		pw.println("<h3> Welcome from WelcomeServlet   :   <br> user name is :" + userName + "</h3>");
		pw.println("</body>");

	}

}
