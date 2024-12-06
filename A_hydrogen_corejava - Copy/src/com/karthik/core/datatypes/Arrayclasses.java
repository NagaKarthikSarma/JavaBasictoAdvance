package com.karthik.core.datatypes;

public class Arrayclasses {

	public static void main(String[] args) {
	
		System.out.println("**** one dimensional array ****");
		
		int array[] = {1,3,4,5,6};
		
		for (int abc :array )
		System.out.print(abc+" ");
		
		System.out.println();
		System.out.println("**** two dimensional array ****");
		
		int[][] td = {{3,4,8,9},{6,7,2,1}};
		for (int[] abc: td) {
			for (int acd: abc) {
				System.out.print(acd+" ");
			}
			System.out.println();
		}
		System.out.println("**** three dimensional array ****");
		int [][][] threed= {{{2,3},{4,5}},{{1,4},{2,6}}};
		
		for (int[][] atd : threed) {
			
		for (int[] abc: atd) {
			for (int acd: abc) {
				System.out.print(acd+" ");
			}
			System.out.println();
		}
		System.out.println();
		}
	}


}
