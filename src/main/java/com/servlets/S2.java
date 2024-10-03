package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res )throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
	     String s1 = req.getParameter("n1");
		String s2 = req.getParameter("n2");
		
		int a = Integer.valueOf(s1);
		int b = Integer.valueOf(s2);
		int p = a*b;
		
		
	   int sum = (int) req.getAttribute("sum");
	   out.print("<h1>");
	   
	   out.print("sum is :"+sum);
	   out.print("<h1>");
	   out.print("<h1>");
	   
	   
	   
	   out.print(" and PRODUCT IS: "+p);
	   
	   out.print("</h1>");

		
		
	}
}
