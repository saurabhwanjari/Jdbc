package com.requests.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("txtUserName");
		String password = request.getParameter("txtPassword");
		ServletContext context= getServletContext();
		String msg=context.getInitParameter("MESSAGE");
		System.out.println("................"+msg);
		pw.println("<body>"); 
		pw.println("<h3> Welcome :" + userName +" THE MESSAGE IS "+msg+ "</h3>");
		
		// serverside redirection
		/*
		 * if (userName.equals("cdac") && password.equals("1234")) {
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("welcome");
		 * rd.forward(request, response);
		 * 
		 * }
		 * 
		 * else { try { pw.print("User name/Password is incorrect"); RequestDispatcher
		 * rd = request.getRequestDispatcher("logout.html"); rd.include(request,
		 * response);
		 * 
		 * } finally { pw.close(); }
		 * 
		 * }
		 */
		
		

		// sendRedirect() code follows
		/*
		 * if (userName.equals("cdac") && password.equals("1234")) {
		 * pw.println("<body>"); pw.println("<h3> Welcome :" + userName + "</h3>");
		 * pw.println("</body>"); } else { try { // client side redirection
		 * response.sendRedirect("https://www.google.com"); } finally { pw.close(); }
		 * 
		 * }
		 */
	}

}
