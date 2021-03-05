package com.capgemini.javabasics.calculator;

public class SimpleCalculator {

	static void addTwoNumbers(int x, int y) {
		int sum = x + y;
		System.out.println("Sum =" + sum);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		addTwoNumbers(a, b);
		addTwoNumbers(10, 25);
	}
}
