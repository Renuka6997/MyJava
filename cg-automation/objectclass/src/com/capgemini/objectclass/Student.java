package com.capgemini.objectclass;

public class Student {

	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int hashCode() {
		return id;
	}

	public String toString() {
		return "id = " + id + " " + "name = " + name + " percentage = " + percentage;
	}

	/* (instead of writing the below method , we can override toString() in String class)
	 * 
	 * void printDetails() { 
	 * System.out.println("Student Details");
	 * System.out.println("Id = " + id); System.out.println("Name = " + name);
	 * System.out.println("Percentage = " + percentage); 
	 * }
	 */
}
