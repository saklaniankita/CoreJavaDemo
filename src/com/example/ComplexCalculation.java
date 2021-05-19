package com.example;

import java.math.BigInteger;

public class ComplexCalculation {

//	BigInteger tmp1 = BigInteger.ONE;
//	BigInteger tmp2 = BigInteger.ONE;

	public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2)
			{
		BigInteger result;

		PowerCalculatingThread t1 = new PowerCalculatingThread(base1, power1);
		PowerCalculatingThread t2 = new PowerCalculatingThread(base2, power2);

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		//Thread.sleep(1000);

		result = t1.getResult().add(t2.getResult());
		return result;
	}

	public static void main(String[] args) throws InterruptedException {
		BigInteger result = new ComplexCalculation().calculateResult(new BigInteger("5"), new BigInteger("2"),
				new BigInteger("2"), new BigInteger("2"));
		System.out.println(result);
	}

	private static class PowerCalculatingThread extends Thread {
		private BigInteger result = BigInteger.ONE;
		private BigInteger base;
		private BigInteger power;

		public PowerCalculatingThread(BigInteger base, BigInteger power) {
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			BigInteger i;
			for (i = BigInteger.ONE; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
				result = base.multiply(result);
			}
		}

		public BigInteger getResult() {
			return result;
		}
	}
}