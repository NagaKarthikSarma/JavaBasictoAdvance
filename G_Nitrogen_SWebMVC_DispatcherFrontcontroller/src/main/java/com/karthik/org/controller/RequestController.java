package com.karthik.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

    @RequestMapping("/hello")  // for jsp calling
    public String hello() {
    	
    	return "Hello";
    }
    
    
    @ResponseBody      // this is used to send the data not jsp request
    @RequestMapping("/request")
    public String response() {
    	
    	return " Hi you started the journey of spring ";
    }

    @RequestMapping("/employee")
    public String emp(Model model) {
    	
     String employee= "Karthik sarma";
     
     model.addAttribute("emp", employee);
    	
    	
    	
    	return "Employee";
    }
    
}
