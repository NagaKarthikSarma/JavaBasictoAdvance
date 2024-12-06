package com.karthik.org.componentbased;

import org.springframework.stereotype.Component;

@Component
public class Innova implements CarModel {

	@Override
	public String carName() {
		
		return "Innova Model";
	}

}
