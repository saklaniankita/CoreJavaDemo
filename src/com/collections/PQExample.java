package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class PQExample {
	public static void main(String args[]) {
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("P");
		pq.add("Z");
		pq.add("A");
		pq.add("T");
		pq.add("E");
		// pq.add(null);
//		 String str = pq.poll();
//		System.out.println("++++"+str);
		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}