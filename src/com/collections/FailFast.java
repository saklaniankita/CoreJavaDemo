package com.collections;

import java.util.*;

public class FailFast {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		try {
			Iterator<Integer> itr1 = list1.iterator();
			while (itr1.hasNext()) {
				itr1.next();
				itr1.remove(); // No exception will be thrown
				System.out.println("list after applying iterator's remove method : " + list1);
				list1.add(5); // Exception will be thrown
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		map2.put(4, "four");
		System.out.println(map2);

		try {
			Iterator<Integer> itr2 = map2.keySet().iterator();
			while (itr2.hasNext()) {
				itr2.next();
				itr2.remove(); //No exception thrown
				System.out.println("Map after iterator's remove method: " + map2);
				map2.remove(4); //Exception thrown
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
