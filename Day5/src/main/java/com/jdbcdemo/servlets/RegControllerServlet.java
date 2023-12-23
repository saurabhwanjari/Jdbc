package com.jdbcdemo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;

import com.jdbcdemo.dao.UserDao;
import com.jdbcdemo.daoimpl.UserDaoImpl;
import com.jdbcdemo.pojo.User;

@WebServlet(urlPatterns = "/reguser")
public class RegControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname=request.getParameter("txtUserName");
		String upass=request.getParameter("txtPassword");
		User user =new User();
		user.setUsername(uname);
		user.setPassword(upass);
		UserDao daoImpl= new UserDaoImpl();
		
	 if (daoImpl.addNewUser(user))
	 {
		 pw.println("<body>"); 
		pw.println("<h3> Registration success :" + uname +"</h3>");
	 }
	 else
	 {
		 response.sendRedirect("registerJdbc.html");
		 
	 }
	 
	 
		
	}


	}


