package org.java_code.study.week6;

import java.util.Scanner;

public class Week8_2_review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr0[] = { 50000, 10000, 5000, 1000, 1 };
		String arr1[] = { "5������ ", "1������ ", "5õ���� ", "1õ���� ", "���� " };
		System.out.println("�Է�: ");

		int money = sc.nextInt();
		System.out.println("���: ");
		int n;

		for (int i = 0; i < 5; ++i) {
			n = money / arr0[i];
			money = money % arr0[i];
			if (n > 0 && i != 4) {
				System.out.println(arr1[i] + n + "��");
			} else if (n > 0 && i == 4)
				System.out.println(arr1[i] + n + "��");
		}

	}
}
