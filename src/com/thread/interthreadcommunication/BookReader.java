package com.thread.interthreadcommunication;

/**
 * This is the thread that will wait till it gets notification from the other
 * thread
 * 
 * @author Ankita
 * 
 */
public class BookReader implements Runnable {
	Book book;

	public BookReader(Book book) {
		super();
		this.book = book;
	}

	@Override
	public void run() {
		synchronized (book) {
			System.out.println(
					Thread.currentThread().getName() + " is waiting for the book to be competed " + book.getTitle());
			try {
				book.wait(); // BookReader thread will wait and release the lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + ", Book has  been completed Now!! You can Read it!!");
		}
	}
}
