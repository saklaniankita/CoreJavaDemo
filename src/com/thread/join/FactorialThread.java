package com.thread.join;

import java.math.BigInteger;
import java.util.*;

public class FactorialThread extends Thread {
	private Long inputNumber;
	private BigInteger result = BigInteger.ZERO;
	private boolean isFinished = false;
	
	public FactorialThread(Long inputNumber) {
		super();
		this.inputNumber = inputNumber;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public BigInteger getResult() {
		return result;
	}
	
	public Long getInputNumber() {
		return inputNumber;
	}

	public BigInteger findFactorial(long num) {
		BigInteger tmp = BigInteger.ONE;
		for (long i = num; i >= 1; i--) {
			tmp = tmp.multiply(new BigInteger(Long.toString(i)));
		}
		return tmp;
	}
	
	public void run() {
		this.result = findFactorial(this.inputNumber);
		this.isFinished = true;
	}
	
	public static void main(String[] args) throws InterruptedException {
		List<Long> numbers = Arrays.asList(18L, 23L, 5312L, 567L, 87899L, 659L);
		List<FactorialThread> threads = new ArrayList<FactorialThread>();
		for(Long num : numbers) {
			threads.add(new FactorialThread(num));
		}
		
		for(Thread thread: threads) {
			thread.start();
			thread.join(2000);
		}
		
		
		//Thread.sleep(1000);
		for(FactorialThread factorial : threads) {
			if(factorial.isFinished()) {
				System.out.println("Factorial of ***"+factorial.getInputNumber()+" is "+factorial.getResult());
			}else {
				System.out.println(Thread.currentThread().getState());
				System.out.println("Factorial of "+factorial.getInputNumber()+" is still being calculated");
			}
		}
	}

}
