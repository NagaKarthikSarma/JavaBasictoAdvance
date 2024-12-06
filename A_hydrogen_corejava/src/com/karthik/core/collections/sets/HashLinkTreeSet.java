package com.karthik.core.collections.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashLinkTreeSet {

	public static void main(String[] args) {
	  
		HashSet<Integer> set= new HashSet<Integer>();   // not orderly arranged
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		
		System.out.println(set);
		set.remove(1);
		System.out.println(set);
		
		Set<Integer> sett= new HashSet<Integer>();
		sett.add(1);
		sett.add(2);
		sett.add(3);
		sett.add(4);
		sett.add(5);
	
		sett.forEach(t -> System.out.print(t+" "));
		
		LinkedHashSet<Integer>  li = new LinkedHashSet<Integer>(); // first added element is iteself arranged
		
		Set<Integer> tee = new TreeSet<Integer>(new  Comparator<Integer>() {  // custom sorting or natural sorting can be done here using treeset
  
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1<o2) {
					return 1;
				}
				else if (o1>o2) {
					return -1;
				}
				return 0;
			}
			
		});
		
		
		tee.add(3);
		tee.add(4);
		tee.add(5);
		
		tee.add(1);
		tee.add(2);
		
		Comparator<Integer> comp = new  Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1<o2) {
					return 1;
				}
				else if (o1>o2) {
					return -1;
				}
				return 0;
			}
		};
		
		System.out.println();
		System.out.println("****   sorting  ***********");
		System.out.println(tee);
	    
		

	}

}
