package com.karthik.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Employee extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		
		String id =(String) session.getAttribute("id");
		String name  = (String) session.getAttribute("name");
		int age = (int) session.getAttribute("age");
		
		PrintWriter out = response.getWriter();
		out.println(id );
		out.println("<br>");
		out.println(name);
		out.println("<br>");
		out.println(age);
		session.removeAttribute("id");  // we can remove the session by removing the attribute
		
		
	}



}
