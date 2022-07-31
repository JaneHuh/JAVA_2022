package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] array3 = new double[4][2]; // 행, 열

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				System.out.print((i + 1) + "학년 " + (j + 1) + "학기는? ");
				array3[i][j] = sc.nextDouble();

			}
		}
		double max = 0;
		int g = 0, s = 0;
		for (int k = 0; k < 4; ++k) {
			for (int l = 0; l < 2; ++l) {
				if (array3[k][l] > max) {
					max = array3[k][l];
					g = k + 1;
					s = l + 1;
				}
			}

		}
		System.out.println("결과: " + g + "학년" + s + "학기 " + max);
	}
}
