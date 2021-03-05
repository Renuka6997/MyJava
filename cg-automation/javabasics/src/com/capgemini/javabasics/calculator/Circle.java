package com.capgemini.javabasics.calculator;

public class Circle {

	static double findAreaOfCircle(double radius) {
		double areaOfCircle = 3.14 * radius * radius;
		return areaOfCircle;
	}

	static double findcircumferenceOfCircle(double radius) {
		double circumferenceOfCircle = 2 * 3.14 * radius;
		return circumferenceOfCircle;
	}

	public static void main(String[] args) {
		double areaOfCircle = findAreaOfCircle(5);
		System.out.println("area of circle" + areaOfCircle);
		double circumferenceOfCircle = findcircumferenceOfCircle(6);
		System.out.println("circumference of circle" + circumferenceOfCircle);
		boolean result=findOddOrEven(5);
		if(result==true) {     
			System.out.println("the number is even"); 
		} else {
			System.out.println("the number is odd");
		}
	} 

	static boolean findOddOrEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
