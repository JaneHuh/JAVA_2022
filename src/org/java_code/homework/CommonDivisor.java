package org.java_code.homework;

import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		System.out.println("60211127 ������");

		Scanner scn = new Scanner(System.in);

		int num1, num2, count = 0; // 0�� �־�� ��. ���ڸ� �����ִ� ���� �ʱⰪ �ʿ���.
		//int min; //min ��� ���� 
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();

		System.out.print("�����: ");
		for (int i = 1; i <= num1; ++i) { // i <= num1 ��� i<num2+1
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
				++count;
			}
		}
		//System.out.println(" "); // "\n"
		System.out.println("\n" + num1 + "�� " + num2 + "�� ������� " + count + "�� �Դϴ�.");
	}

}
