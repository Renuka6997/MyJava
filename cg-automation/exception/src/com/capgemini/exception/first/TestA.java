
package com.capgemini.exception.first;

public class TestA {
	public static void main(String[] args) {

		System.out.println("main starts...");

		int[] nums = { 10, 20, 30 };

		System.out.println(nums[0]);

		try {
			System.out.println(nums[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not present");
		}

		System.out.println("main ends....");
	}
}
