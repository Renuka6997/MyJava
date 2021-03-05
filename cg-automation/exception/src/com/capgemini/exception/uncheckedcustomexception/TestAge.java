package com.capgemini.exception.uncheckedcustomexception;

public class TestAge {
	public static void main(String[] args) {

		System.out.println("main starts");

		Validator v = new Validator();
		v.verifyAge(20);

		System.out.println("main ends");

	}
}
