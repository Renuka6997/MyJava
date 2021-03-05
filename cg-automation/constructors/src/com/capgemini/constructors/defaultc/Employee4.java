package com.capgemini.constructors.defaultc;

public class Employee4 {

	int eid;
	String ename;
	double esalary;

	Employee4(int eid, String ename, double esalary) {
		System.out.println("Constructor executed");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	void printemployeeDetails() {
		System.out.println("----Employee Details-----");
		System.out.println("Name = " + ename);
		System.out.println("Id = " + eid);
		System.out.println("Salary is " + esalary);
	}
}
