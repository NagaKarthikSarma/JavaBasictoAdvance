package com.karthik.core.datatypes;

public class AFirstMain {
	abstract class abinafirst{
		public abstract void hello();
		
	}

	public static void main(String[] args) {
		System.out.println("hello start your Java journey from starting");
		System.out.println();
		System.out.println();
		System.out.println("-------welcome to world of java programming -------");
		
		
		
		AFirstMain afm = new AFirstMain(); // Create an instance of AFirstMain

		ab a = new ab() {

			@Override
			public void hello() {
				System.out.println();
				System.out.println();
				System.out.println("outside class ");
				
			}
			
			
		};
		a.hello();
		
		
		
		
		
	}

}
abstract class ab{
	public abstract void hello();
	
}