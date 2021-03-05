package com.capgemini.exception.first;

public class TestD {
	public static void main(String[] args) {

		System.out.println("main starts...");

		int[] nums = { 10, 20, 30 };

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.err.println("dont divide by zero");
		}
		
		try {
			System.out.println(nums[4]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.err.println("Index is not present");
		}

		System.out.println("main ends......");
	}
}
