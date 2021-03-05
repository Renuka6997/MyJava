package com.capgemini.objectclass;

public class TestC {
	public static void main(String[] args) {

		Student s1 = new Student(15, "Renu", 76);

		int id = s1.hashCode();
		System.out.println("s1 id = " + id);

		System.out.println(s1);//here s1 will internally calls to toString() and prints the output
		System.out.println("**********************");

		Student s2 = new Student(58, "Kusuma", 75);

		int sid = s2.hashCode();
		System.out.println("s2 id = " + sid);
		System.out.println(s2);

	}
}
