package com.nit.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//add(obj)::appends the specified element to the end of a list.
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("add()::"+list);
		
		//add(index, element):: inserts the specified element at the specified position index in a list.
		list.add(2, "A");
		list.add(3, "D");
		System.out.println("add(index, element)::"+list);
		
		//remove(index)::removes the first occurence of the specified element in a list
		list.remove(2);
		System.out.println("remove(index)::"+list);
		
		/*//1. LinkedList to Array
		String array[] = new String[list.size()];
		list.toArray(array);
		System.out.println(Arrays.toString(array));
		//2. Array to LinkedList
		LinkedList<String> linkedListNew = new LinkedList<>(Arrays.asList(array));
		System.out.println(linkedListNew);*/
		
		//sort LinkedList
		Collections.sort(list);
		System.out.println("sort()::"+list);
		//custom sorting
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse sort()::"+list);
		
		// getFirst() : returns the first element in a list.
		System.out.println("getFirst()::"+list.getFirst());
		// getLast() : returns the last element in a list.
		System.out.println("getLast()::"+list.getLast());
		
		// addFirst(Object o) : inserts the given element at the beginning of a list.
		list.addFirst("E");
		System.out.println("addFirst(Object o)::"+list);
		
		//addLast(Object o) : appends the given element to the end of a list
		list.addLast("Z");
		System.out.println("addLast(Object o)::"+list);
		
		//contains(Object o) : return true if the list contains a specified element, else false
		System.out.println("contains(Object o)::"+list.contains("B"));
		
		//indexOf(Object o) : returns the index in a list of the first occurrence of the specified element, or -1 if the list does not contain specified element.
		System.out.println("indexOf(Object o)::"+list.indexOf("C"));
		
		//lastIndexOf(Object o) : returns the index in a list of the last occurrence of the specified element, or -1 if the list does not contain specified element.
		System.out.println("lastIndexOf(Object o)::"+list.lastIndexOf("B"));
	}

}
