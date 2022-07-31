package org.java_code.homework;

import java.util.Scanner;

public class Week8_2 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		int[] arr = { 50000, 10000, 5000, 1000, 1 };
		int n;

		System.out.println("입력:");
		int money = sc.nextInt();

		System.out.println("\n출력:");
		for (int i = 0; i < arr.length; ++i) {
			n = money / arr[i];
			money = money % arr[i];
			if (n > 0) {
				switch (i) {
				case 0:
					System.out.println("5만원권 " + n + "매");
					break;
				case 1:
					System.out.println("1만원권 " + n + "매");
					break;
				case 2:
					System.out.println("5천원권 " + n + "매");
					break;
				case 3:
					System.out.println("1천원권 " + n + "매");
					break;
				case 4:
					System.out.println("동전 " + n + "원");
					break;
				}
			}

		}

	}

}
