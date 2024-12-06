package com.karthik.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	PrintWriter out = response.getWriter();
	out.println("<h1>Hello world</h1>");
//	int a = (int) request.getAttribute("a");  // for request dispatcher
//	int b = (int) request.getAttribute("b");// for request dispatcher
	
	
	int a = Integer.parseInt(request.getParameter("a"));
	int b= Integer.parseInt(request.getParameter("b"));
	
	out.println(a+b);
			
	
	
	
	
	}

	
}
