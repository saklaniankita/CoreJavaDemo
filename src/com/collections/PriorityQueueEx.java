 package com.collections;

import java.util.*;

//Queue doesn�t permit NULL pointers.
//We can�t create PriorityQueue of Objects that are non-comparable
//PriorityQueue are unbound queues.
// Queues follows FIFO approach
//The head of this queue is the least element with respect to the specified ordering.
//If multiple elements are tied for least value, the head is one of those elements � ties are broken arbitrarily.
//The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
public class PriorityQueueEx {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("z");
		queue.add("c");
		queue.add("y");
		queue.add("k");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator(); // This does not assure to print the right sequence
		while (itr.hasNext()) {
			System.out.println(itr.next());
			//System.out.println(queue.poll());
		}

		queue.remove(); //throws exception if queue is empty
		queue.poll(); //returns null if queue is empty
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}