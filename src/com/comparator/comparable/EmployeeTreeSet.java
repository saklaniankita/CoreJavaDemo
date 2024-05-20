package com.comparator.comparable;

import java.util.TreeSet;

/**
 * TreeSet internally calls compareTo method of Comparable class Employee while
 * sorting. Similarly TreeMap also calls compareTo method internally
 * 
 * If Employee class does not implement Comparable interface , then exception is
 * thrown at run time
 * 
 * @author Ankita
 * 
 */
public class EmployeeTreeSet {
	public static void main(String[] args) {
		Employee emp1 = new Employee(22, "Aakash", 3);
		Employee emp2 = new Employee(1, "Anu", 11);
		Employee emp5 = new Employee(2, "Anu", 11);
		Employee emp3 = new Employee(52, "Sam", 23);
		Employee emp4 = new Employee(23, "Bob", 17);
//		TreeSet<Employee> set1 = new TreeSet<Employee>();
//		set1.add(emp1);
//		set1.add(emp2);
//		set1.add(emp3);
//		set1.add(emp4);
//		set1.add(emp5);
//		System.out.println(set1);

		TreeSet<Employee> set2 = new TreeSet<>(new EmpIdComparator());
		set2.add(emp1);
		set2.add(emp2);
		set2.add(emp3);
		set2.add(emp4);
		set2.add(emp5);
		System.out.println(set2);

	}
}
