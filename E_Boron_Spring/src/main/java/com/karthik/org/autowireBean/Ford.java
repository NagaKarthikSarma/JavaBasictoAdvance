package com.karthik.org.autowireBean;

public class Ford implements Car {

	@Override
	public void carModel() {
		System.out.println("Ford model");
	}
	
	public void speed(int speed) {
		System.out.println("The speed of the car is : "+speed);
	}

}
