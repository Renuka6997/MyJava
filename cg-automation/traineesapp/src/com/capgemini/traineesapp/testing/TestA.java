package com.capgemini.traineesapp.testing;

import com.capgemini.traineesapp.development.Angular;
import com.capgemini.traineesapp.development.React;

public class TestA {
	public static void main(String[] args) {
		Selenium s = new Selenium();
		s.teachSelenium();

		System.out.println("****************");

		QTP q = new QTP();
		q.teachQTP();

		System.out.println("*******************");

		React r = new React();
		r.teachReact();

		System.out.println("############################");

		Angular a = new Angular();
		a.teachAngular();

	}
}
