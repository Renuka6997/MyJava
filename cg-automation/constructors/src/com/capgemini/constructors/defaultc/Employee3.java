package com.capgemini.constructors.defaultc;

public class Employee3 {
	String ename;
	int eid;
	double esalary;
	String epassport;

	Employee3(String name, int id, String passport, double salary) {
		ename = name;
		eid = id;
		epassport = passport;
		esalary = salary;
	}

	Employee3(String name, int id, double salary) {
		ename = name;
		eid = id;
		esalary = salary;
	}

	void printEmployeeDetails() {
		System.out.println("----Employee Details-----");
		System.out.println("Name is " + ename);
		System.out.println("ID is " + eid);
		if (epassport != null) {
			System.out.println("Passport = " + epassport);
		}
		System.out.println("Salary is " + esalary);
	}
}
