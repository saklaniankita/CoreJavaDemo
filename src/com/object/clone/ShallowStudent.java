package com.object.clone;

/**
 * 
 * This is an example of Shallow Cloning
 * 
 * Default implementation of clone() method in Java provides "shallow copy" of
 * object, because it creates copy of Object by creating new instance and then
 * copying content by assignment, which means if your class contains a mutable
 * field, then both original object and clone will refer to same internal object
 * i.e references are also copied. This can be dangerous because any change made
 * on that mutable field will reflect in both original and copy object.
 * 
 * Here we see that after cloning is done, changes made in immutable fields are
 * not reflected in cloned object.But since it is a shallow copy, original
 * object and cloned object, both, will be pointing to same course object the
 * same and hence even after cloning, changes made in one object are reflected
 * in the other
 * 
 * @author Ankita
 * 
 */
public class ShallowStudent implements Cloneable {
	private String name;;
	private int id;
	private Course course;

	public ShallowStudent(String name, int id, Course course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course = new Course("English", "Maths");
		ShallowStudent student1 = new ShallowStudent("Ajay", 1, course);
		ShallowStudent student2 = (ShallowStudent) student1.clone();

		// changing values in student1
		student1.name = "Vijay";
		student1.course.subject1 = "SUPW";

		System.out.println("student1........");
		System.out.println("student1.name = " + student1.name);
		System.out.println("student1.course.subject1 = " + student1.course.subject1);
		System.out.println("student2.........");
		System.out.println("student2.name = " + student2.name);
		System.out.println("student2.course.subject1 = " + student2.course.subject1);
	}
}

class Course {
	String subject1;
	String subject2;

	Course(String subject1, String subject2) {
		this.subject1 = subject1;
		this.subject2 = subject2;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
}
