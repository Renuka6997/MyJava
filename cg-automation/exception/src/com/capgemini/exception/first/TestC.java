package com.capgemini.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main starts...");

		int[] nums = { 10, 20, 30 };

		System.out.println(nums[0]);

		try {
			System.out.println(10 / 0);
			System.out.println(nums[4]);

		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println("Index is not present");
		} catch (ArithmeticException e) {
			System.out.println("Dont divide by zero");
		}

		System.out.println("main ends....");
	}
}
