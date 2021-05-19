package com.java8.comparator;

import java.util.*;

public class ComparatorExample {
	public static void main(String[] args) {

		List<Developer> devList = new ArrayList<Developer>();
		devList.add(new Developer(1, "John"));
		devList.add(new Developer(3, "Chris"));
		devList.add(new Developer(2, "Davis"));
		devList.add(new Developer(4, "Tim"));
		devList.add(new Developer(5, "Jeff"));

		// OLDER WAY
		System.out.print("OLD WAY : ");
		Collections.sort(devList, new Comparator<Developer>() {
			@Override
			public int compare(Developer dev1, Developer dev2) {
				return (dev1.getId() - dev2.getId());
			}
		});
		System.out.println(devList);

		// In Java 8, the List interface is supports the sort method directly, no need
		// to use Collections.sort anymore.
		System.out.print("JAVA 8 List.sort() method:  ");
		devList.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer dev1, Developer dev2) {
				return (dev1.getName().compareTo(dev2.getName()));
			}
		});
		System.out.println(devList);

		// USING LAMBDA EXPRESSION
		System.out.print("LAMBDA EXPRESSION : ");
		devList.sort((Developer dev1, Developer dev2) -> dev1.getName().compareTo(dev2.getName()));
		System.out.println(devList);
		
		devList.sort((Developer dev1, Developer dev2) -> dev1.getId() - dev2.getId());
		System.out.println(devList);
		
		//USING JAVA8 COMPARATOR INTERFACE
		//https://www.javabrahman.com/java-8/the-complete-java-8-comparator-tutorial-with-examples/

	}
}
