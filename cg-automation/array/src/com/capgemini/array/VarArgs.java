package com.capgemini.array;

public class VarArgs {
	public static void main(String[] args) {

		add(20, 30);
		add(10, 20, 30);

	}

	static void add(int... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		System.out.println("total sum = " + sum);
	}
}
