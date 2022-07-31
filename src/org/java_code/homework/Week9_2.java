package org.java_code.homework;

import java.util.Scanner;

public class Week9_2 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int [5][5]; 
		
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				arr[i][j] = (int)(Math.random() * 10 );
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n숫자를 입력하시오. ");
		int a = sc.nextInt();
		
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (arr[i][j] < a) System.out.print("X ");
				else System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
