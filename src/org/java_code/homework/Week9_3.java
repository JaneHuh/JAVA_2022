package org.java_code.homework;

import java.util.Scanner;

public class Week9_3 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		double[][] score = new double[4][2];

		System.out.println("1학년부터 4학년까지의 학기별 성적을 입력하시오. ");
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				score[i][j] = sc.nextDouble();
			}
		}

		System.out.print("학년을 입력하시오. ");
		int grade = sc.nextInt();

		for (int i = 0; i < 2; ++i) {
			System.out.println(grade + "학년 " + (i + 1) + "학기: " + score[grade - 1][i]);
		}

	}

}
