package com.capgemini.array.enhancedforloop;

public class TestA {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		for (int x : a) {
			System.out.println("x = " + x);
		}

		System.out.println("********************");

		String[] names = { "renu", "urmi", "anu" };
		for (String value : names) {
			System.out.println("Name = " + value);
		}

		System.out.println("***********************");

		double[] b = { 12.2, 34.3, 45.9, 45.8 };
		for (double val : b) {
			System.out.println("val = " + val);
		}
	}
}
