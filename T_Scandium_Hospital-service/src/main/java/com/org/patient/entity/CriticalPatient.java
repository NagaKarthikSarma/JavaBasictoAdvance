package com.org.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CriticalPatient {

	@Id
	private String name;
	private String stage;
	
}
