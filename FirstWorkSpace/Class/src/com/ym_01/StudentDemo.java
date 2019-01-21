package com.ym_01;

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(10);
		student.setName("haha");
		student.study();
		student.eat();
		
		Student student2 = new Student("hah", 10);
		
	}
}
