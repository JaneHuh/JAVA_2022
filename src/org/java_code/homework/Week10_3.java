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
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("���� �ټ� ���� �Է��Ͻÿ�.");
		for (int i = 0; i < 5; ++i) {
			arr[i] = sc.nextInt();
		}

		System.out.println("�ִ��� " + get_max(arr));

	}
}
