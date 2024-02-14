package com.java8.stream.terminalOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a terminal operation. After forEach() is performed, the stream
 * pipeline is considered consumed, and can no longer be used.
 * 
 * 
 * For sequential streams the order of elements is same as the order in the source, 
 * so the output would be same whether you use forEach or forEachOrdered. 
 * However when working with parallel streams, you would always want to use the forEachOrdered() method 
 * when the order matters to you, as this method guarantees that the order of elements would be same as the source.
 * 
 * 
 * @author Ankita
 *
 */
public class ForEachExample {
	static int increment(int a) {
		return a + 2;
	}

	public static void main(String[] args) {

		// Itertaing a list
		List<Integer> list = Arrays.asList(2, 10, 1, 11, 3, 4);
		list.forEach(e -> System.out.print(e + ", "));
		list.forEach(System.out::print);

		// Iterating a map
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.forEach((k, v) -> {
			if (k.equals("C"))
				System.out.println(k + "  " + v);
		});

		// Iterating a stream of list
		List<Integer> names = new ArrayList<Integer>();
		names.add(13);
		names.add(2);
		names.add(4);
		names.add(1);
		names.add(11);
		names.add(20);
		
		names.stream().forEach(x -> System.out.println(x)); //order of elements would be same
		System.out.println("****1");
		names.stream().forEachOrdered(x -> System.out.println(x));
		System.out.println("***2");
		names.parallelStream().forEach(System.out::println);
		System.out.println("***3");
		names.parallelStream().forEachOrdered(System.out::println);
		
	}
}
