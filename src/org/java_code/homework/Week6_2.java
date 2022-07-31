package org.java_code.homework;

import java.util.Scanner;

public class Week6_2 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		Scanner sc = new Scanner(System.in);
		char alphabet, first = 'z';
		String a;
		System.out.println("알파벳을 입력하시오.");

		while (true) {
			a = sc.next();
			if (a.equals("quit"))
				break;

			alphabet = a.charAt(0); // 형변환
			if (alphabet < first)
				first = alphabet;
		}
		System.out.println("가장 빠른 알파벳은 " + first);
	}

}
