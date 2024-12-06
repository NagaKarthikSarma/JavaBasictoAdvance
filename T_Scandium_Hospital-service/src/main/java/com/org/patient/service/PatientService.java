package com.org.patient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.patient.entity.CriticalPatient;
import com.org.patient.entity.Doctor;
import com.org.patient.entity.Patient;
import com.org.patient.repository.DoctorInterface;
import com.org.patient.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository repo;
	public ResponseEntity<List<Patient>> getAllPatience() {
		
		return new ResponseEntity <>( repo.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<Patient> getPatient(int id) {
		
		return new ResponseEntity<>(repo.findById(id),HttpStatus.OK);
	}

	public ResponseEntity<List<CriticalPatient>> getCritical(){
		
		List<Patient>  ptr = new ArrayList<>();
		List<CriticalPatient> cp =new ArrayList<>(); 
		
	List<Integer> critical=	repo.getAllCritical();
		for (Integer in: critical) {
		ptr.add(repo.findById(in));
		}
		
		for(Patient pi : ptr) {
			
			CriticalPatient cpObject = new  CriticalPatient();
			
			cpObject.setName(pi.getName());
			
			cpObject.setStage(pi.getStage());
			
			cp.add(cpObject);
		}
		
	
		return new ResponseEntity<>(cp,HttpStatus.OK);
	}

	@Autowired
	DoctorInterface  doctorinterface;
	
	public ResponseEntity<List<Doctor>> getAllDoctors() {
	
		
		return doctorinterface.getAllDoctors();
	}

	public ResponseEntity<Doctor> getDoctorById(int id) {
	
		return doctorinterface.getDoctorById(id);
	}

	public ResponseEntity<List<String>> getAvailable(){
		
		return doctorinterface.getAvailable();
		
	}


	
}
