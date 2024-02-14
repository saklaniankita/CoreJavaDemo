package com.object.clone;

import java.util.ArrayList;
import java.util.List;

public class DeepCloneTest implements Cloneable {
	private String name;
	private int age;
	List<String> certifications;

	public DeepCloneTest(String name, int age, List<String> certifications) {
		this.name = name;
		this.age = age;
		this.certifications = certifications;
	}

	// Overriding clone method of Object class
	// Note : it is better to return actual class than Object class because this
	// will help to avoid type casting while calling clone method
	@Override
	public Object clone() throws CloneNotSupportedException {
		DeepCloneTest clone = (DeepCloneTest) super.clone();
		List<String> list = new ArrayList<String>(certifications);
		clone.setCertifications(list);
		return clone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getCertifications() {
		return certifications;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> certs = new ArrayList<String>();
		certs.add("CERT1");
		certs.add("CERT2");
		certs.add("CERT3");

		DeepCloneTest obj = new DeepCloneTest("Ajay", 24, certs);
		DeepCloneTest clonedObj = (DeepCloneTest) obj.clone();

		System.out.println("Clone done......");

		List<String> certList = obj.getCertifications();
		certList.add("CERT4");
		certList.add("CERT5");

		obj.setCertifications(certList);
		System.out.println("After change in obj certificates");
		System.out.println("obj.getCertifications() : " + obj.getCertifications());
		System.out.println("clonedObj.getCertifications() : " + clonedObj.getCertifications());

	}
}