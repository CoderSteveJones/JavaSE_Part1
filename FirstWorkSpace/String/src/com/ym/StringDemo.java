package com.ym;

public class StringDemo {

	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 4, 5, 6};
//		transArrToStr(arr);
		
		System.out.println(reverseStr("helloworld"));
	}
		
	
	
	public static void caculateCount(String str) {
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch > 'A' && ch < 'Z') {
				bigCount ++;
			}else if (ch > 'a' && ch < 'z') {
				smallCount ++;
			}else if (ch > '0' && ch < '9') {
				numberCount ++;
			}
		}
		System.out.println("大写个数"+ bigCount + "小写个数" + smallCount + "数字个数" + numberCount);
	}
	
	public static void transArrToStr(int[] arr) {
		
		String contentStr = "";
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (i != arr.length - 1) {
				contentStr = contentStr + num + ", ";
			}else {
				contentStr = contentStr + num;
			}
		}
		System.out.println("[" + contentStr + "]");
	}
	
	public static String reverseStr(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();		
	}
}
