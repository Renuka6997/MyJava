package com.capgemini.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {

		Person p = new Person();
		System.out.println("age : " + p.age);
		p.walk();
		p.eat();
		System.out.println("cost : " + p.m.cost);
		p.m.write();

	}
}
