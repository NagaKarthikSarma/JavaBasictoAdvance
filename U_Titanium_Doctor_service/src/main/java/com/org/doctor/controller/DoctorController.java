package com.org.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.doctor.entity.Doctor;
import com.org.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
	DoctorService  service;
	
	@GetMapping("/alldoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		
	return service.getAllDoctorsdetails();
		
	}
	
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable int id){
		
		return service.getById(id);
	}
	
	@GetMapping("/Available")
	public ResponseEntity<List<String>> getAvailable(){
		
        return service.getAvailableDoctors();
	}
	
}
