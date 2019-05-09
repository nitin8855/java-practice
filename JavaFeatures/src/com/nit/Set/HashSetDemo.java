package com.nit.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();

		/*
		 * boolean add(E e) : adds the specified element to the Set if not already
		 * present. This method internally uses equals() method to check for duplicates.
		 * If element is duplicate then element is rejected and value is NOT replaced.
		 */
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("C");
		hashset.add("D");
		System.out.println("add(E e)::" + hashset);

		// boolean contains(Object o) : returns true if the hashset contains the
		// specified element, othrweise false.
		System.out.println("contains(Object o)::" + hashset.contains("C"));

		// remove(Object o) : removes the specified element from the hashset if it is
		// present and return true, else returns false.
		System.out.println("Before remove method::"+hashset);
		hashset.remove("D");
		System.out.println("remove(Object o)::"+hashset);
		
		//convert a hashset to array using toArrray() method
		String[] str = new String[hashset.size()];
		hashset.toArray(str);
		System.out.println("toArrray()::"+Arrays.toString(str));
		
		// convert a hashset to arraylist using Java 8 stream API.
		List<String> list =hashset.stream().collect(Collectors.toList());
		System.out.println(list);
		
		// clear() : removes all the elements from the hashset.
		hashset.clear();
		System.out.println("clear()::"+hashset);

	}

}
