package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class St2 extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		Cookie c = new Cookie("name", username);
		Cookie c1 = new Cookie("name2", "pp");
		response.addCookie(c);
		response.addCookie(c1);
		out.println("<h1>hello mrs...."+ username +"</h1>");
		out.println("<a href='st3'>go there</a>");
		
		
	}

}
