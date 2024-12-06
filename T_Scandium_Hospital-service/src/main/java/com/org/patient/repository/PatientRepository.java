package com.org.patient.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.org.patient.entity.CriticalPatient;
import com.org.patient.entity.Patient;

@Repository
public class PatientRepository {

	
	@Autowired
	PatientInterface  patientInterface;
	
	public List<Patient> findAll(){
		
		return patientInterface.findAll();
	}

	public Patient findById(int id) {
		
		Patient pat = patientInterface.findById(id).get();
		
		return pat;
	}

	public List<Integer> getAllCritical() {
		
		List<Integer>  pat = patientInterface.findBynameAndstage();
		
		return pat;
	}
}
