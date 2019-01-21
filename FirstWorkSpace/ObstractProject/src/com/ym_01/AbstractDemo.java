package com.ym_01;

public class AbstractDemo {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
	
}

abstract class Animal {
	
	public abstract void eat();
	
	
}

class Dog extends Animal {

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("小狗吃饭");
	}
	
}