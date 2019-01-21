package com.ym;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c.txt");
		System.out.println(reader.read());
		System.out.println(reader.read());
		System.out.println(reader.read());
		System.out.println(reader.read());
	}
}
