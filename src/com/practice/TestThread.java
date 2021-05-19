package com.practice;

public class TestThread {
	static private String str1 = "hey";
	static private String str2 = "there";

	static Thread one = new Thread() {
		public void run() {
			synchronized (str1) {
				System.out.println("Locked has been put on str1 by thread one");
				synchronized (str2) {
					System.out.println("Locked has been put on str2 by thread one");
				}
			}
		}
	};

	static Thread two = new Thread() {
		public void run() {
			synchronized (str1) {
				System.out.println("Lock as been put on str2 by thread two");
				synchronized (str2) {
					System.out.println("Lock has been put on str1 by thread two");
				}
			}
		}
	};

	public static void main(String[] args) {
		one.start();
		two.start();
	}
}
