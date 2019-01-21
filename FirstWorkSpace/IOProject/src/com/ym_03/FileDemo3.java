package com.ym_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		
		
	}
	
	public static void writerFileToArr() throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("arr.txt"));
		ArrayList<String> strs = new ArrayList<String>();
		strs.add("hello");
		strs.add("world");
		strs.add("java");
		for (int i = 0; i < strs.size(); i++) {
			bw.write(strs.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	public static void readFileFromArr() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("arr.txt"));
		ArrayList<String> strs = new ArrayList<String>();
		String line;
		while ((line = br.readLine()) != null) {
			strs.add(line);
		}
		br.close();
	}
}
