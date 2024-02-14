package com.java8.stream.intermediateOperation;

import com.java8.stream.Employee;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
/**
 * map() is an intermediate operation and return another stream as method output return value.
 * 
 * The map operation takes a "Function<T, T>", which is called for each value in the input stream and produces
 * one result value, which is sent to the another output stream.
 * 
 * 
 * @author Ankita
 *
 */
public class MapExample {
	public static void main(String[] args) {
		Employee[] empArray = new Employee[] { new Employee(1, "Jeff", "PWD", 14000),
				new Employee(2, "Tim", "NACL", 15000), new Employee(3, "Steve", "CSC", 25000),
				new Employee(4, "Bill", "IPLT", 35000), new Employee(5, "Carlos", "PWD", 12000),
				new Employee(6, "Tom", "NICL", 12000) };
		List<Employee> empList = Arrays.asList(empArray);
		List<Integer> distinctSalary = empList.stream().map(e -> e.getSalary()).distinct().collect(Collectors.toList());
		System.out.println(distinctSalary);
		
		List<Integer> highSalary = distinctSalary.stream().filter(e -> e > 15000).collect(Collectors.toList());
		System.out.println(highSalary);
		
		List<String> names = empList.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
		
		List<Integer> list = empList.stream().map(e -> e.salaryIncrement()).collect(Collectors.toList());
		System.out.println(list);
		
		//a function from a class can directly be called as follows
		//List<Employee> empList = Stream.of(empIds).map(employeeRepository::findById).collect(Collectors.toList());
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<String> alphaUpper = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(alphaUpper);
		
		List<Integer> beta = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> betaNew = beta.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println(betaNew);
		
	}
}
