package com.karthik.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
	
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<h1> Hello </h1>");
		int a=5;
	int b=6;
		
		response.sendRedirect("SecondServlet?a="+a+"&b="+b);
//		int a=5;
//		int b=6;
//		request.setAttribute("a", a);
//		
//		request.setAttribute("b", b);
//		
//		RequestDispatcher rd  = request.getRequestDispatcher("/SecondServlet");
//		
//		rd.forward(request, response);
//		
//		
		
		
		
		
	}


}
