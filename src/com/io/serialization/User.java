package com.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class User implements Externalizable {
	public static final long serialVersionUID = 1234L;

	// attributes
	private int code;
	private String name;
	private String password;
	private Date birthday;
	private int socialSecurityNumber;

	public User() {
	}

	// methods (getters and setters)
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setSocialSecurityNumber(int ssn) {
		this.socialSecurityNumber = ssn;
	}

	public int getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	/**
	 * we serialize the following attributes: code, name, password and birthday. For
	 * security purpose, password is cleared and socialSecurityNumber is not
	 * serialized. This gives you the ideas of how we can control the process of
	 * serialization by implementing the Externalizable interface.
	 */
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(code);
		out.writeObject(name);

		// write empty password:
		out.writeObject("");

		out.writeObject(birthday);

	}

	/**
	 * we de-serialize the following attributes: code, name, password and birthday.
	 * The socialSecurityNumber is not de-serialized for security purpose. This
	 * gives you the ideas of how we can control the process of de-serialization by
	 * implementing the Externalizable interface.
	 */
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
		this.code = in.readInt();
		this.name = (String) in.readObject();
		this.password = (String) in.readObject();
		this.birthday = (Date) in.readObject();
	}

	public String toString() {
		String details = "Code: " + code;
		details += "\nName: " + name;
		details += "\nBirthday: " + birthday;
		details += "\nPassword: " + password;
		details += "\nSSN: " + socialSecurityNumber;

		return details;
	}
}