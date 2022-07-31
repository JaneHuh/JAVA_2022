package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test4 {

	public static void main(String[] args) {
		int[] array = { 10, 2, 5, 8, 1 };
		Scanner scn = new Scanner(System.in);
		System.out.println("몇 번째 원소를 출력할까요?");
		int n = scn.nextInt();
		n = n-1;

		if (n < array.length) {
			System.out.println("해당하는 수는 " + array[n] + "입니다. ");
		} else {
			System.out.println("범위를 벗어났습니다.");
		}

	}

}
