package com.capgemini.exception.first;

public class TestF {
	public static void main(String[] args) {

		System.out.println("main starts");

		int[] n = { 10, 20, 30 };
		try {
			String s = null;
			int len = s.length();
		} catch (NullPointerException e) {
			System.out.println("accessing method with null reference");
		}

		try {
			System.out.println(n[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("index is not present");
		}

		System.out.println("main ends");
	}
}
