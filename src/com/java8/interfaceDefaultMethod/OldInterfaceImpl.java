package com.java8.interfaceDefaultMethod;

/**
 * 
 * Before Java 8, interfaces could have only abstract methods. The
 * implementation of these methods has to be provided in a separate class. So,
 * if a new method is to be added in an interface, then its implementation code
 * has to be provided in the class implementing the same interface. To overcome
 * this issue, Java 8 has introduced the concept of default methods which allow
 * the interfaces to have methods with implementation without affecting the
 * classes that implement the interface.
 * 
 * @author Ankita
 *
 */
public class OldInterfaceImpl implements OldInterface {

	@Override
	public void existingMethod() {
		System.out.println("Implemntation of inerface method");
	}

	/**
	 * Default method of interface can be overridden as usual
	 */
	public void newJava8Method(int a) {
		a = a + 1;
		System.out.println("Default Method Overridden " + a);
	}

	// public abstract void newJava8Method(int a);

	public static void main(String[] args) {
		OldInterfaceImpl obj = new OldInterfaceImpl();
		obj.existingMethod(); // Coventional method
		obj.newJava8Method1(3); // New Java8 feature that allows interface to have implemented methods
		obj.newJava8Method(4); // New Java8 feature that allows to override interface implemented methods
		OldInterface.staticMethod();

	}

}
