package com.ym;
import java.util.Scanner;

public class FunDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值：");
		int a = sc.nextInt();
		System.out.println("请输入第二个值：");
		int b = sc.nextInt();
		System.out.println("较大的数："+ moreBigValue(a, b));
		sc.close();
		
	}
	
	public static int sum(int a,int b) {
		return a + b;
	}
	
	public static int moreBigValue(int a,int b) {
		return a > b ? a : b;
	}
	
}
