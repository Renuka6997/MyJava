package com.capgemini.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main starts...");

		int[] nums = { 10, 20, 30 };

		System.out.println(nums[0]);

		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException a) {
			try {
				int[] n = new int[-1];
			} catch (NegativeArraySizeException aie) {
				System.err.println("Size should be greater than zero");
			}
			System.err.println("Dont divide by zero");
		}

		System.out.println("main ends....");
	}
}
