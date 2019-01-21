package com.ym_01;

public class MyArray {

	private MyArray() {
		
	}
	
	public static int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getIndex(int[] arr,int a) {
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
