package com.ym_01;

public class Student {

	private String name;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}
	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Student(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("好好学习，天天向上");
	}
	public void eat() {
		System.out.println("学习完了 吃饭饭");
	}
}
