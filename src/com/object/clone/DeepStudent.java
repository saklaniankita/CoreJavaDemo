package com.object.clone;

/**
 * This is an example of Deep Cloning
 * 
 * Deep copy of an object will have exact copy of all the fields of original
 * object just like shallow copy. But in additional, if original object has any
 * references to other objects as fields, then copy of those objects are also
 * created by calling clone() method on them. That means clone object and
 * original object will be 100% disjoint. They will be 100% independent of each
 * other. Any changes made to clone object will not be reflected in original
 * object or vice-versa.
 * 
 * Here the cloned instances points to separate Syllabus objects. Thus after
 * cloning is done, changes made in original object will not be reflected in
 * cloned object.
 * 
 * IMPORTANT if mutable field is final it can not be set inside clone method. So
 * this comes as a shortcoming of cloning
 * 
 * @author Ankita
 * 
 */
public class DeepStudent implements Cloneable {
	private String name;;
	private int id;
	private Syllabus syllabus;

	public DeepStudent(String name, int id, Syllabus syllabus) {
		this.name = name;
		this.id = id;
		this.syllabus = syllabus;
	}

	// overriding Default version of clone() method. It creates deep copy of an
	// object.
	@Override
	public Object clone() throws CloneNotSupportedException {
		DeepStudent student = (DeepStudent) super.clone();

		// try commenting this line and see the difference in output
		student.syllabus = (Syllabus) syllabus.clone();
		return student;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Syllabus syl = new Syllabus("English", "Maths");
		DeepStudent student1 = new DeepStudent("Ajay", 1, syl);
		DeepStudent student2 = (DeepStudent) student1.clone();

		// changing values in student1
		student1.name = "Vijay";
		student1.syllabus.subject1 = "SUPW";

		System.out.println("student1........");
		System.out.println("student1.name = " + student1.name);
		System.out.println("student1.course.subject1 = " + student1.syllabus.subject1);
		System.out.println("student2.........");
		System.out.println("student2.name = " + student2.name);
		System.out.println("student2.course.subject1 = " + student2.syllabus.subject1);
	}
}

class Syllabus implements Cloneable {
	String subject1;
	String subject2;

	Syllabus(String subject1, String subject2) {
		this.subject1 = subject1;
		this.subject2 = subject2;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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