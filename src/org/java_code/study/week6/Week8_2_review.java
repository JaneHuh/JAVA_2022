package org.java_code.study.week6;

import java.util.Scanner;

public class Week8_2_review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr0[] = { 50000, 10000, 5000, 1000, 1 };
		String arr1[] = { "5만원권 ", "1만원권 ", "5천원권 ", "1천원권 ", "동전 " };
		System.out.println("입력: ");

		int money = sc.nextInt();
		System.out.println("출력: ");
		int n;

		for (int i = 0; i < 5; ++i) {
			n = money / arr0[i];
			money = money % arr0[i];
			if (n > 0 && i != 4) {
				System.out.println(arr1[i] + n + "매");
			} else if (n > 0 && i == 4)
				System.out.println(arr1[i] + n + "원");
		}

	}
}
