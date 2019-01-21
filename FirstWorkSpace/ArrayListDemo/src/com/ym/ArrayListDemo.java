package com.ym;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] names = {"张三丰", "录制生", "张小毛", "哈哈哈"};
		System.out.println(getZNames(names));
	}
	
	public static ArrayList<String> getZNames(String[] names) {
		ArrayList<String> zNames = new ArrayList<String>();
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if (name.startsWith("张")) {
				zNames.add(name);
			}
		}
		return zNames;
	}
	
	public static ArrayList<String> inputStrs() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("请输入：");
		String inputStr = scanner.nextLine();
		strings.add(inputStr);
		scanner.close();
		return strings;
	}
}
