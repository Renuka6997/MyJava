package com.capgemini.exception.second;

import java.util.Scanner;

public class TestE {
	public static void main(String[] args) {

		System.out.println("main starts");

		Scanner sc = new Scanner(System.in);
		// try with resources---using this it automatically closes the object
		try (Scanner sc1 = new Scanner(System.in); Scanner sc2 = new Scanner(System.in)) {
			System.out.println("Enter number");
			int n = sc1.nextInt();
			System.out.println("n : " + n);
			// we can give multiple objects
		}

		try (Scanner sc3 = new Scanner(System.in)) {

		} catch (Exception e) {
			e.printStackTrace(); //trace the line of exception where occurred
		} finally {
			System.out.println("finally executed");
		}

		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age : " + age);

		System.out.println("main ends");

	}
}
