package com.capgemini.exception.first;

public class TestG {
	public static void main(String[] args) {

		System.out.println("main starts");

		int[] nums = { 10, 20, 30 };
		String s = null;

		try {
			System.out.println(nums[4]);
			System.out.println(s.length());
			System.out.println((10 / 0));
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println("main ends");
	}
}
