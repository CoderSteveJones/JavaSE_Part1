package com.ym_01;

public class FactorialDemo {

	public static void main(String[] args) {
		
		System.out.println(factorialFun(5));
		System.out.println(duziShu(20));
	}
	
	public static int factorialFun(int num) {
		
		if (num == 1) {
			return 1;
		}else {
			return num * factorialFun(num -1);
		}
	}
	
	public static int duziShu(int m) {
		if (m == 1) {
			return 1;
		}else if (m == 2) {
			return 1;
		}else {
			return duziShu(m - 1) + duziShu(m - 2);
		}
		
	}
	
	
}
