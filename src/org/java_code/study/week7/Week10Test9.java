package org.java_code.study.week7;

import java.util.Arrays;
import java.util.Scanner;

public class Week10Test9 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		System.out.println("첫 번째 배열 원소를 입력하시오.");
		input_array(array1);

		System.out.println("두 번째 배열 원소를 입력하시오.");
		input_array(array2);

		System.out.println("정렬 결과");
		merge(array1, array2);

	}

	public static void input_array(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; ++i) {
			array[i] = sc.nextInt();
		}

	}

	public static void merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i];

		}
		for(int i=0; i<b.length;++i) {
			c[i+a.length] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < c.length; ++i) {
			System.out.print(c[i]+" ");

		}

	}

}
