package com.karthik.servlet.webpage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class addAliean extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		int aid=Integer.parseInt(request.getParameter("aid"));
		String aname=(request.getParameter("aname"));
		out.println("hello succesfully logged in");
		
		
	}

	
}
