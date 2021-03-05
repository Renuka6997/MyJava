package com.capgemini.oops;

public class TestA {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subtract();

		SciCalculator sciCalculator=new SciCalculator();
		sciCalculator.sin();
		sciCalculator.cos();
		sciCalculator.add();
		sciCalculator.subtract();
	}
}
