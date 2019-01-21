package com.ym_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.standard.MediaName;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
//		method1(set);
	
//		method2(set);
	
		for (String string : set) {
			System.out.println(string);
		}
	
	}


	private static void method2(Set<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	/// 方法一
	public static void method1(Set<String> set) {
		
		Object[] objects = set.toArray();
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
		
	}


}
