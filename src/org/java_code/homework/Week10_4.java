package org.java_code.homework;

import java.util.Scanner;

public class Week10_4 {

	public static void result(char a) {

		for (int i = 'A'; i <= (int) a; ++i) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);

		System.out.print("���ĺ��� �Է��Ͻÿ�. ");
		char alphabet = sc.next().charAt(0);

		result(alphabet);
	}

}
