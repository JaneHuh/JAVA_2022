package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_08 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		System.out.println("8��");
		//��Ǯ����
		Scanner sc = new Scanner(System.in);
		int[] array = new int [5];
		for (int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int input = sc.nextInt();
		int temp = 0;
		for (int i = 0; i<array.length; i++) {
			if(input == array[i]) {
				System.out.println("���ԵǾ� ����");
				temp = 1;
				break;
			}
		}
		if(temp != 1) {
			System.out.println("���ԵǾ� ���� ����");
		}
	}

}
