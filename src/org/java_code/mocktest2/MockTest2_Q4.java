package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q4 {
	public static void main(String[] args) {
		char[] array = {'a', 'b', 'c', 'd'};
		Scanner sc = new Scanner(System.in);
		System.out.println("n? ");
		int n = sc.nextInt();
		
		try {
			System.out.println(array[n]); //첫번째 알파벳, 0번째 배열
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생");
		}
		
	}
}
