package com.ym_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectiionDemo {

	public static void main(String[] args) {
//		method1();
		
//		ArrayList<String> strings = new ArrayList<>();
//		strings.add("java");
//		strings.add("eng");
//		strings.add("haha");
//		Collection<String> getStrs = addAndroidStrIfJavaExist(strings);
//		
//		Iterator<String> iterator = getStrs.iterator();
//		while (iterator.hasNext()) {
//			String string = iterator.next();
//			System.out.println(string);	
//		}
		
		LinkedList<String> list = new LinkedList<String>();
		
		Collection<String> strings = new ArrayList<String>();
		strings.add("哈哈哈");
		strings.add("haha");
		for (String string : strings) {
			System.out.println(string);
		}
		
	}

	private static void method1() {
		Collection<String> c = new ArrayList<String>();
		c.add("haha");
		System.out.println(c);
	}
	
	private static Collection<String> addAndroidStrIfJavaExist(Collection<String> c) {
		Iterator<String> iterator = c.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string == "java") {
				c.add("Android");
				break;
			}
		}
		return c;
	}
}
