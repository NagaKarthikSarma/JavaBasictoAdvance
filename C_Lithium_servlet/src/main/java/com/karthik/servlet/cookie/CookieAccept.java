package com.karthik.servlet.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CookieAccept extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookies [] = request.getCookies();
		int z=0;
		
		for (Cookie ck: cookies)
		{
			if (ck.getName().equals("k")) {
				z=Integer.parseInt(ck.getValue());
				
			}
			
		}
		
		PrintWriter out= response.getWriter();
		out.println("the vlaue of mul: "+z*z);
	}


}
