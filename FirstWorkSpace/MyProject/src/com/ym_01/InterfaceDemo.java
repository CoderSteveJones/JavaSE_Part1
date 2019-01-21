package com.ym_01;

public class InterfaceDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
	}
}

interface Animal {
	public abstract void eat();
}

class Cat implements Animal {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("小猫吃饭");
	}
}