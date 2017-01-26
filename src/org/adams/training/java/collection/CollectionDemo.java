package org.adams.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();
		a1.add("Program");
		a1.add("Creek");
		a1.add("Java");
		a1.add("Java");
		System.out.println("ArrayList Elements");
		System.out.print("\t" + a1 + "\n");
		 
		List<String> l1 = new LinkedList<String>();
		l1.add("Program");
		l1.add("Creek");
		l1.add("Java");
		l1.add("Java");
		System.out.println("LinkedList Elements");
		System.out.print("\t" + l1 + "\n");
		 
		Set<String> s1 = new HashSet<String>(); // or new TreeSet() will order the elements;
		s1.add("Program");
		s1.add("Creek");
		s1.add("Java");
		s1.add("Java");
		s1.add("tutorial");
		System.out.println("Set Elements");
		System.out.print("\t" + s1 + "\n");
		 
		Map<String, String> m1 = new HashMap<String, String>(); // or new TreeMap() will order based on keys
		m1.put("Windows", "10");
		m1.put("Windows", "8");
		m1.put("Language", "Java");
		m1.put("Website", "adams.org");
		System.out.println("Map Elements");
		System.out.println("\t" + m1);
		
		// Using the Collections Max Utility
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

		listOfIntegers.add(1);
		listOfIntegers.add(2);
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		listOfIntegers.add(5);
		listOfIntegers.add(13);
		listOfIntegers.add(7);
		listOfIntegers.add(8);
		listOfIntegers.add(9);
		listOfIntegers.add(10);
		listOfIntegers.add(11);

		System.out.println("\n\nThe max Number is  : " + Collections.max(listOfIntegers));

	}

}
