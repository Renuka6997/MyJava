package com.capgemini.javabasics.methods;

public class Greeting {

	public static void main(String[] args) {
		String msg = greet("Kusuma");
		System.out.println(msg);
		String msg1 = greet("Samantha");
		System.out.println(msg1);
		double ch=g();
		System.out.println("char value of A is : "+ch);
	}

	static String greet(String name) {
		String message = name + ",Good Morning";
		return message;
	}
	static double g() {
		return 'A';
	}
}
