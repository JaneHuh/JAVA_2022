package org.java_code.homework;

import java.util.Scanner;

public class Week6_1 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");

		Scanner sc = new Scanner(System.in);
		String[] arname = new String[4];
		String[] arsubject = { "����", "����", "����" };
		int[][] arscore = new int[4][3];
		int tot = 0;
		double avg = 0;

		for (int i = 0; i < arname.length; ++i) {
			System.out.print("�̸��� ������ �Է��Ͻÿ�.\n�̸�: ");
			arname[i] = sc.next();
			for (int j = 0; j < arsubject.length; ++j) {
				System.out.print(arsubject[j] + ": ");
				arscore[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n    Kor Eng Mat Tot Avg");
		System.out.println("=======================");
		for (int i = 0; i < arname.length; ++i) {
			System.out.print(arname[i] + " ");
			for (int j = 0; j < arsubject.length; ++j) {
				System.out.print(arscore[i][j] + " ");
				tot += arscore[i][j];
			}
			avg = tot / arsubject.length;
			System.out.println(tot + " " + avg);
			tot = 0; //total �� �ʱ�ȭ

		}

	}

}
