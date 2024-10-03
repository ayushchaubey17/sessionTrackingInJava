package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class St3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cookie [] c = request.getCookies();
		
		PrintWriter out = response.getWriter();
		String p = request.getParameter("name");
		if(c!=null) {
			for(Cookie el: c) {
				String cookieName = el.getName();
				if(cookieName.equals("name")) p=el.getValue();
				

				System.out.println(cookieName+" "+el.getValue());
				
			}
			
		}
		out.println("<h1>hello mrs...."+ p +"</h1>");
	}

}
