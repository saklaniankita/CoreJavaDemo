package com.thread.interthreadcommunication;

public class BookWriter implements Runnable {
	Book book;

	public BookWriter(Book book) {
		super();
		this.book = book;
	}

	@Override
	public void run() {
		synchronized (book) {
			System.out.println("Author is starting book " + book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			book.setCompleted(true);
			System.out.println("Book has now been completed !!!!!!!!!!!");
			System.out.println("Notifying ONE waiting reader");
			book.notify();

			// System.out.println("Notifying ALL waiting reader");
			// book.notifyAll();
		}
	}
}
