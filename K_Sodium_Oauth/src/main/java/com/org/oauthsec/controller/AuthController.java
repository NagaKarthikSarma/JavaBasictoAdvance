package com.org.oauthsec.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	
	@GetMapping("/hello")
	public String gethello() {
		System.out.println("hello");
		
		return "Hello, OAuth is working";
	}

	

	 @GetMapping("/getall")
	public List<User> getAll() {
		
		return List.of(new User("karthik","12345"),
				       new User("sarma","45678"));
				       
				                                   
	}
//	 601388846894-nup8elg8671rt1k03e7qrhvlkrnt2ode.apps.googleusercontent.com        client -ID
	 
	 //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     client secret
	 
	
}
