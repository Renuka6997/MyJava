package com.capgemini.array;

public class TestD {
	public static void main(String[] args) {

		String[] names = { "Renu", "kusuma", "urmi", "pavani" };
		printNames(names);

	}

	static void printNames(String[] values) {
		for (int i = 0; i <= values.length - 1; i++) {
			System.out.println("name : " + values[i]);
		}
	}
}
