package com.collections;

import java.util.*;

public class PriorityQueueEx2 {
	public static void main(String[] args) {
		Queue<Employee> pq = new PriorityQueue<Employee>(new EmpNameComparator());
		pq.add(new Employee(2, "F"));
		pq.add(new Employee(9, "A"));
		pq.add(new Employee(4, "D"));
		pq.add(new Employee(1, "S"));
		//pq.add(null); //Queue does not allow null elements
		pq.add(new Employee(6, "J"));
		System.out.println("head:" + pq.element()); //throws exception if queue is empty
		System.out.println("head:" + pq.peek()); //returns null if queue is empty
		System.out.println("Highest Priority : ");
		System.out.println("iterating the queue elements:");

		/**
		 * Iterator does not print the write sequence
		 */
		System.out.println("Iterator printing...." + pq);
		Iterator<Employee> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


		/**
		 * This prints the correct sequence but empties the queue
		 */
		System.out.println("Queue emptying.....");
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}


	}
}
