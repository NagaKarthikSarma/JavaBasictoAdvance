package com.org.karthik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String gree() {
		return " Welcome to Kalki";
	}
	
	@GetMapping("info")
	public String aboutMachine() {
		
		String os = System.getProperty("os.name");
	  String version = System.getProperty("os.version");
	  String architecture = System.getProperty("os.arch");
	  String javaVersion = System.getProperty("java.version");
	  String user = System.getProperty("user.name");
		
		return "OS: "+os+"  version: "+version+"  architecture: "+architecture+"  javaversion: "+javaVersion+" User: "+user;
	
	}
	
	

}
