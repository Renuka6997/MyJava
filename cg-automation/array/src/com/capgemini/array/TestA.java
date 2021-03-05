package com.capgemini.array;

public class TestA {
	public static void main(String[] args) {

		int[] numbers = new int[5];
		numbers[0] = 20;
		numbers[1] = 30;
		numbers[2] = 40;
		numbers[3] = 50;
		numbers[4] = 60;

		int n1 = numbers[0];
		System.out.println("value at index 0 : " + n1);

		int n4 = numbers[4];
		System.out.println("value at index 4 : " + n4);

		int n2 = numbers[2];
		System.out.println("value at index 2 : " + n2);

		for (int i = 0; i < 5; i++) { // it can be written in 2 ways either this or below one
			System.out.println(numbers[i]);
		}

//		for (int i = 0; i <=numbers.length-1; i++) {
//			System.out.println(numbers[i]);
//		}

		System.out.println("****************************");

		boolean[] values = new boolean[4];
		values[0] = true;
		values[1] = false;
		values[2] = true;

		for (int i = 0; i < 4; i++) {
			System.out.println("boolean value " + values[i]);
		}

	}
}
