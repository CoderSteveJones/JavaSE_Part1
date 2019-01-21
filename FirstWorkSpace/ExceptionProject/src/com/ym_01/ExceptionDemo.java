package com.ym_01;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			checkScore(120);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e);;
		}
		
		
	}
	
	
	public static Boolean checkScore(double score) {
		
		if (score > 0 && score < 100) {
			return true;
		}else {
			throw new MyException("分数不对");
		}
	}
	
}

class MyException extends RuntimeException {

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}