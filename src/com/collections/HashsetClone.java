package com.collections;

import java.util.*;

/**
 * Shallow cloning is done in HashSet Changes made to original set after cloning
 * are not reflected in the cloned set
 * 
 * @author Ankita
 *
 */
public class HashsetClone {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ram");
		Employee e2 = new Employee(2, "Shyam");
		Employee e3 = new Employee(3, "gfdfsa");
		Employee e4 = new Employee(4, "euereiu");

		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);

		HashSet<Employee> clonedEmpSet = new HashSet<Employee>();
		clonedEmpSet = (HashSet) empSet.clone();

		System.out.println("Original Set : " + empSet);
		System.out.println("Cloned Set : " + clonedEmpSet);

		Employee e5 = new Employee(5, "newName");
		empSet.add(e5);

		System.out.println("New Original Set : " + empSet);
		System.out.println("New Cloned Set : " + clonedEmpSet);

	}
}
