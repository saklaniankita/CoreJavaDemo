package com.io.serialization;

import java.io.*;

/**
 * Here 1)SuperParent is marked serialized 2)Parent is NOT marked serializable
 * 3)Child class is marked serializable
 * 
 * This program shows that If Parent class is Serializable then child class is
 * by default Serializable
 * 
 * To stop the automatic serialization, you can once again use the private
 * methods to just throw the NotSerializableException. Here is how that would be
 * done: private void writeObject(ObjectOutputStream out) throws IOException {
 * throw new NotSerializableException("Not today!"); } private void
 * readObject(ObjectInputStream in) throws IOException { throw new
 * NotSerializableException("Not today!"); }
 * 
 * If SuperParent is not marked serializable, then for both SuperParent and
 * Parent classes, default constructor would be called at the time of
 * deserialization
 * 
 * @author Ankita
 * 
 */
public class Child extends Parent implements Serializable {
	private static final long serialVersionUID = 1L;
	int c = 11;
	String d = "HeyChild";

	Child() {
		System.out.println("Child class Default Constructor " + c + "   " + d);
	}

	public static void main(String[] args) {
		Child object = new Child();
		String filename = "file.ser";
		// Serialization throws IOException
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		Child object1 = null;
		// Deserialization throws IOException & ClassNotFoundException
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (Child) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			System.out.println("c = " + object1.c);
			System.out.println("d = " + object1.d);
			System.out.println("SuperA = " + object1.superA);
			System.out.println("SuperB = " + object1.superB);
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
