package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array3 = new int[5][5];

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				array3[i][j] = (int) (Math.random() * 2);
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("0과 1중 입력하시오.");
		int a = sc.nextInt();
		
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (array3[i][j] == a)
				System.out.print(array3[i][j] + " ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
