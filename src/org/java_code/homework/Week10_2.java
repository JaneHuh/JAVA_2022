package org.java_code.homework;

import java.util.Scanner;

public class Week10_2 {
	public static void results(int a, double[][] arr) {
		for (int k = 0; k < 2; ++k) {
			System.out.println(a + "학년 " + (k + 1) + "학기: " + arr[a - 1][k]);
		}

	}

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

		results(grade, score);
	}

}
