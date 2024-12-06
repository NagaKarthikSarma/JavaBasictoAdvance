package com.springsecurity.testCredentials;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class testController {

	
	@Autowired
	testRepo repo; 
	
	@PostMapping("/addtest")
	public testCred addDetails(@RequestBody testCred user) {
		
		System.out.println("usercredentials");
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());

		return	repo.save(user);
		  
	}
	@GetMapping("/gettest")
	public List<testCred> getAll(){
		
		return repo.findAll();
	}
	
}
