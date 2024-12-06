package com.karthik.core.datatypes;

import java.util.Scanner;

public class DataTypesStart {

	public static void main(String[] args) {
		
//try ( Scanner sc = new Scanner(System.in)){ 
//		System.out.print("enter input value:");
//		int var= sc.nextInt();
//		
//		System.out.println("value of input: "+ var);
//		
//		
//		
//}
//		catch(Exception e) {
//			System.out.println(e);
//			}
// we don't need to close the resource leak Scanner when we use in try block		
		Scanner sc2 = new Scanner(System.in);

		System.out.print("enter input value:");
		float var3 = sc2.nextFloat();
	

		System.out.println("value of input: " + var3);

		System.out.print("enter input value:");
		String var1 = sc2.next();

		System.out.println("value of input: " + var1);

		System.out.print("enter input value:");
		String var2 = sc2.next();
		//sc2.nextLine();
		System.out.println("value of input: " + var2);

		System.out.println("enter input value:");
		sc2.nextLine();
		String inline = sc2.nextLine();

		System.out.println("value of input: " + inline);

		sc2.close();
		
	sc2.close();


	}

}
