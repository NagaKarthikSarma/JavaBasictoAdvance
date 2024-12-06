package com.karthik.core.datatypes;

public class TypeCastingDemo {

	public static void main(String[] args) {

		System.out.println(" ***************** Implicit type casting **************** ");
//		byte --> short --> int --> long --> float --> double 
		
		byte a = (byte) 01010;
		System.out.println(a);
		short s = a;
		System.out.println(s);
		int i = s;
		System.out.println(i);
		long l = i;
		System.out.println(l);
		float f = l;
		System.out.println(f);
		double d = f;
		System.out.println(d);

		System.out.println(" ***************** Explicit type casting **************** ");

// double --> float --> long --> int --> short --> byte;

		double db = 456.854545;
		System.out.println(db);
		float ft = (float) db;
		System.out.println(ft);
		int it = (int) ft;
		System.out.println(it);
		
		System.out.println(" ***************** type casting to string **************** ");

// int, float, double, char to string 
		
		int itos = 4567;
		String stoi = Integer.toString(itos);
		System.out.println(stoi);
		char ctos = 'c';
		String stoc = Character.toString(ctos);
		System.out.println(stoc);
		float ftos = 4564;
		String stof = Float.toString(ftos);
		System.out.println(stof);
		double dtos = 4566.088;
		String stod = Double.toString(dtos);
		System.out.println(stod);

		System.out.println(" ***************** type casting from string **************** ");
// string to int, float, double, char
		
		String si="456";
		int is =Integer.parseInt(si);
		System.out.println(is);
		float fs= Float.parseFloat(si);
		System.out.println(fs);
		double ds= Double.parseDouble(si);
		System.out.println(ds);
		String stc="c";
		char cts= stc.charAt(0);
		System.out.println(cts);
		

	}

}
