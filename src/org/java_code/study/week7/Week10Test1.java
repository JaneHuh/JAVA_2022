package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test1 {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;

		try {
			result = a / b; 
			System.out.println(result);
		} catch (ArithmeticException e) { //정수를 0으로 나눌경우 발생
			System.out.println("예외발생");
		}

	}

}
