package com.org.patient.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Patient {

	@Id
private int id;
private String name;
private String stage;
private String problem;
private String mediciene;

@ManyToOne
private Doctor Specialization;

	
}
