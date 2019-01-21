package com.ym_01;

public class InnerClassDemo {

	
	public static void main(String[] args) {
		
		Outer.Inner inner = new Outer().new Inner();
		inner.eat();
	}
}

// 成员内部类
class Outer {
	
	class Inner {
		public void eat() {
			System.out.println("吃饭");
		}
	}
}
