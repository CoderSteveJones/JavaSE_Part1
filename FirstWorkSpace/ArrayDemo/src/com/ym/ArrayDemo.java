package com.ym;


public class ArrayDemo {
	
	public static void main(String[] args) {
		// 一维数组遍历
		int[] arr = {1, 2, 3};
		for (int i = 0;i < arr.length;i ++) {
			System.out.println(arr[i]);
			
		}
		
		int[][] arr1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		for (int i = 0; i < arr1.length; i++) {
			int[] subArr = arr1[i];
			for (int j = 0; j < subArr.length; j++) {
				System.out.println(subArr[j]);
			}
		}
	}
}
