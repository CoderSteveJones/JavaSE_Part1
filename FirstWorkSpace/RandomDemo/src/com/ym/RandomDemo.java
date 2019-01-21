package com.ym;

import java.util.Random;

import java.util.Scanner;


public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		int randomN = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要猜的数：");
		int inputN = sc.nextInt();
		while (inputN != randomN) {
			if(inputN > randomN) {
				System.out.println("猜大了，请重新输入你要猜的数：");
			}else {
				System.out.println("猜小了，请重新输入你要猜的数：");
			}
			inputN = sc.nextInt();
		}
		
		sc.close();
		System.out.println("恭喜你猜对了，随机数=" + randomN);
		
	}
	

}







