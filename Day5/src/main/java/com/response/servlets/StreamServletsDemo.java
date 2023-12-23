package com.response.servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "streamdemo", urlPatterns = { "/streamdemo" })
public class StreamServletsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jpeg");
		ServletOutputStream out;
		out=  response.getOutputStream();
		FileInputStream img = new FileInputStream(request.getServletContext().getRealPath("/") + "images/cdacimg.jpg");
		BufferedInputStream bis = new BufferedInputStream(img);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int ch = 0;
		while ((ch = bis.read()) != -1)

		{
			bout.write(ch);
		}
		img.close();
		bout.close();
		
	}

}
