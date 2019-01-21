package com.ym_01;

public class InterfaceTest {

	public static void main(String[] args) {
		
	}
}

abstract class Athlete {
	
	public abstract void study();
}

abstract class Coach {
	public abstract void teach();
}


interface StudyEnglish {
	public void studyEnglish();
}

class BasketBallAthlete extends Athlete{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("学习篮球");
	}	
}

class PinPonAthlete extends Athlete implements StudyEnglish {

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("学习乒乓");
	}

	@Override
	public void studyEnglish() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球教练学习英语");
	}
}

class BasketBallCoach extends Coach implements StudyEnglish{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("教授篮球");
	}
	
	@Override
	public void studyEnglish() {
		// TODO Auto-generated method stub
		System.out.println("篮球教练学习英语");
	}
}
class PinPonCoach extends Coach {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("教授乒乓");
	}
}

