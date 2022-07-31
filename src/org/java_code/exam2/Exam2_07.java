package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_07 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("7번");

		Scanner sc = new Scanner(System.in);
		int[][] score = new int[3][3];

		for (int i = 0; i < 3; ++i) {
			System.out.println((i+1) + "번째 학생 점수는?");
			for (int j = 0; j < 3; ++j) {
				
				score[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (score[i][j] > max) // >=
					max = score[i][j];
			}
		}
		System.out.println("최고점은" + max);

	}

}
