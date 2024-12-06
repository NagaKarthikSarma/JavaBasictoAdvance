package com.org.doctor.entity;

import lombok.Data;

@Data
public class Patient {
	private int id;
	private String name;
	private String stage;
	private String problem;
	private String mediciene;
	
}
