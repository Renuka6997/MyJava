package com.capgemini.javabasics.memebers;

public class Demo {
	static int p;
	int q;
	String s = "hii";
	static String r = "hello..";

	public static void main(String[] args) {
		final int a = 10; // only final keyword is allowed
		String s1 = "abc";
		/* static int b = 20; no other keywords are allowed */
		int c; 
		/*
		 * System.out.println("C value is " + c); the local variable should be initialized
		 * before using
		 */
		System.out.println("p value is "+p);
		
	}
}
