package org.java_code.method;

import java.util.Scanner;

public class MethodArithmeticOperation {

	public static int addition(int x, int y) {
		return x + y;

	}

	public static int subtraction(int x, int y) {
		return x - y;

	}

	public static int multiplication(int x, int y) {
		return x * y;
	}

	public static double division(int x, int y) {
		return (double) x / (double) y; // (double)(x/y) -> 정수
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("두 수를 입력하시오.");
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("두 수의 합은 " + addition(a, b));
		System.out.println("두 수의 차는 " + subtraction(a, b));
		System.out.println("두 수의 곱은 " + multiplication(a, b));
		System.out.println("두 수의 나눗셈은 " + division(a, b));

	}

}
