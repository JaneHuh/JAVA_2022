package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_02 {

	public static void main(String[] args) {
		System.out.println("2��");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			if (a >= 1 && a <= 26 ) {
				System.out.println((char)(a+64));
			}
			else {
				System.out.println("1���� 26���� ���ڸ� �Է��Ͻÿ�.");
			}
		}
		
		
	}

}
