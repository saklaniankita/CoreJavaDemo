package com.abstractclass;

/**
 * 
 * Prior to Java 8, we could have only method declarations in the interfaces.
 * They were Public & abstract by default
 * But from Java 8, we can have default methods and static methods in the interface
 * 
 * It has been allowed from Java8, because previously in case we want to add any new method in interface,
 * then we would have to provide its implementation in all the implementing classes otherwise the code would break. 
 * But with this new feature, we can directly provide the implementation in the interface without breaking the code.
 * 
 * @author Ankita
 *
 */
public interface Java8Interface1 {
	void method1(String str);
	
	/**
	 * Default methods can be further overridden in implementing classes
	 */
	default void method2() {
		System.out.println("Default Method implementation in Interface");
	}
	
	/**
	 * Since these methods are static, we cannot override them in the implementation classes.
	 */
	static void method3() {
		System.out.println("Static Method implementation in Interface");
	}
}
