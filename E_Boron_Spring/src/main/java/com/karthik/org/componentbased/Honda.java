package com.karthik.org.componentbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Honda implements CarModel {

     @Autowired
	Innova innova;
	
	@Override
	public String carName() {
		
		innova.carName();
		return "Honda Model";
	}

}
