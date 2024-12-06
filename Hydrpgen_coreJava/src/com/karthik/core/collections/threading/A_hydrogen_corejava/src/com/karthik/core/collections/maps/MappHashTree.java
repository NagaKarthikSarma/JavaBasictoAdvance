package com.karthik.core.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MappHashTree {

	public static void main(String[] args) {
		// Hashmap HashMap: Uses a hash table to store key-value pairs. 
		// Maintains elements in ascending order of their keys, according to the natural ordering of the keys or a custom comparator
		Map<Integer, String> mapping = new HashMap<Integer, String>();
		mapping.put(1, "naga");
		mapping.put(2, "karthik");
		mapping.put(3, "sarma");
		System.out.println(mapping);
		mapping.forEach((t, u) -> {
			System.out.println(t);
			System.out.println(u);
		});

		for (Map.Entry<Integer, String> mn : mapping.entrySet()) {

			System.out.println(mn.getKey() + "---" + mn.getValue());

		}
//TreeMap  TreeMap: Uses a self-balancing binary search tree (typically a red-black tree) to store key-value pairs.
		//Does not guarantee any specific order of elements.

		Map<Integer, String> treemap = new TreeMap<Integer, String>();

		treemap.put(1, "naga");
		treemap.put(2, "karthik");
		treemap.put(3, "sarma");

	}

}
