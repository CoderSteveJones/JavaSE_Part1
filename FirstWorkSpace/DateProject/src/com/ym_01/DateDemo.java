package com.ym_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String dateStr = fm.format(date);
		System.out.println(dateStr);
		Date parseDate = fm.parse(dateStr);
		System.out.println(parseDate);
		
		Integer integer = 10;
		String intStr = integer.toString();
		System.out.println(intStr);
		int i = integer.intValue();
		System.out.println(i);
	} 
}
