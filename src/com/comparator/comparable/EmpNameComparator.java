package com.comparator.comparable;

import java.util.Comparator;

/**
 * Comparator on the basis of name
 * 
 * @author Ankita
 * 
 */
public class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// compareTo is implemented in String class that implements Compaarable
		// interface and compares strings lexicographically
		return e1.getName().compareTo(e2.getName());
	}
}
