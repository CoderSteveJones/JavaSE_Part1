package com.ym_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("Copy.java"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("NewCopy.java"));
		
		char[] chs = new char[1024];
		int len;
		while ((len = reader.read(chs)) != -1) {
			writer.write(chs, 0, len);
		}
		
		reader.close();
		writer.close();
	}
}
