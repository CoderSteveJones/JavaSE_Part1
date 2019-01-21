package com.ym;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {

	// copy一个文件到另一个文件
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("CopyFileDemo.java");
		int ch;
		
		FileWriter writer = new FileWriter("Copy.java");
		while ((ch = reader.read()) != -1) {
			writer.write((char)ch);
		}
		
		reader.close();
		writer.close();
	}
}
