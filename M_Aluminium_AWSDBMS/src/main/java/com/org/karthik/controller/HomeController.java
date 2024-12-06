package com.org.karthik.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.karthik.model.DBMS;

@RestController
public class HomeController {
	
	
	@GetMapping("/load")
	public List<DBMS> getdetails() {
		
		return List.of(new DBMS(101,"Java Developer",1,"Fresheres can apply for it"),
				new DBMS(102,"Python Developer",1,"Fresheres can apply for it"),
				new DBMS(103,"DevOps",3,"Fresheres can apply for it"),
				new DBMS(104,"Front End Developer",1,"Fresheres can apply for it"));
	}
	@GetMapping("/")
	public String webPage() {
		
		return "Welcome to the jobPost";
	
	}
	
}
