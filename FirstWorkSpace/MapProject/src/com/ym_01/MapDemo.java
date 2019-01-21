package com.ym_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	
	public static void main(String[] args) {
		
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("01", "小明");
//		map.put("02", "小芳");
//		map.put("03", "笑话");
//		
//		Set<Map.Entry<String, String>> entrys = map.entrySet();
//		for (Entry<String, String> entry : entrys) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key + value);
//		}
		
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为0");
		}
		System.out.println("hello");
	}
}
