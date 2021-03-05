package com.capgemini.javabasics.memebers;

public class A {
	static int b = 10;
	int c = 20;

	public static void main(String[] args) {
		System.out.println("B value = " + b);//here b is a global and static variable
		A a = new A();
		System.out.println("C value = " + a.c);//here c is a non static variable
		add();
		a.showValue();//calling non static method using class name
	}

	static void add() {
		int sum = 10 + 20;
		System.out.println("Sum is " + sum);
	}

	void showValue() {
		System.out.println("B value = " + b);
		System.out.println("C value = " + c);
		add();
	}

}
