package com.object.clone;

/**
 * This example shows why we need clone method
 * 
 * Here we are copying object c1 to object c2. And if we change values of c1
 * even after copying, those changes will be reflected in the new object c2.
 * 
 * if we do not want changes made in the first object to reflect in the second
 * object after copying is done, then we should go for cloning
 * 
 * @author Ankita
 * 
 */
public class CloneOne {
	int no;
	String name;
	InternalClass obj;

	CloneOne(int no, String name, int serial) {
		this.no = no;
		this.name = name;
		this.obj = new InternalClass(10);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InternalClass getObj() {
		return obj;
	}

	public void setObj(InternalClass obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		CloneOne c1 = new CloneOne(1, "Ram", 10);
		CloneOne c2 = c1;

		System.out.println("After Copying c1 to c2.............");
		System.out.println("c2.name : " + c2.name);
		System.out.println("c2.no : " + c2.no);
		System.out.println("c2.obj.serial : " + c2.obj.serial);

		// Changing name in c1
		c1.setName("Lakhan");
		c1.setObj(new InternalClass(11));
		System.out.println("Afetr changing name for c1");
		System.out.println("c2.no : " + c2.no);
		System.out.println("c2.name : " + c2.name);
		System.out.println("c2.obj.serial : " + c2.obj.serial);
	}
}
