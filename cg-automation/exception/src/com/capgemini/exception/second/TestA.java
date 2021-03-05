package com.capgemini.exception.second;

public class TestA {
	public static void main(String[] args) {

		System.out.println("main starts");

		if (20 > 10) {
			try {
				throw new ArithmeticException("invalid number");  // it creates the object of exception
                                                    //	and prints the error given by us
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}
