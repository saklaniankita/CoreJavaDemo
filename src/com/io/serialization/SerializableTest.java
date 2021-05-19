package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Here the Serializable class contains a reference which is NOT serializable.
 * So it throws IOException
 * 
 * @author Ankita
 * 
 */
public class SerializableTest implements Serializable {
	private static final long serialVersionUID = 3465418881433280228L;
	int p = 10;
	String q = "Hello";

	// This property will cause IOException because it is NOT serializable
	NonSerializable r = new NonSerializable();

	public static void main(String[] args) {
		SerializableTest object = new SerializableTest();
		String filename = "file1.ser";
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
			System.out.println("IOException is caught during Serialization");
		}
		SerializableTest object1 = null;
		// Deserialization throws IOException & ClassNotFoundException
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (SerializableTest) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("p = " + object1.p);
			System.out.println("q = " + object1.q);
			System.out.println("r = " + object1.r);
		} catch (IOException ex) {
			System.out.println("IOException is caught during Deseriaization");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
