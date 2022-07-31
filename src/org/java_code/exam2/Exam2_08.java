package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_08 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("8번");
		//못풀었음
		Scanner sc = new Scanner(System.in);
		int[] array = new int [5];
		for (int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("숫자를 입력하시오: ");
		int input = sc.nextInt();
		int temp = 0;
		for (int i = 0; i<array.length; i++) {
			if(input == array[i]) {
				System.out.println("포함되어 있음");
				temp = 1;
				break;
			}
		}
		if(temp != 1) {
			System.out.println("포함되어 있지 않음");
		}
	}

}
