package com.capgemini.array;

public class TestC {
	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40 };
		printArrayData(nums);
		System.out.println("==================");
		
		int[] arrayData = getArray();
		
		/*
		 * for (int i = 0; i < arrayData.length; i++) {
		 * System.out.println("array value : " + arrayData[i]); }
		 */
		
		printArrayData(arrayData);
	}

	static void printArrayData(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("value : " + numbers[i]);
		}

	}

	static int[] getArray() {

		int[] myArray = { 70, 80, 90, 100 };
		return myArray;
	}
}
