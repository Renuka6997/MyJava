package com.capgemini.constructors.advanced;

public class SubClass extends SuperClass {

	String s = "subclass variable";

	void subMethod() {
		System.out.println("s value is " + s);
		System.out.println("s value is " + this.s);
		System.out.println("s value is " + super.s);

		System.out.println("Sub Class Method...");
	}

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.subMethod();
	}
}
