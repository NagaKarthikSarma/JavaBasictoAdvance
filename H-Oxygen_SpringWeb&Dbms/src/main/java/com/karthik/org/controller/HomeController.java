package com.karthik.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello iam karthik");
		return "Hello";
	}
	
	// request param
	
	@GetMapping("/param")
	public String param(@RequestParam("a") int num1,@RequestParam("b") int num2, Model model) {
// URL must be specified like this http://localhost:8080/param?a=34&b=45
	    // No need to create a separate variable for num1
	    model.addAttribute("num", num1);

	    System.out.println("hello iam param" + num1);
	    return "param";
	}
	
	
}
