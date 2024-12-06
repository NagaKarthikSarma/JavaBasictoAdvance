package com.karthik.core.datatypes;



public class AutoboxAndUnbox {

	public static void main(String[] args) {
		
		System.out.println("******* Autoboxing --> converting primitive types to objects *******");
		int a=55;
		Integer ing = a;
		System.out.println(ing);
		
		char ct = 'c';
		Character cx = ct;
		System.out.println(cx);
		
		System.out.println("******* unboxing --> converting object types to primitive *******");
		
  Character cyx = 'c';   // character object
  char ch = cyx;
  System.out.println(ch);
  
  Float fsc = 456677.0f;    // float object 
  float fgh = fsc;
  System.out.println(fgh);
  
		
	}

}
