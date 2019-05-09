package com.nit.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();

		/*
		 * boolean add(E e) : adds the specified element to the Set if not already
		 * present. This method internally uses equals() method to check for duplicates.
		 * If element is duplicate then element is rejected and value is NOT replaced.
		 */
		linkedhashset.add("A");
		linkedhashset.add("B");
		linkedhashset.add("C");
		linkedhashset.add("C");
		linkedhashset.add("D");
		System.out.println("add(E e)::" + linkedhashset);

		// boolean contains(Object o) : returns true if the linkedhashset contains the
		// specified element, othrweise false.
		System.out.println("contains(Object o)::" + linkedhashset.contains("C"));

		// remove(Object o) : removes the specified element from the linkedhashset if it is
		// present and return true, else returns false.
		System.out.println("Before remove method::"+linkedhashset);
		linkedhashset.remove("D");
		System.out.println("remove(Object o)::"+linkedhashset);
		
		//convert a linkedhashset to array using toArrray() method
		String[] str = new String[linkedhashset.size()];
		linkedhashset.toArray(str);
		System.out.println("toArrray()::"+Arrays.toString(str));
		
		// convert a linkedhashset to arraylist using Java 8 stream API.
		List<String> list =linkedhashset.stream().collect(Collectors.toList());
		System.out.println(list);
		
		// clear() : removes all the elements from the linkedhashset.
		linkedhashset.clear();
		System.out.println("clear()::"+linkedhashset);

	}

}
