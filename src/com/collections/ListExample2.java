package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * If generics are not provided, Collection would accept any datatype
 * 
 * @author Ankita
 *
 */
public class ListExample2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(27);
		list.add("vdgsdfg");
		list.add(null);
		list.add('d');
		list.add(true);

		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
//		

		/**
		 * Using ListIterator we can traverse forward and backward
		 * 
		 * ClassCastException is thrown while typecasting
		 */

		ListIterator listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

		/**
		 * Using Iterator, we can traverse only in forward direction
		 * 
		 * ClassCastException is thrown while typecasting
		 */

		Iterator<String> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
