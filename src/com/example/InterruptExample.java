package com.example;

public class InterruptExample {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		thread.start();
		Thread.sleep(3000);
		System.out.println("Main Thread Exiting......Please finish Fast");
		Thread.sleep(1000);
		thread.interrupt();
		System.exit(0);
	}
}
