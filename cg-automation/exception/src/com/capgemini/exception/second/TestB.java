package com.capgemini.exception.second;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main starts");

		try {
			Thread.sleep(3000);
			System.out.println("woke up after 3 seconds");
		} catch (InterruptedException e) {
			System.out.println("catch block executed");
			e.printStackTrace();
		}

		System.out.println("main ends");
	}
}
