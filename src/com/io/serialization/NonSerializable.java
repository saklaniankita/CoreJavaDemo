package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Here we try to serialize object which does not implement Serializable
 * interface and nor does its superclass. So it throws NotSerializableException
 * 
 * @author Ankita
 * 
 */
public class NonSerializable {
	int x = 1;

	public static void main(String[] args) {
		NonSerializable object = new NonSerializable();
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
		} catch (NotSerializableException ex) {
			System.out.println("NotSerializableException is caught during serialization");
		} catch (IOException ex) {
			System.out.println("IOException is caught during serialization");
		}
		NonSerializable object1 = null;
		// Deserialization throws IOException & ClassNotFoundException
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			object1 = (NonSerializable) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("x = " + object1.x);
		} catch (NotSerializableException ex) {
			System.out.println("NotSerializableException is caught during deserialization");
		} catch (IOException ex) {
			System.out.println("IOException is caught during deserialization" + ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught during deserialization");
		}
	}
}
