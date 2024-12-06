package com.org.doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.doctor.entity.Doctor;

public interface DoctorInterface extends JpaRepository<Doctor, Integer>{

	@Query("select name from Doctor d where d.Availability is null")
	 List<String> findDoctorsByAvailabilityIsNull();
	
	

}
