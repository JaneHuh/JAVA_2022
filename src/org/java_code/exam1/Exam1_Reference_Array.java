package org.java_code.exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_Reference_Array {

	public static void main(String[] args) {
		// 배열
		int[] array1 = new int[4];
//		int[] array2 = {1,2,3,4};
//		String[] s = {국어, 영어, 수학};
//		String[] s = new String[5];

		// [0 1 2 3 ]각 자리에 1 2 3 4 넣기
		for (int i = 0; i < 4; ++i) {
			array1[i] = i + 1;
			System.out.println(array1[i]);
		}

		// 5개 숫자 입력받아서 총합 구하기
		Scanner sc = new Scanner(System.in);
		int[] array0 = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; ++i) {
			array0[i] = sc.nextInt();
			sum += array0[i];
		}
		System.out.println("총합은" + sum);

		// 이중 for문 배열 숫자 2씩 증가 **기본
		int[][] array3 = new int[5][5]; // 행, 열

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				array3[i][j] = (2 * j) + i + 1;
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}

		// 2차원 배열 //숫자 넣음 (곱) ( 3, 4)
		int[][] array2 = new int[3][4];

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 4; ++j) {
				array2[i][j] = (i + 1) * (j + 1);
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();

		}

		// 수열
		int[] array = new int[30];

		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < array.length; ++i) {
			array[i] = array[i - 1] + array[i - 2];
		}

		for (int i = 0; i < 30; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n");

		// (0,0)(0,1)(0,2)(0,3)(0,4)
		// (1,0)(1,1)(1,2)(1,3)(1,4)
		// (2,0)(2,1)(2,2)(2,3)(2,4)
		// (3,0)(3,1)(3,2)(3,3)(3,4)
		// (4,0)(4,1)(4,2)(4,3)(4,4)

		//

		// 아스키코드 대문자 65~90, 소문자 97~122

	}

	public static void merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i];

		}
		for (int i = 0; i < b.length; ++i) {
			c[i + a.length] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < c.length; ++i) {
			System.out.print(c[i] + " ");

		}

	}
}
