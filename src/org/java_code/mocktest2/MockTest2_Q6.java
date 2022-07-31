package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q6 {
	public static int factorial(int x) {
		int y = 1;

		for (int i = 1; i <= x; ++i) {
			y = y * i;
		}
		return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(a + "!은 " + factorial(a) + "입니다.");
	}
}
