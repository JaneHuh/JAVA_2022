package org.java_code.homework;

import java.util.Scanner;

public class Week9_1 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		char[] arr = { 'H','u','h','J', 'a', 'n', 'e'};

		System.out.print("�� ��° ���ĺ��� ����Ʈ�ұ��? ");
		int a = sc.nextInt();

		if (a <= arr.length) {
			a -= 1;
			System.out.println(arr[a]);
		}

		else {
			System.out.println("������ ������ϴ�.");
		}

	}
}
