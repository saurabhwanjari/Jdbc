package com.cookys.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/accept")

public class SetCookyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = request.getParameter("txtUname");
		String choice = request.getParameter("radSite");
		String site = "";
		
		switch(choice) {
			case "f" :
					site = "www.facebook.com";
					break;
			case "i" :
					site = "www.instagram.com";
					break;
			case "t" :
					site = "www.twitter.com";
					break;	
		}
		
		Cookie cn = new Cookie("namecooky", uname);
		Cookie cs = new Cookie("sitecooky", site);
		
		cn.setMaxAge(120);
		cs.setMaxAge(120);
		
		response.addCookie(cn);
		response.addCookie(cs);
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Set Cooky Page</title>");
		
		pw.println("</head>");
		pw.println("<body>");
		
		pw.println("<p>Click <a href=\"getcooky\">here</a> "
				+ "to view your cookies</p>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
	}

	

}
