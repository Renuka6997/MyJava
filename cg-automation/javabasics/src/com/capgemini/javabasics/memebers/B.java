package com.capgemini.javabasics.memebers;

public class B {
	static int x = 20;

	public static void main(String[] args) {
		System.out.println("B value is " + A.b);
		A a = new A();
		a.showValue();
	}

}
