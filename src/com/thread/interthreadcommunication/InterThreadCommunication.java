package com.thread.interthreadcommunication;

public class InterThreadCommunication {
	public static void main(String[] args) {
		/**
		 * Object on which wait and notify methods will be called
		 */
		Book book = new Book("THE ALCHEMIST");

		/**
		 * Two reader threads that will wait for completion of book
		 */
		Thread alisThread = new Thread(new BookReader(book), "Alis");
		Thread johnThread = new Thread(new BookReader(book), "John");
		Thread macThread = new Thread(new BookReader(book), "Mac");

		alisThread.start();
		johnThread.start();
		macThread.start();

		/**
		 * To ensure that two threads has started waiting
		 */
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/**
		 * This thread will notify that the book has been completed and that the wait
		 * should be over
		 */
		Thread bookWriterThread = new Thread(new BookWriter(book), "Paulo Coelho");
		bookWriterThread.start();
		// System.exit(0);
	}
}
