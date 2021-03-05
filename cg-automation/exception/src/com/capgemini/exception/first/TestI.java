package com.capgemini.exception.first;

public class TestI {
	public static void main(String[] args) {

		System.out.println("main starts..");

		print();

		System.out.println("main ends..");
	}

	static void print() {
		System.out.println("print starts");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("print ends");
	}
}
