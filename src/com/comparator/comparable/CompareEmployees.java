package com.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * compareTo method of Comparable interface: 1)it's in the same class (it is
 * often an advantage) 2)there can be only one implementation (so you can't use
 * that if you want two different cases) 3) Objects which implement Comparable
 * in Java can be used as keys in a sorted map or elements in a sorted set for
 * example TreeSet
 * 
 * compare method of Comparator interface: 1)Separate dedicated class is to be
 * formed, we do not need to tamper the original class
 * 
 * @author Ankita
 * 
 */
public class CompareEmployees {
	public static void main(String[] args) {
		Employee emp1 = new Employee(22, "Aakash", 7);
		Employee emp2 = new Employee(1, "Anu", 11);
		Employee emp3 = new Employee(52, "Sam", 19);
		Employee emp4 = new Employee(23, "Bob", 1);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("Original List: " + empList);
		Collections.sort(empList);
		System.out.println("Sorted using Comparable interface based on ID's: " + empList);
		Collections.sort(empList, new EmpIdComparator());
		System.out.println("Sorted using Comparator based on Employee Id : " + empList);
		Collections.sort(empList, new EmpNameComparator());
		System.out.println("Sorted using Comparator based on Employee Name : " + empList);
	}
}
