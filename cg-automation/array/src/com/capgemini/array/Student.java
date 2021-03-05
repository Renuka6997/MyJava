package com.capgemini.array;
//test f
public class Student {

	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) { //right click source - generate constructor using fields
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override     //right click- source - generate to string method
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	/*
	 * here the method should be OverRided in order to print the required output or
	 * else string representation will get printed
	 */

}
