package com.capgemini.advancedjava.i;

public interface A {
	public default void abc() {
		System.out.println("A inteface abc method....");
	}
	
	static void xyz() {
		System.out.println("A interface xyz method");
	}

}
