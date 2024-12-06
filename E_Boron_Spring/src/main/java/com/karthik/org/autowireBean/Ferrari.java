package com.karthik.org.autowireBean;

import org.springframework.beans.factory.annotation.Autowired;





public class Ferrari implements Car {

	@Override
	public void carModel() {
		System.out.println("Ferrari");

	}
	
	@Autowired
	V6Engine v6Engine;
	
	public void speed(int speed) {
		System.out.println("The speed of the car is : "+ " "+v6Engine.engine()+  " -- "+speed);
	}

}
