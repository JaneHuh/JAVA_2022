package org.java_code.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Week10_3 {
	public static int get_max(int[] num) {
		int max = 0;
		for(int i = 0; i < num.length; ++i) {
			if(max < num[i]) max = num [i];
		}
		return max;
		
	}

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("숫자 다섯 개를 입력하시오.");
		for (int i = 0; i < 5; ++i) {
			arr[i] = sc.nextInt();
		}

		System.out.println("최댓값은 " + get_max(arr));

	}
}
