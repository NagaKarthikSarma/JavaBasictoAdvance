package com.org.patient.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.patient.entity.Doctor;

@FeignClient("DOCTOR-SERVICE")
public interface DoctorInterface {

	@GetMapping("doctors/alldoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors();
	
	@GetMapping("doctors/doctor/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable int id);
	@GetMapping("doctors/Available")
	public ResponseEntity<List<String>> getAvailable();

}
