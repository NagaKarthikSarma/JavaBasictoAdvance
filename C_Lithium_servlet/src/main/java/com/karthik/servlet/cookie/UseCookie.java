package com.karthik.servlet.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



public class UseCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int c = 45;
		Cookie cookie =new Cookie("k",c+"");
		response.addCookie(cookie);

		response.sendRedirect("CookieAccept");
		
	}

}
