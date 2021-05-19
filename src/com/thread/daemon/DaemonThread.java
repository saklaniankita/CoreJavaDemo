package com.thread.daemon;

/**
 * 1. Daemon threads are utmost low priority threads(EX: Thread that saves the file while you work in
 *    a Text Editor can be set as Daemon thread.)
 * 2. When all user threads are finished, JVM terminates itself .
 * 3. And if JVM finds some running Daemon thread, it terminates the Daemon thread(even if it has NOT 
 *    completed its task)and then terminates itself.
 * 4. setDaemon() method is always called BEFORE you start the thread.
 * 5. If setDaemon() method is called after you start the thread, then IllegalThreadStateException is thrown
 * 6. Daemon thread is to provide services to user thread for background supporting task.
 * 7. So if the remaining threads in the process are only Daemon threads, JVM terminates because there are 
 *    no User threads these Daemon threads can serve. 
 * 
 * 
 * 
 * 
 * @author Ankita
 *
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0;i<5;i++) {
					System.out.println("I am thread t1 : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =0;i<20;i++) {
					System.out.println("I am thread t2 : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.setDaemon(true);
		t2.start();
		//t2.setDaemon(true);
	}
}
