package com.karthik.core.collections.lists;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollect implements Comparable<String> {

	public static void main(String[] args) {

		List<String> li = new LinkedList<String>();
		li.add("karthik");
		li.add(0, "naga");
		li.add("sarma");
		li.add("baruri");

		System.out.println(li);

		li.sort((o1, o2) -> {
			if (o1.length() > o2.length()) {

				return 1;
			}
			if (o1.length() < o2.length()) {

				return -1;
			}
			return 0;

		});
		li.forEach(t -> System.out.println(t));

		System.out.println("---------- sorted list --------------");
		System.out.println(li);

//		Generics 

		List<Hello> hli = new LinkedList<Hello>();
		hli.add(new Hello(1, "karthik"));
		hli.add(new Hello(2, "sarma"));
		hli.add(new Hello(3, "naga"));
		System.out.println(hli);
		System.out.println("---------- sorted list --------------");
		//hli.sort(Hello:: compareTo);
		// Method referencing
		Collections.sort(hli,Hello:: compareTo); // custom sorting by implementing comparable interface
		System.out.println(hli);
	}



	@Override
	public int compareTo(String o) {
		
		return 0;
	}
}

class Hello implements Comparable<Hello>{

	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + "]";
	}

	private int age;
	private String name;

	public Hello(int age, String name) {

		this.age = age;
		this.name = name;

	}

	@Override
	public int compareTo(Hello o) {
		if(o.name.length() > this.name.length()) {
			return -1;
		}
		else if(o.name.length()<this.name.length()) {
			return 1;
		}
		return 0;
	}
}
