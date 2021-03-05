package com.capgemini.array;

public class TestF {
	public static void main(String[] args) {

		Student[] students = new Student[4];

		Student s1 = new Student(12, "renu", 76);
		Student s2 = new Student(13, "kusu", 75);
		Student s3 = new Student(14, "urmi", 75.9);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (int i = 0; i < students.length - 1; i++) {
			System.out.println("Students data : " + students[i]);
		}
	}
}
