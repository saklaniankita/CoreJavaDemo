package com.collections;

import java.util.*;

/**
 * Null not allowed in a queue NullPointerException is thrown at RunTime
 * 
 * @author Ankita
 * 
 */
public class QueueExample {
	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		queue.add(null);
	}
}
