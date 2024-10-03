package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res )throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
	     String s1 = req.getParameter("n1");
		String s2 = req.getParameter("n2");
		
		int a = Integer.valueOf(s1);
		int b = Integer.valueOf(s2);
		int c = a+b;
		
		
		req.setAttribute("sum",c);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("s2");
		requestDispatcher.forward(req, res);
		
		
	}
}
