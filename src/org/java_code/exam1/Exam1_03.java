package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_03 {

	public static void main(String[] args) {
		System.out.println("3��");

		Scanner sc = new Scanner(System.in);
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");
		int max = 0, min = 0;
		int[] array = new int[5];

		for (int i = 0; i < 5; ++i) {
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < 5; ++j) {
			if (array[j] > max) {
				max = array[j];
			} else if (array[j] < max)  {
				min = array[j];
			}
		} 
		System.out.println("�ִ�: " + max);
		System.out.println("�ּ�: " + max);

	}

}
