package com.capgemini.exception.checkedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("main starts");

		ValidateAmount v = new ValidateAmount();
		try {

			v.verifyAmount(400000);

		} catch (InvalidAmountException e) {
			String s = e.getMessage();
			System.err.println(s);
		}
		System.out.println("main ends");
	}
}
