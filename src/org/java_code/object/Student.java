package org.java_code.object;

public class Student {
	int score_Kor;
	int score_Eng;
	
	int sum() { //Ŭ���� ���� �޼ҵ� static x
		return score_Kor+score_Eng;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(); //��üȭ 
		//Student s2 = new Student();
		
		s1.score_Eng = 100; //��ü.����
		s1.score_Kor = 90; //��ü.����
		System.out.println(s1.sum()); //��ü.�޼ҵ�
	}
}
