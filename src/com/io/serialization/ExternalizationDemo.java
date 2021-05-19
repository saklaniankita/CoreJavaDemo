package com.io.serialization;

import java.io.*;
import java.util.Date;

/**
 * 
 * In serialization, the Java Virtual Machine is totally responsible for the
 * process of writing and reading objects. This is useful in most cases, as the
 * programmers do not have to care about the underlying details of the
 * serialization process. However, the default serialization does not protect
 * sensitive information such as passwords and credentials.
 * 
 * Thus externalization comes to give the programmers full control in reading
 * and writing objects during serialization.
 * 
 * @author Ankita
 * 
 */
public class ExternalizationDemo {
	private String filePath = "user.ser";

	public void serialize() throws IOException {
		User user = new User();

		user.setCode(123);
		user.setName("Tom");
		user.setBirthday(new Date());
		user.setPassword("secret123");
		user.setSocialSecurityNumber(1234567890);

		// serialize object's state
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		outputStream.writeObject(user);
		outputStream.close();

		System.out.println("User's details before serialization:\n" + user);
		System.out.println("Serialization done");
	}

	public void deserialize() throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		User user = (User) inputStream.readObject();
		inputStream.close();

		System.out.println("User's details afeter de-serialization:\n" + user);
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ExternalizationDemo demo = new ExternalizationDemo();

		demo.serialize();

		System.out.println("\n=============\n");

		demo.deserialize();

	}
}
