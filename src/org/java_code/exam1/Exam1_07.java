package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_07 {

	public static void main(String[] args) {
		System.out.println("7번");
		
		System.out.println("숫자를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		switch (a) { //카테고리별~
		
		case 3: case 6: case 9:
			System.out.print("3의 배수");
			break;
		default: // case에 선택되지 않은 값
			System.out.println("3의 배수 아님 ");
		}
	}

}
