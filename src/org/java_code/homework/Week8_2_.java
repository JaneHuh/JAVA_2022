package org.java_code.homework;

import java.util.Scanner;

public class Week8_2_ {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		int[] arr = { 50000, 10000, 5000, 1000, 1 };
		String[] arr1 = { "5만원권 ", "1만원권 ", "5천원권 ", "1천원권 ", "동전 " };
		String[] arr2 = { "매", "원" };
		int n;

		System.out.println("입력:");
		int money = sc.nextInt();

		System.out.println("\n출력:");
		for (int i = 0; i < arr.length; ++i) {
			n = money / arr[i];
			money = money % arr[i];
			if (n > 0 && i != 4) {
				System.out.println(arr1[i] + n + arr2[0]);
			} else if (n > 0 && i == 4) {
				System.out.println(arr1[i] + n + arr2[1]);
			}

		}

	}

}
