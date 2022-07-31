package org.java_code.homework;

import java.util.Scanner;

public class Week8_4_reverseorder {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[5];
		char a;

		for (int i = 0; i < arr.length; ++i) {
			while (true) {
				a = sc.next().charAt(0);
				if (a >= 'a' && a <= 'z') {
					arr[i] = a;
					break;
				}
			}
			
		}
		System.out.println();

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] < arr[j + 1]) { //기호 하나 차이 
					char temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println("출력");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
		}

	}

}
