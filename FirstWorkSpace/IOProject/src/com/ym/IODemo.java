package com.ym;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("a.txt"); 
//		fw.write("IOhahh");
//		fw.flush();
//		fw.close();
//		
		FileWriter fw1 = new FileWriter("b.txt");
		fw1.write(10);
		fw1.flush();
		fw1.close();
	}
}
