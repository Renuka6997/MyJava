package com.capgemini.array;

public class TestB {
	public static void main(String[] args) {

		String[] names = { "Pavani", "Ram", "Lakshman", "Seeta" };

		for (int i = 0; i < 4; i++) {
			System.out.println("name : " + names[i]);
		}

		System.out.println("==============================");

		for (int i = 0; i < names.length; i++) {
			System.out.println("name : " + names[i]);
		}

	}
}
