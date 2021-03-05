package com.capgemini.methodoverriding;

public class TestA {
	public static void main(String[] args) {
		Father f = new Father();
		f.bike();

		System.out.println("*************");

		Son s = new Son();
		s.bike();
//		Father f = new Son();
//		f.bike();
	}
}
