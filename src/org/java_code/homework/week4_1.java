package org.java_code.homework;

public class week4_1 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		int n = (int)(Math.random()*100);
		System.out.println("������ " + n);
		
		char score;
		if (n >= 90) score = 'A';
		else if (n >= 80) score = 'B';
		else if (n >= 70) score = 'c';
		else score = 'F';
		
		System.out.println(score);
	}

}
