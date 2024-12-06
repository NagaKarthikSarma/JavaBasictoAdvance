package com.org.doctor.entity;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Doctor {
	@Id
	private int id;
	private String name;
	private String role;
	private String Specialization;
	private String Availability;
	
}
