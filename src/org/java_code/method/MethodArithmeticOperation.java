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
		return (double) x / (double) y; // (double)(x/y) -> ����
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("�� ���� �Է��Ͻÿ�.");
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("�� ���� ���� " + addition(a, b));
		System.out.println("�� ���� ���� " + subtraction(a, b));
		System.out.println("�� ���� ���� " + multiplication(a, b));
		System.out.println("�� ���� �������� " + division(a, b));

	}

}
