package com.karthik.core.oops;

public class PolymorphismExam extends RuntimePoly {

//	public  int add(int a, int b) {
//		
//		return a+b;
//	}
	public int add(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {
//		 polymorphism -> Compile time polymorphism 

		PolymorphismExam ctp = new PolymorphismExam();

//System.out.println(	ctp.add(45,56));

		System.out.println(ctp.add(45, 56, 67));

//	 polymorphism -> Runtime polymorphism 
		RuntimePoly rp = new RuntimePoly();

		System.out.println(rp.add(45, 55));

		System.out.println(ctp.add(45, 55)); // it will print from child class first if child is having same method
//	                             when there is no method available in child it will go to parent and checks
	}

}

class RuntimePoly {

	public int add(int a, int b) {

		return a + b;
	}
}