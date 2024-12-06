package com.karthik.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Sessionimplement extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		String id ="ad42746";
		String name  = "karthik";
		int age = 22;
		
		session.setAttribute("id", id);

		session.setAttribute("name", name);

		session.setAttribute("age", age);
		
		response.sendRedirect("Employee");
		
		
		
		
	}

	

}
