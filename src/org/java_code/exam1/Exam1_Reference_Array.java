package org.java_code.exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1_Reference_Array {

	public static void main(String[] args) {
		// �迭
		int[] array1 = new int[4];
//		int[] array2 = {1,2,3,4};
//		String[] s = {����, ����, ����};
//		String[] s = new String[5];

		// [0 1 2 3 ]�� �ڸ��� 1 2 3 4 �ֱ�
		for (int i = 0; i < 4; ++i) {
			array1[i] = i + 1;
			System.out.println(array1[i]);
		}

		// 5�� ���� �Է¹޾Ƽ� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[] array0 = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; ++i) {
			array0[i] = sc.nextInt();
			sum += array0[i];
		}
		System.out.println("������" + sum);

		// ���� for�� �迭 ���� 2�� ���� **�⺻
		int[][] array3 = new int[5][5]; // ��, ��

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				array3[i][j] = (2 * j) + i + 1;
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}

		// 2���� �迭 //���� ���� (��) ( 3, 4)
		int[][] array2 = new int[3][4];

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 4; ++j) {
				array2[i][j] = (i + 1) * (j + 1);
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();

		}

		// ����
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

		// �ƽ�Ű�ڵ� �빮�� 65~90, �ҹ��� 97~122

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
