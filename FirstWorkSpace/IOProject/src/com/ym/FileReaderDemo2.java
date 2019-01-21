package com.ym;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("CopyFileDemo.java");
		
		char[] chs = new char[1024];
		int len;
		while ((len = reader.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		reader.close();
	}
}
