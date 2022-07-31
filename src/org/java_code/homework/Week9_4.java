package org.java_code.homework;

import java.util.Scanner;

public class Week9_4 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		String[][] array = new String[10][7]; // [행],[열]

		System.out.println(" * 사다리 게임 *");
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
		
		// 내가 잘못했던 것 출력부를 따로 두지 않음.. 
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

		System.out.println("번호를 고르시오(1~4): ");
		int a = sc.nextInt();
		int b = 0;
		System.out.println();
		
		//번호 타기 
		if (a == 1) {
			b = 0;
		}

	}

}
