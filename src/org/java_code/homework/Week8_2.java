package org.java_code.homework;

import java.util.Scanner;

public class Week8_2 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		int[] arr = { 50000, 10000, 5000, 1000, 1 };
		int n;

		System.out.println("�Է�:");
		int money = sc.nextInt();

		System.out.println("\n���:");
		for (int i = 0; i < arr.length; ++i) {
			n = money / arr[i];
			money = money % arr[i];
			if (n > 0) {
				switch (i) {
				case 0:
					System.out.println("5������ " + n + "��");
					break;
				case 1:
					System.out.println("1������ " + n + "��");
					break;
				case 2:
					System.out.println("5õ���� " + n + "��");
					break;
				case 3:
					System.out.println("1õ���� " + n + "��");
					break;
				case 4:
					System.out.println("���� " + n + "��");
					break;
				}
			}

		}

	}

}
