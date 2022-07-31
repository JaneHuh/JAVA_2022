package org.java_code.study.week2;

public class Week4_Review {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*100);
		System.out.println("Á¡¼ö´Â " + n);
		
		char score;
		if (n >= 90) score = 'A';
		else if (n >= 80) score = 'B';
		else if (n >= 70) score = 'c';
		else score = 'F';
		
		System.out.println(score);
	}

}
