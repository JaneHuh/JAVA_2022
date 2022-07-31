package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[][] mat = new char[5][5]; // 매트릭스 mat

		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				mat[i][j] = (char) (Math.random() * 3 + 65); // 'A'  = 65
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}

		System.out.println("문자를 입력하시오.");
		char n = scn.next().charAt(0);

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (n == mat[i][j])
					System.out.print(mat[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
