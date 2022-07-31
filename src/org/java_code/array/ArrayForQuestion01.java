package org.java_code.array;

import java.util.Scanner;

public class ArrayForQuestion01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("다섯 개의 수를 입력하시오.");
		int max = 0;

		for (int i = 0; i < 5; ++i) {
			array[i] = sc.nextInt();
			// int a = sc.nextInt();
			// array[i] = a;
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);

	}

}
