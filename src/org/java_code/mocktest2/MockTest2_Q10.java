package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int com;
		int min = 1, max = 100;
		int count = 0;

		while (true) {
			com = (int) (Math.random() * (max - min + 1)+min);
			System.out.println(com + "�Դϱ�?");
			System.out.println("0:�׺��� �۴�  1: �׺��� ũ��  2: �´� )");

			int n = sc.nextInt();
			switch (n) {
			case 0:
				max = com - 1;
				count++;
				break;
			case 1:
				min = com + 1;
				count++;
				break;
			case 2:
				System.out.println(count + "");
				return;
			}
		}
	}

}
