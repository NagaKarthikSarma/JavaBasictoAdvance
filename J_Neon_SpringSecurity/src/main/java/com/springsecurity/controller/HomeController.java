package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.repository.UserRepo;
import com.springsecurity.user.UserCredentials;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String shello() {
		
		return "Hello";
	}

	@GetMapping("/csrf")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return  (CsrfToken) request.getAttribute("_csrf");
		
	}
	
	@Autowired
	UserRepo repo; 
	
	@PostMapping("/add")
	public UserCredentials addDetails(@RequestBody UserCredentials user) {
		
		System.out.println("usercredentials");
		return	repo.save(user);
		  
	}
	@GetMapping("/getall")
	public List<UserCredentials> getAll(){
		
		return repo.findAll();
	}
	
	
}
