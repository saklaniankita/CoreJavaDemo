package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Employee[] empArray = new Employee[] { new Employee(1, "Jeff", "PWD", 14000),
				new Employee(2, "Tim", "NACL", 15000), new Employee(3, "Steve", "CSC", 25000),
				new Employee(4, "Bill", "IPLT", 32000), new Employee(5, "Carlos", "PWD", 12000) };

		System.out.println(empArray);

		// Converting an array into Stream
		System.out.println(Stream.of(empArray));

		// Converting a list into Stream
		List<Employee> empList = Arrays.asList(empArray);
		System.out.println(empList.stream());

		// Stream of individual ojects
		System.out.println(Stream.of(new Employee(6, "Jeff", "PWD", 21000), new Employee(7, "Tim", "NACL", 13500),
				new Employee(8, "Steve", "CSC", 16540)));
	}
}
