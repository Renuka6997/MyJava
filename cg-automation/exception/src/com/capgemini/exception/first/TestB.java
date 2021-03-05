package com.capgemini.exception.first;

public class TestB {
	public static void main(String[] args) {

		System.out.println("main starts.....");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("dont divide by zero...");
		}
		
		System.out.println("main ends........");
	}
}
