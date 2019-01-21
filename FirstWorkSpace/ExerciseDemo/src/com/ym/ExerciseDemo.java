package com.ym;

import java.util.Scanner;

public class ExerciseDemo {

	public static void main(String[] args) {
//		System.err.println(getSeasonWithMouth());
//		printAllHW();
		System.out.println(sumForIntArr());;
	}
	
	// 根据月份拿季节
	private static String getSeasonWithMouth() {
		
		System.out.println("请输入月份：");
		Scanner sc = new Scanner(System.in);
		int inputMonth = sc.nextInt();
		while (inputMonth > 12 || inputMonth <= 0) {
			System.out.println("请输入正确的月份");
			inputMonth = sc.nextInt();
		}
		sc.close();
		int season = inputMonth / 4;
		if (season == 0) {
			return "春季";
		}else if (season == 1) {
			return "夏季";
		}else if (season == 2) {
			return "秋季";
		}else {
			return "冬季";
		}
		
	}
	
	// 输出5位数中的回文数
	public static void printAllHW() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					String iStr = "" + i;
					String jStr = "" + j;
					String kStr = "" + k;
					System.out.println(iStr + jStr + kStr + jStr + iStr);
				}
			}
			
		}
	}
	
	// int 数组求和问题
	public static int sumForIntArr() {
		int[] arr = {171, 72, 19, 16, 118, 51, 210, 7, 18};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			String numStr = num + "";
			if (numStr.length() > 1) {
				String geStr = numStr.substring(numStr.length() - 1, numStr.length());
				String shiStr = numStr.substring(numStr.length() - 2, numStr.length() - 1);
				if (geStr != "7" && shiStr != "7" && (num % 2 == 0)) {
					sum += num;
				}
			}
		}
		return sum;
	}
	
	
}
