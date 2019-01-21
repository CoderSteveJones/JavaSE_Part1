package com.ym;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student("哈哈", 10);
		Student s1 = new Student("hehei", 13);
		
		Student[] students = new Student[2];
		students[0] = s;
		students[1] = s1;
		for (int i = 0; i < students.length; i++) {
			Student getS = students[i];
			System.out.println(getS.getAge() + getS.getName());
		}
	}
}
