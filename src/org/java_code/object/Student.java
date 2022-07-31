package org.java_code.object;

public class Student {
	int score_Kor;
	int score_Eng;
	
	int sum() { //클래스 내부 메소드 static x
		return score_Kor+score_Eng;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(); //객체화 
		//Student s2 = new Student();
		
		s1.score_Eng = 100; //객체.변수
		s1.score_Kor = 90; //객체.변수
		System.out.println(s1.sum()); //객체.메소드
	}
}
