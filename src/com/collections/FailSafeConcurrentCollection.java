package com.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeConcurrentCollection {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new ConcurrentHashMap<Integer, String>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "four");
		System.out.println(map1);

		try {
			Iterator<Integer> itr1 = map1.keySet().iterator();
			while (itr1.hasNext()) {
				itr1.next();
				itr1.remove(); // No exception thrown
				System.out.println("Map after iterator's remove method: " + map1);
				map1.put(5, "five"); // No Exception thrown
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//
		
		/**
		 * Point to note : Though we are adding an item in the list in every iteration, but still the iterator
		 * loop will not run endlessly because it is a fail safe iterator that runs on a copy of original collection
		 * and hence it will run as many times as the number of elements in the original list
		 * 
		 */
		
		List<String> list2 = new CopyOnWriteArrayList<String>();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		System.out.println("Original List : "+list2);
		try {
			Iterator<String> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				itr2.next();
				itr2.remove(); // No exception thrown

				list2.add("five"); // No Exception thrown
				System.out.println("List after iterator's remove method: " + list2);
			}
		} catch (Exception e) {
			System.out.println("hey there");
			e.printStackTrace();
		}
		System.out.println("SSize of list: "+list2.size());
	}
}
