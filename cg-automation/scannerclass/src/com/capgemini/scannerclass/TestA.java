package com.capgemini.scannerclass;

import java.util.Scanner;

public class TestA {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("Enter your age :");
		byte age = sc.nextByte();

		System.out.println("Enter your salary :");
		double salary = sc.nextDouble();

		System.out.println("*****************");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("salary : " + salary);

		sc.close(); // in order to avoid the warning and to protect the data after usage
	}
}
