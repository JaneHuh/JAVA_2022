package org.java_code.homework;

import java.util.Scanner;

public class Week9_3 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		double[][] score = new double[4][2];

		System.out.println("1�г���� 4�г������ �б⺰ ������ �Է��Ͻÿ�. ");
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				score[i][j] = sc.nextDouble();
			}
		}

		System.out.print("�г��� �Է��Ͻÿ�. ");
		int grade = sc.nextInt();

		for (int i = 0; i < 2; ++i) {
			System.out.println(grade + "�г� " + (i + 1) + "�б�: " + score[grade - 1][i]);
		}

	}

}
