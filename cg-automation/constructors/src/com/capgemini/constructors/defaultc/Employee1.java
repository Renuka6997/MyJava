package com.capgemini.constructors.defaultc;

public class Employee1 {

	String ename;
	int eid;
	double esalary;

	public Employee1(String name, int id, double salary) {
		this.ename = name;
		this.eid = id;
		this.esalary = salary;
// or it can be written as		ename = name;
//		eid = id;
//		esalary = salary;
	}

	void printEmployeeDetails() {
		System.out.println("------Employee Details-----");
		System.out.println("Name is " + ename);
		System.out.println("ID is " + eid);
		System.out.println("Salary is " + esalary);
	}
}
