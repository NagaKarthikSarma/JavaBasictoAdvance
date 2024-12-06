package com.karthik.org.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.org.Model.Home;
import com.karthik.org.repository.HomeRepo;

@RestController
public class HomeController {
	@Autowired
	HomeRepo rep;
	
	@GetMapping("/getall")
	public List<Home> getAll(){
		System.out.println(rep.findAll());
		return rep.findAll();
		
	}

	   // Endpoint to add a new Home entry, accepting XML data
    @PostMapping(value = "/add", consumes = "application/xml", produces = "application/xml")
    public Home add(@RequestBody Home h) {    
        System.out.println(h);
        return rep.save(h);
    }
	
	@RequestMapping("/helo")
	public String helo() {
		
		return "Hello I am starting aspect programming";
	}
	
	@GetMapping("/args")
	public String argument(@RequestParam String a, @RequestParam String b) {
		
		return  a+"   "+b;
		
	}
	
	@GetMapping("/findname/{a}")
	public  Home findByhname(@PathVariable String a) {
	

		return rep.findByhname(a);
	}
	@GetMapping("findname")
	public Home findhname(@RequestParam String name) {
		return rep.findByhname(name);
	}
	
}
