package com.capgemini.advancedjava.i;

public interface MyInterface {

	void myAbstractMethod();

	public static void myStaticMethod() {
		System.out.println("Interface static method...");
	}

	public default void myDefaultMethod() {
		System.out.println("Inteface default method...");
	}
	/*
	 * No instance methods are allowed 
	 * public void x() { }
	 */
}
