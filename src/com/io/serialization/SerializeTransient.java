package com.io.serialization;

import java.io.*;

/**
 * when variable with transient modifier is encountered, then that variable’s
 * original value is discarded and instead default value is stored into file
 * storage
 * 
 * @author Ankita
 * 
 */
public class SerializeTransient implements Serializable {

	private static final long serialVersionUID = 1L;
	int a;
	transient int b;
	transient int c;
	transient String d;

	public SerializeTransient() {
		a = 10;
		b = 11;
		c = 12;
		d = "HELLO";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			os.writeInt(b);
			os.writeInt(c);
			os.writeObject(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			b = is.readInt();
			c = is.readInt();
			d = (String) is.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SerializeTransient obj = new SerializeTransient();
		String filename = "file.ser";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		SerializeTransient object1 = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (SerializeTransient) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			System.out.println("c = " + object1.c);
			System.out.println("d = " + object1.d);
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}
}
