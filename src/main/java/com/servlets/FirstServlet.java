package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet  extends HttpServlet{
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException{
		res.setContentType("text/html");
		
	    PrintWriter out = res.getWriter();
	  
	    System.out.println(req);
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");

		String email  = req.getParameter("user_email");

		String gender = req.getParameter("user_gender");

		String condition = req.getParameter("condition");
		
		if(condition != null) {

			out.println("<span>your name is </span>"+ name );
			out.println("<h4>Thanks for registering.....</h4>" );
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("success"); //urlpattern
			requestDispatcher.forward(req,res);
		}
		else {
			out.println("<h2>sorry sir---please fill the form and sign it<h2>");
			
			//include output of index.html
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
			requestDispatcher.include(req,res);
		}
		
		
	}

}
