package org.java_code.homework;

import java.util.Scanner;

public class Week8_2_ {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		int[] arr = { 50000, 10000, 5000, 1000, 1 };
		String[] arr1 = { "5������ ", "1������ ", "5õ���� ", "1õ���� ", "���� " };
		String[] arr2 = { "��", "��" };
		int n;

		System.out.println("�Է�:");
		int money = sc.nextInt();

		System.out.println("\n���:");
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
