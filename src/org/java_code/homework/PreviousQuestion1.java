package org.java_code.homework;

import java.util.Scanner;

public class PreviousQuestion1 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, min, max, sum = 0, len = 0;
		double avg = 0;

		System.out.print("2���� ���ڸ� �Է��Ͻÿ�:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		for (int i = min; i <= max; ++i) {
			sum += i;
			len += 1;
		}

		avg = (double) sum / len;
		// avg = (double)(num1+num2)/2; // num1�� num2�� ����̳� ��� ���� ����̳� ����.

		System.out.println(min + "���� " + max + "���� ��� ������ ����� " + avg);

	}

}
