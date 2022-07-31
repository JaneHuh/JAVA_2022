 package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int[][] array3 = new int[5][4]; // 행, 열
		int[][] array3 = {{70, 80, 80, 0}, //0을 반드시 추가해야함
						  {100, 70, 60, 0},
						  {50, 50, 50, 0},
						  {80, 70, 90, 0},
						  {50, 30, 80, 0}}; // 행, 열
		
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 3; ++j) {
				array3[i][3] = array3[i][j];
			}
		}

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4; ++j) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
