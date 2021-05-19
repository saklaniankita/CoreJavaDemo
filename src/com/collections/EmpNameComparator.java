package com.collections;

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
		// interface and compares strings lexicographicallyF
		if (e1.getId() > e2.getId()) {
			// System.out.println(e1.getId() +"is bigger than "+e2.getId());
			return 1;
		} else if (e1.getId() < e2.getId()) {
			// System.out.println(e2.getId() +"is bigger than "+e1.getId());
			return -1;
		} else {
			// System.out.println(e1.getId() +"is same as "+e2.getId());
			return 0;
		}
	}
}
