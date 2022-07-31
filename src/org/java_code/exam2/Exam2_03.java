package org.java_code.exam2;

import java.util.Arrays;

public class Exam2_03 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("3번");
		int[] arr = { 3, 6, 2, 8, 1 };
		ascending_order(arr);
		
	}
	public static void ascending_order(int[] arr) {
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
