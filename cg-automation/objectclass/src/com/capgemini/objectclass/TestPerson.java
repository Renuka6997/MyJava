package com.capgemini.objectclass;

public class TestPerson {
	public static void main(String[] args) {

		Person p1 = new Person(10, "Ram", 4567.90);
		Person p2 = new Person(11, "jaanu", 4789.90);
		Person p3 = new Person(10, "Ram", 4567.90);
		Person p4 = p1;

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));

	}
}
