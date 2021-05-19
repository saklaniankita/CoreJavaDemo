package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1. Fields can never be final and volatile both because ultimate aim for both
 * keywords is totally unrelated and different. Volatile keyword maintains
 * single copy of variable in the main memory so that all changes are done in
 * that one copy only. Whereas final keyword has only one constant value
 * throughout the program.
 * 
 * 2. CONSTRUCTOR IS NOT INVOKED DURING DESERIALIZATION
 * 
 * STATIC > TRANSIENT > VOLATILE FINAL > TRANSIENT if variable is initialized
 * while declaraing TRANSIENT > FINAL if varibale is initialized in constructor
 * FINAL & VOLATILE together gives CTE
 * 
 * 
 * @author Ankita
 * 
 */
public class Sample implements Serializable {
	private int a = 1;
	private String b = "String";

	// Does not participate in serialization and gives default value 0
	private transient int c = 2;

	// Does not participate in serialization and gives default value null
	private transient String d = "Transient String";

	// Volatile behaves normally on serialization
	private volatile int e = 3;
	private volatile String f = "Volatile String";

	// Static variables belong to a class and not to any individual instance.
	// The concept of serialization is concerned with the object's current
	// state. Only data associated with a specific instance of a class is
	// serialized, therefore static member fields are ignored during
	// serialization
	private static int g = 4;
	private static String h = "Static String";

	// Final field deserializes normally
	private final int i = 5;
	private final String j = "Final String";

	// Final & transient variable initialized while declaring, then variable
	// will have the same value after desrialization i.e transient keyword will
	// play no role
	private final transient int k1 = 6;

	// Final & transient variable is initialized in the constructor/instance
	// block, then transient keyword dominates and the variable doesnot
	// participate in serialization and its value is set to default value, 0 for
	// int & NULL for String
	private final transient int k2;

	// static variable does not participate in serialization. So its value will be
	// intact
	private final static int l = 7;

	// transient dominates and be given a default value
	private transient volatile int m = 8;

	// static dominates and is not serialized
	private transient static int n = 9;

	// static dominates and is not serialized
	private static volatile int o = 10;

	// static dominates and is not serialized
	private static volatile transient int p = 11;

	// private volatile final k = 7; //NOT ALLOWED GIVES COMPILE TIME ERROR

	Sample() {
		k2 = 66;
		System.out.println("Sample Default Constructor Called");
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream("test.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(s1);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught while Serializing");
			ex.printStackTrace();
		}
		Sample s2 = null;
		// Deserialization throws IOException & ClassNotFoundException
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream("test.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			s2 = (Sample) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("int a : " + s2.a);
			System.out.println("String b : " + s2.b);
			System.out.println("transient int c : " + s2.c);
			System.out.println("transient String d : " + s2.d);
			System.out.println("volatile int e : " + s2.e);
			System.out.println("volatile String f : " + s2.f);
			System.out.println("static int g : " + s2.g);
			System.out.println("static String h : " + s2.h);
			System.out.println("final int i : " + s2.i);
			System.out.println("final String j : " + s2.j);
			System.out.println("final transient int k1 : " + s2.k1);
			System.out.println("final transient int k2 : " + s2.k2);
			System.out.println("final static int l : " + s2.l);
			System.out.println("transient volatile int m : " + s2.m);
			System.out.println("transient static int n : " + s2.n);
			System.out.println("static volatile int o : " + s2.o);
			System.out.println("static volatile transient int p : " + s2.p);

			System.out.println("");
		} catch (IOException ex) {
			System.out.println("IOException is caught while Deserializing");
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
