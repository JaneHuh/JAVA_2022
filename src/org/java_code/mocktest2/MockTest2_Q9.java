package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		/*for (int i = 1; i <= a; ++i) { // i�� 1�� �����ؾ���
			if (a % i == 0 && i != 1 && i != a) {
				System.out.println(i + "�� ����Դϴ�.");
				break;
			} else if (i == a)
				System.out.println("�Ҽ��Դϴ�.");
		}*/
		
		int i;
		
		for (i = 2; i <= a; ++i) {
			if(a % i == 0) break;
		}
		
		if (i < a) System.out.println(i+"�� ���");
		else System.out.println("�Ҽ��Դϴ�");

	}

}
