package com.org.patient.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@OneToMany
  private List<Patient> problem;
}
