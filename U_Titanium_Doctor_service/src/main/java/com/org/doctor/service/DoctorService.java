package com.org.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.doctor.entity.Doctor;
import com.org.doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository repo;

	public ResponseEntity<List<Doctor>> getAllDoctorsdetails() {
		List <Doctor>  doctorList = repo.findAll();
	
		return new ResponseEntity<>(doctorList,HttpStatus.OK);
	}

	public ResponseEntity<Doctor> getById(int id) {
		
		return new ResponseEntity<Doctor>(repo.findById(id),HttpStatus.OK);
	}

	public ResponseEntity<List<String>> getAvailableDoctors() {
		
		return   new ResponseEntity<> (repo.findAvailableDocs(),HttpStatus.OK);
	}

}