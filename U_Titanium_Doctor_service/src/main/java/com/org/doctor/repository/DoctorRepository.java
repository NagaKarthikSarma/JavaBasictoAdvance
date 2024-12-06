package com.org.doctor.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.doctor.entity.Doctor;

@Repository
public class DoctorRepository {
	
	@Autowired
	DoctorInterface  inter;
	
	public List<Doctor> findAll(){
		
	return	inter.findAll()	;
	}

	public Doctor findById(int id) {
		
		return inter.findById(id).get();
	}

	public List<String> findAvailableDocs() {
		
		return inter.findDoctorsByAvailabilityIsNull();
	}
	
	

}
