package org.java_code.homework;

import java.util.Scanner;

public class Week9_1_TryCatch {

	public static void main(String[] args) {
		char[] name = {'J', 'A', 'N', 'E'};
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("몇번째 알파벳을 프린트할까요? ");
			int number = sc.nextInt();
			
			try {
				System.out.println(name[number-1]); //첫번째 알파벳, 0번째 배열
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("범위에서 벗어났습니다.");
			}
		}
	}

}
