package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test1 {

	public static void main(String[] args) {
		System.out.println("�� ���� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;

		try {
			result = a / b; 
			System.out.println(result);
		} catch (ArithmeticException e) { //������ 0���� ������� �߻�
			System.out.println("���ܹ߻�");
		}

	}

}
