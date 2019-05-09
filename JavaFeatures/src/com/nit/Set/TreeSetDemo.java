package com.nit.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//1. Create TreeSet
		TreeSet<String> treeset = new TreeSet<>();
		 
		//2. Add elements to TreeSet
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		treeset.add("D");
		treeset.add("E");
		System.out.println(treeset);
		
		//contains(Object o) : returns true if the TreeSet contains the specified element, otherwise false.
		boolean isAvailable = treeset.contains("D");
		System.out.println("contains(Object o)::"+isAvailable);
		
		// remove(Object o) : removes the specified element from the TreeSet if it is present and return true, else returns false.
		treeset.remove("E");
		System.out.println(treeset);
		
		// Iterate over values
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext())
		{
		    String value = itr.next();
		    System.out.println("Value: " + value);
		}
		
		// isEmpty() : returns true if TreeSet contains no element, otherwise false
		boolean isempty=treeset.isEmpty();
		System.out.println("isEmpty()::"+isempty);
	}

}
