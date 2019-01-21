package com.ym_01;

public class ThreadDemo {

	public static void main(String[] args) {
		
//		MyThread thread = new MyThread();
//		thread.setName("线程我饿");
//		thread.start();
		
		MyThread2 thread2 = new MyThread2();
		Thread thread3 = new Thread(thread2);
		thread3.start();
	}
}
