package com.ym;

public class Student {

	private String num;
	private String name;
	private String age;
	private String address;
	// init
	public Student(String num, String name, String age, String address) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	// get set
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
