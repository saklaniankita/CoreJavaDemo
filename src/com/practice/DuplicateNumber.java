package com.practice;

import java.util.*;

public class DuplicateNumber {
	public final static int HIGHESTNUM = 30;

	public static void main(String[] args) {
		/*
		 * int idealSum = (HIGHESTNUM * (HIGHESTNUM + 1)) / 2; List<Integer> list = new
		 * ArrayList<Integer>(); for (int i = 1; i <= HIGHESTNUM; i++) { list.add(i); }
		 * list.add(31); int actualSum = 0; int size = list.size(); for (int i = 0; i <
		 * size; i++) { actualSum = actualSum + list.get(i); }
		 * 
		 * int numRepeated = actualSum - idealSum; if (numRepeated != 0 && numRepeated
		 * <= HIGHESTNUM) System.out.println("Number Reapeated: " + numRepeated); else
		 * System.out.println("All Numbers are unique");
		 */

		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(13);
		list.add(7);
		list.add(46);
		list.add(16);
		list.add(35);
		list.add(20);

		int listSize = list.size();
		int listSum = 0;
		for (int i = 0; i < listSize; i++) {
			listSum = listSum + list.get(i);
		}

		Set<Integer> set = new HashSet<Integer>();
		Iterator<Integer> listIterator = list.iterator();
		while (listIterator.hasNext()) {
			set.add(listIterator.next());
		}

		int setSize = set.size();
		int setSum = 0;
		Iterator<Integer> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			setSum = setSum + setIterator.next();
		}
		if (listSize == setSize)
			System.out.println("There are no duplicates");
		else
			System.out.println("Duplicate Number : " + (listSum - setSum));
	}
}
