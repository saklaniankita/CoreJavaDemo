package com.example;

public class Employee implements Cloneable {
	private int id;
	private String name;

	public Employee() {
		super();
		System.out.println("in default cnst");
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		super();
		System.out.println("in params");
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		/*
		 * if(!(o instanceof Employee)) return false; else{ Employee e = (Employee)o;
		 * return (e.id==this.id && e.name.equals(this.name)); }
		 */
		System.out.println("in equals");
		return false;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
