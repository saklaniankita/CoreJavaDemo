package com.example;

class TestJoinMethod2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				// Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod2 t1 = new TestJoinMethod2();
		t1.setName("A");
		TestJoinMethod2 t2 = new TestJoinMethod2();
		t2.setName("B");
		TestJoinMethod2 t3 = new TestJoinMethod2();
		t3.setName("C");
		t1.start();
		try {
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
