package com.capgemini.javabasics.methodoverloading;

public class Calculator {

	/*
	 * Duplicate method error (we should not consider return type for method
	 * overloading) static int addNumbers(int a, int b) { int c = a + b;
	 * System.out.println("Sum is " + c); return c; }
	 */

	void subtractNumbers(int a, int b) {
		int c = a - b;
		System.out.println("value is " + c);
	}

	void subtractNumbers(int a, int b, int c) {
		int d = a - b - c;
		System.out.println("value is " + d);
	}

	static void addNumbers(int a, int b) {
		int c = a + b;
		System.out.println("C value = " + c);
	}

	static void addNumbers(int a, int b, int c) {
		System.out.println("sum = " + (a + b + c));
	}

	public static void main(String[] args) {
		addNumbers(10, 20);
		addNumbers(10, 20, 30);
		main(20,40);
		Calculator calculator = new Calculator();
		calculator.subtractNumbers(20, 10);
		calculator.subtractNumbers(70, 20, 10);
		calculator.main(15);
	}

	static void main(int a, int b) {
		System.out.println("overloaded main method");
		System.out.println("main(int a,int b)" +(a+b));
	}

	void main(int a) {
		System.out.println("overloaded main method");
		System.out.println("main(int a)"+a);
	}
}
