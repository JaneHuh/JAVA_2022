package org.java_code.homework;

import java.util.Scanner;

public class Homework9_3 {

	public static void main(String[] args) {
		System.out.println("60211129 Ȳ����");
		Scanner scn = new Scanner(System.in);
		double[][] arr = new double[4][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println((i+1) + "�г� " + (j+1) + "�б� ������ �Է��Ͻÿ�");
				arr[i][j] = scn.nextDouble();
			}
		}

		System.out.print("�г��� �Է��Ͻÿ�");
		int grade = scn.nextInt();
		System.out.println(grade + "�г� " + "1�б� ����: " + arr[grade - 1][0]);
		System.out.println(grade + "�г� " + "2�б� ����: " + arr[grade - 1][1]);
	}

}
