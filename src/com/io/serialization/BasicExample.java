package com.io.serialization;

import java.io.*;

/**
 * 
 * Advantages of Serialization 1. To save/persist state of an object. 2. To
 * travel an object across a network.
 * 
 * Constructor is not called for serialization/deserialization
 * 
 * @author Ankita
 * 
 */
class BasicExample {
	public static void main(String[] args) {
		Demo object = new Demo(1, "geeksforgeeks");
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
		Demo object1 = null;
		// Deserialization throws IOException & ClassNotFoundException
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (Demo) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.getA());
			System.out.println("b = " + object1.getB());
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}
}
