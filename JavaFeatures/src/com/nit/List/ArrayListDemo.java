package com.nit.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		//ArrayList add() method is used to add an element in the list
		list1.add("Delhi");
		list1.add("Mumbai");
		list1.add("Pune");
		list1.add("Hydrabad");
		list1.add("Banglore");
		list1.add("Mumbai");
		
		System.out.println("add()::list1=>"+list1);
		
		//ArrayList addAll() method is used to append all of the elements of argument collection to the list at the end
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Gova");
		list1.addAll(list2);
		System.out.println("list2::"+ list2);
		System.out.println("addAll()::"+list1);
		
		//ArrayList clear() method is used to removes all of the elements from the list
		//list1.clear();
		//System.out.println("clear()::"+list1);
		
		//ArrayList clone() method is used to create a shallow copy of the list,
		//only object references are copied
		@SuppressWarnings("unchecked")
		ArrayList<String> list3 =  (ArrayList<String>) list1.clone();
		System.out.println("shallow copy - clone()::"+ list3);
		
		//ArrayList contains() method is used to check if the specified element exists in the given arraylist or not. 
		//If element exist then method returns true, else false.
		System.out.println("contains()::"+list1.contains("Pune")+" "+list1.contains("Thane"));
		
		//contains() method uses indexOf() method to determine if a specified element is present in the list or not. 
		//So we can also directly use the indexOf() method to check 
		System.out.println("indexOf()::"+list1.indexOf("Mumbai")+" "+list1.indexOf("Thane"));
		
		// iterate an arraylist using forEach() method
		list1.forEach(list -> System.out.println(list.toLowerCase()));
		
		//get the element from an ArrayList. We will be using ArrayList at the specified index
		System.out.println("get()::"+list1.get(3));
		
		//get the index of last occurrence of a element in the ArrayList
		System.out.println("lastIndexOf()::"+list1.lastIndexOf("Hydrabad"));
		
		// returns a list iterator over the elements in this list. It is a bi-directional iterator
		ListIterator<String> listIterattor = list1.listIterator();
		System.out.println("====ListIterator()::Forword====");
		while(listIterattor.hasNext()) {
			System.out.println(listIterattor.next());
		}
		System.out.println("====ListIterator()::Backword====");
		while(listIterattor.hasPrevious()) {
			System.out.println(listIterattor.previous());
		}
		
		//ArrayList remove() removes the first occurrence of the specified element from this list
/*		list1.remove(2);
		System.out.println("remove(index)::" +list1);
		list1.remove("Delhi");
		System.out.println("remove(object)::"+list1);
		list1.removeAll(Collections.singleton("Mumbai"));
		System.out.println("removeAll(Collections)::"+list1);*/
		
		//removeIf() method to remove elements which match a given condition in form of a predicate
		//list1.removeIf(e->e.equals("Mumbai"));
		System.out.println("removeIf(predicate)::"+list1);
		
		//ArrayList retainAll() retains only the elements in this list that are contained in the specified method argument collection
		//list1.retainAll(Collections.singleton("Mumbai"));
		System.out.println("retainAll(Collections)::"+list1);
		
		//ArrayList sort() method sorts the list according to the order induced by the specified Comparator instance
		/*list1.stream().sorted((p1,p2)-> p1.compareTo(p2))
		.forEach(e->{
			System.out.println(e.toString());
		});*/
		//list1.sort();
		
		//convert ArrayList to array using toArray() method
		Object array[] = list1.toArray();
		System.out.println("toArray()::"+Arrays.toString(array));
		for (Object objArray : array) {
			System.out.println(objArray);
		}
		
	}

}
