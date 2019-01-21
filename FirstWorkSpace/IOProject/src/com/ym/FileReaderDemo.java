package com.ym;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("FileReaderDemo.java");
		int ch;
		while ((ch = reader.read()) != -1) {
			System.out.print((char)ch);
		}
		reader.close();
	}
}
