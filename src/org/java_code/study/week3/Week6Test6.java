package org.java_code.study.week3;

import java.util.Scanner;

public class Week6Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");
		int max = 0;
		int[] array = new int[5];

		for (int i = 0; i < 5 ; ++i) {
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < 5 ; ++j) {
			if (array[j] > max) {
				max = array[j];
			}
		}
		System.out.println("���� ū ���� " + max);
	}

}
