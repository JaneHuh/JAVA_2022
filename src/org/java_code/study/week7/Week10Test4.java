package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test4 {

	public static void main(String[] args) {
		int[] array = { 10, 2, 5, 8, 1 };
		Scanner scn = new Scanner(System.in);
		System.out.println("�� ��° ���Ҹ� ����ұ��?");
		int n = scn.nextInt();
		n = n-1;

		if (n < array.length) {
			System.out.println("�ش��ϴ� ���� " + array[n] + "�Դϴ�. ");
		} else {
			System.out.println("������ ������ϴ�.");
		}

	}

}
