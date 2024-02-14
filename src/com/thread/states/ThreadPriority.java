package com.thread.states;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("In RUN method :" + Thread.currentThread().getName());
			}
		});
		thread1.setName("THREAD A");
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("In RUN method :" + Thread.currentThread().getName());
			}
		});
		thread2.setName("THREAD B");
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("In RUN method :" + Thread.currentThread().getName());
			}
		});
		thread3.setName("THREAD C");
		thread3.setPriority(Thread.NORM_PRIORITY);
		
		thread1.start();
		Thread.sleep(1000);
		thread2.start();
		Thread.sleep(1000);
		thread3.start();
	}
}
