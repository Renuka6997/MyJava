package com.capgemini.oops;

public class Student extends Person {
	String sid;
	String collegename;
	String course;
	double percentage;
	int backlogs;

	void study() {
		System.out.println("student is studying");
	}

	void exam() {
		System.out.println("students writes exams");
	}

}
