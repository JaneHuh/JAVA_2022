package org.java_code.homework;

import java.util.Scanner;

public class Week6_2 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");

		Scanner sc = new Scanner(System.in);
		char alphabet, first = 'z';
		String a;
		System.out.println("���ĺ��� �Է��Ͻÿ�.");

		while (true) {
			a = sc.next();
			if (a.equals("quit"))
				break;

			alphabet = a.charAt(0); // ����ȯ
			if (alphabet < first)
				first = alphabet;
		}
		System.out.println("���� ���� ���ĺ��� " + first);
	}

}
