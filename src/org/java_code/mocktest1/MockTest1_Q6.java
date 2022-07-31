package org.java_code.mocktest1;

import java.util.Scanner;

public class MockTest1_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = (char)(Math.random()*3 + 65);
		
		while (true) {
			System.out.println("ABC 중 맞추시오.");
			char b = sc.nextLine().charAt(0); //char형 데이터 입력받기
			
			
			if (a == b) {
				System.out.println("정답!");
				break;
			} else {
				System.out.println("틀렸습니다. 다시 입력하시오.");
			}

		}
	}

}
