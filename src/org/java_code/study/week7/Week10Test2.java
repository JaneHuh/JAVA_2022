package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test2 {
	public static int sum(int x) {
		int sum = 0;
		for (int i = 1; i <= x; ++i) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("���� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("1���� " + a + "������ ���� " + sum(a));

	}

}
