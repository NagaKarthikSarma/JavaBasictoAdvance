package com.org.karthik.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
//@RequestMapping("/api")
public class userControl {
	
	@GetMapping("/user")
	public ResponseEntity<String>  userDetails(UriComponentsBuilder ucbuilder) {
		  
		  
		  HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucbuilder.path("/api/user").buildAndExpand("Hello I am karthik").toUri());
		return new ResponseEntity<String>(headers,HttpStatus.OK);
	}

}
