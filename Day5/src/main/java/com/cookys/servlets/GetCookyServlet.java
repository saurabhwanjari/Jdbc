package com.cookys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getcooky")
public class GetCookyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = "" , site = "";
		
		Cookie[] arr = request.getCookies();
		
		for(Cookie c : arr) {
			if(c.getName().equals("namecooky"))
				uname = c.getValue();
			
			if(c.getName().equals("sitecooky"))
				site = c.getValue();
		}
		
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Get Cooky Page</title>");
		
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>Your Name : " + uname + "</p>");
		pw.println("<p>Your Favorite WebSite : " + site + "</p>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
