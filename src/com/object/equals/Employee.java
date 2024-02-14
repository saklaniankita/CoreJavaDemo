package com.object.equals;

import java.util.HashSet;

/**
 * Try this example as follows 1. Comment Equals and hashcode---> Observe the
 * output. David will not be removed from hashset because equals method is still
 * not overridden and as per default implementation of equals method it is
 * altogether a different element that does not exist in the hashset
 * 
 * 2. Uncomment equals method---> Now that we have overridden equals method,
 * David should be removed from the hashset but that does not happen. HashSet
 * ends up searching for the stored David object in the wrong bucket of the
 * hashtable and so is unable to find and remove it, despite the two objects
 * being equal (using equals() i.e...Please see image Hashing.PNG). 
 * 
 * 3. Uncomment hashcode method--->When searching for an object to be removed
 * using an �equal but different object�, HashSet needs to search for an object
 * in the same bucket. Otherwise, as in our case, with the hashcodes of the 2
 * objects being different, HashSet ends up searching in the wrong bucket and is
 * unable to find the object.
 * 
 * @author Ankita
 * 
 */
public class Employee {
	private String name;
	private Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	// Getters and Setters for name and age go here

	public String toString() {
		return "Employee Name:" + this.name + "  Age:" + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee empObj = (Employee) obj;
		return this.age == empObj.age
				&& this.name.equalsIgnoreCase(empObj.name);
	}

	@Override
	public int hashCode() {
	  int hash = 1;
	  hash = hash * 17 + this.name.hashCode();
	  hash = hash * 31 + this.age;
	  return hash;
	}

	public static void main(String args[]) {
		HashSet<Employee> empHashSet = new HashSet<Employee>();
		empHashSet.add(new Employee("David", 32));
		empHashSet.add(new Employee("David", 32));
		empHashSet.add(new Employee("John", 45));
		System.out.println(empHashSet);
		boolean isRemoved = empHashSet.remove(new Employee("David", 32));
		System.out.println("David is removed: " + isRemoved);
		System.out.println(empHashSet);
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((age == null) ? 0 : age.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Employee))
//			return false;
//		Employee other = (Employee) obj;
//		if (age == null) {
//			if (other.age != null)
//				return false;
//		} else if (!age.equals(other.age))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

}