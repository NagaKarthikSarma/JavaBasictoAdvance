package com.org.patient.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.patient.entity.CriticalPatient;
import com.org.patient.entity.Doctor;
import com.org.patient.entity.Patient;
import com.org.patient.service.PatientService;

@RestController 
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientservice;
	@Autowired
	Environment environment;
	
  @GetMapping("/allpatience")
  
  public ResponseEntity<List<Patient>> getAllPatience(){
	  
	  System.out.println("************    "+ environment.getProperty("local.server.port") +"  **************");

	  return patientservice.getAllPatience() ;
	  
  }
  
  @GetMapping("/patient/{id}")
  public ResponseEntity<Patient> getPatientDetails(@PathVariable int id) {
	  
	  return  patientservice.getPatient(id);
  }
  
  @GetMapping("/criticalpatient")
  public ResponseEntity<List<CriticalPatient>> getcriticalPatient(){
	  
	  
	  return patientservice.getCritical();
	  
	  
  }
  
  @GetMapping("/doctors")
  public ResponseEntity<List<Doctor>> getAllDocs(){
	  
	  return patientservice.getAllDoctors();
  }
  
  @GetMapping("doctor/{id}")
  public ResponseEntity<Doctor> doctorById(@PathVariable int id){
	  
	  return patientservice.getDoctorById(id);
  }
	
	@GetMapping("Available")
	public ResponseEntity<List<String>> getAvailable(){
		return patientservice.getAvailable();
	}
  
}
