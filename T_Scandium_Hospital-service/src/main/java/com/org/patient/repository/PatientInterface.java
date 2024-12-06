package com.org.patient.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.org.patient.entity.Patient;


public interface PatientInterface extends JpaRepository<Patient, Integer> {
	

	@Query("select id from Patient where stage = 'critical' ")
public List<Integer> findBynameAndstage();
	
}
