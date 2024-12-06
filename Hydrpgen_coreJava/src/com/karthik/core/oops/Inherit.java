package com.karthik.core.oops;

class Father{
	public void parentMeth() {
		
		System.out.println("this is father method");
		
	}
	
}
interface Mother{
public void parent();

		
//		System.out.println("this is Mother method");
		

}
interface Brother{
	public void parent();
}

public class Inherit extends Father implements Mother, Brother{

	public static void main(String[] args) {
		
		Father f = new Father();
		Inherit i = new Inherit();
		
		i.childMethod();
		System.out.println();
		System.out.println("******* child calling parent method ****** ");
		System.out.println();
		i.parentMeth();
		System.out.println();

	}

	public void childMethod() {
		
		System.out.println("this is child method");
	}

	@Override
	public void parent() {
		
		
	}
}
