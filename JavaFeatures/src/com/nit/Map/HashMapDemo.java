package com.nit.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//put(Key k, Value v) : Inserts key-value pair into the HashMap.
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		System.out.println("put(Key k, Value v)::"+map);

		// get(Object key) : returns the value for the specified key in the HashMap
		String value = map.get(3);
		System.out.println("get(Object key)::"+value);
		
		//remove(Object key) : removes the key-value pair for the specified key
		map.remove(4);
		System.out.println("remove(Object key)::"+map);
		
		System.out.println("//Iterate over keys");
		 
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext())
		{
		    Integer key = itr.next();
		    String value1 = map.get(key);
		    System.out.println("The key is :: " + key + ", and value is :: " + value1 );
		}
		 
		System.out.println("//Iterate over entries set");
		 
		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		while (entryIterator.hasNext())
		{
		    Entry<Integer, String> entry = entryIterator.next();
		    System.out.println("The key is :: " + entry.getKey() + ", and value is :: " + entry.getValue() );
		}
	}

}
