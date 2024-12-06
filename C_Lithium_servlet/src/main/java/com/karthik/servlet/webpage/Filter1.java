package com.karthik.servlet.webpage;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;


public class Filter1 extends HttpFilter implements Filter {
       

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		int aid=Integer.parseInt(request.getParameter("aid"));
		if(aid>1) {
		chain.doFilter(req, response);
		}
		else {
			out.println("Invalid Input");
		}
	
		
		chain.doFilter(req, response);
	}


	
}


