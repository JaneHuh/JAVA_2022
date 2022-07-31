package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array1 = new int[2][3]; // 행, 열
		int[][] array2 = new int[2][3];
		int[][] array3 = new int[2][3];

		System.out.println("첫 번째 배열 원소를 입력하시오.");
		input_array(array1);

		System.out.println("두 번째 배열 원소를 입력하시오.");
		input_array(array2);

		System.out.println("배열1");
		print_array(array1);

		System.out.println("배열2");
		print_array(array2);
		
		System.out.println("배열 합");
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 3; ++j) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		print_array(array3);

	}


	public static void input_array(int[][] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 3; ++j) {
				array[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void print_array(int[][] array) {
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
