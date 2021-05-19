package com.collections;

import java.util.*;
import java.util.Vector;

/**
 * List implementations can have any number of NULL values
 * 
 * @author Ankita
 *
 */
public class ListExample {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(null);
		list1.add(null);

		Iterator<Integer> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List list2 = new LinkedList();
		list2.add(1);
		list2.add(null);
		list2.add(null);

		Iterator<Integer> itr2 = list2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		List list3 = new Vector();
		list3.add(1);
		list3.add(null);
		list3.add(null);

		Iterator<Integer> itr3 = list3.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		Vector list4 = new Stack();
		list4.add(1);
		list4.add(null);
		list4.add(null);

		Iterator<Integer> itr4 = list4.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
	}
}
