package com.karthik.core.collections.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayCollect {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();

List<Integer> arrays= new ArrayList<Integer>();
		// --> better to use this due to thread safety we can use synchronization
//		Collections.synchronizedList();
		array.add(45);
		array.add(85);
		array.add(67);
		System.out.println(array);
		array.remove(0);
		System.out.println("** list after removing the index element ");
		System.out.println(array);
		System.out.println();
		System.out.println("** list after adding the elements in index");
		
		array.add(1, 23);
		System.out.println(array);
		System.out.println("** print after ascending order sorting **");
		Comparator<Integer> comp = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1<o2) {
					return -1;	
				}
				else if (o1>o2) {  // or o2<o1
					return 1;	
				}
				return 0;
			}
			
		};
		array.sort(comp);
		
		
		System.out.println(array);
		
		System.out.println();
		System.out.println();
		System.out.println("*** print using iterator *** ");
		
		Iterator<Integer> it = array.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		array.sort((o1, o2) -> {
			
			if (o1<o2) {
				return 1;
			}
			else if (o2<o1) {
				return -1;
			}
			return 0;
		});
		System.out.println("** print after descending order sorting **");
		System.out.println(array);
	}

}
