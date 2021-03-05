package com.capgemini.advancedjava.i;

public interface B {
	public default void abc() {
		System.out.println("B interface abc method....");
	}
	
	static void xyz() {
		System.out.println("B interface xyz method......");
	}
}