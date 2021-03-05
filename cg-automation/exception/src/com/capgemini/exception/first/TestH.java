package com.capgemini.exception.first;

public class TestH {
	public static void main(String[] args) {

		System.out.println("main starts");

		int[] nums = { 10, 20, 30 };
		String s = null;

		try {
			System.out.println(nums[2]);
			System.out.println(s.length());
			System.out.println((10 / 0));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main ends");
	}
}
