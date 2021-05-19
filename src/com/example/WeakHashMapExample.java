package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class WeakHashMapExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		// list.
		List list1 = new LinkedList();
		list = list1;

		List list2 = new ArrayList();
		list.add(1);
		list.add(2);
		ListIterator itr = list.listIterator();
		while (itr.hasNext()) {
			itr.next();
			list.remove(0);
			list.add(3);
		}
		System.out.println("ll" + list);

	}
}
