package com.object.equals;

/**
 * Basic use of overriding equals method : We need to override hashcode along with
 * equals method when working with Collections
 * 
 * https://javarevisited.blogspot.com/2013/08/10-equals-and-hashcode-interview.html
 * 
 * @author Ankita
 * 
 */
public class BasicEquals {

	String name;
	int id;

	public BasicEquals(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BasicEquals))
			return false;
		BasicEquals b = (BasicEquals) obj;
		return this.id == b.id && this.name.equals(b.name);
	}

	public static void main(String[] args) {
		BasicEquals a1 = new BasicEquals("Ram", 1);
		BasicEquals a2 = new BasicEquals("Ram", 1);
		BasicEquals a3 = new BasicEquals("Shaym", 1);

		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		System.out.println(a1.equals(a3));
	}
}
