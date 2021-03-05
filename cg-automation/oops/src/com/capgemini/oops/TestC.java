package com.capgemini.oops;

public class TestC {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Vikram";
		p.color = "white";
		p.gender = 'M';
		p.height = 5.8;
		p.age = 23;

		p.walk();
		p.sleep();

		printPersonDetails(p);
		System.out.println("-------");

		Student s = new Student();
		s.sid = "215";
		s.collegename = "VIIT";
		s.course = "EEE";
		s.percentage = 76;
		s.backlogs = 0;

		s.study();
		s.exam();
		s.walk();
		s.sleep();

		printStudentDetails(s);
		System.out.println("------");

	}

	static void printPersonDetails(Person p) {
		System.out.println("Person name " + p.name);
		System.out.println("Person height " + p.height);
		System.out.println("Person colr " + p.color);
		System.out.println("Person gende " + p.gender);
		System.out.println("Person age " + p.age);
	}

	static void printStudentDetails(Student s) {
		System.out.println("Student ID " + s.sid);
		System.out.println("Student college name " + s.collegename);
		System.out.println("Student course " + s.course);
		System.out.println("Student percentage " + s.percentage);
		System.out.println("Student backlogs " + s.backlogs);
	}
}
