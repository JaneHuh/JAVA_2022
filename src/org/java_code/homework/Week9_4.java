package org.java_code.homework;

import java.util.Scanner;

public class Week9_4 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		String[][] array = new String[10][7]; // [��],[��]

		System.out.println(" * ��ٸ� ���� *");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 7; j++) {
				int num = (int) (Math.random() * 2);
				if (j % 2 == 1 && num % 2 == 0) {
					array[i][j] = "-";
				} else if (j % 2 == 1) {
					array[i][j] = " ";
				} else {
					array[i][j] = " | ";
				}
			}
			System.out.println();
		}
		
		// ���� �߸��ߴ� �� ��ºθ� ���� ���� ����.. 
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 7; j++) {
				if ( i >= 4 && i <= 7) {
					System.out.printf("%2s", "?");
				} else {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("��ȣ�� ���ÿ�(1~4): ");
		int a = sc.nextInt();
		int b = 0;
		System.out.println();
		
		//��ȣ Ÿ�� 
		if (a == 1) {
			b = 0;
		}

	}

}
