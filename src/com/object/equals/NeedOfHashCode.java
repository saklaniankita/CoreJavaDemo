package com.object.equals;

import java.util.HashMap;

/**
 * Equals & hashcode contract comes into picture when using hashed collections.
 *
 * Even if two different objects return true for equals methods,they will be
 * stored as different objects in the hash based collection because the hashcode
 * methode has still not been overriden and returns different value for both objects.
 * That is why we need to override hashcode method as well along with equals
 * method to get the desired behaviour
 *
 * 1) If two objects are equal, then they must have the same hash code. 2) If
 * two objects have the same hash code, they may or may not be equal..... Here
 * we need to override hashcode method as well. Though equals method returns
 * true for a1 and new NeedOfHashCode("green") BUT hashcode returns different
 * value for both objects. Thus new object is not found in the Hashmap.
 *
 *
 *
 *
 *
 *
 * @author Ankita
 *
 */
public class NeedOfHashCode {
	private String color;

	public NeedOfHashCode(String color) {
		this.color = color;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof NeedOfHashCode))
			return false;
		if (obj == this)
			return true;
		return this.color.equals(((NeedOfHashCode) obj).color);
	}


	@Override
	public String toString() {
		return color;
	}

	/**
	 * See the difference in output with and without hashcode method
	 */
	@Override
	public int hashCode() {
		return (31 + this.color.hashCode());
	}


	public static void main(String[] args) {
		NeedOfHashCode a1 = new NeedOfHashCode("red");
		NeedOfHashCode a3 = new NeedOfHashCode("red");
		NeedOfHashCode a2 = new NeedOfHashCode("green");

		// hashMap stores apple type and its quantity
		HashMap<NeedOfHashCode, Integer> m = new HashMap<NeedOfHashCode, Integer>();
		m.put(a1, 10);
		m.put(a3, 30);
		m.put(a2, 20);
		System.out.println(m);
		System.out.println(m.get(new NeedOfHashCode("red")));
	}
}