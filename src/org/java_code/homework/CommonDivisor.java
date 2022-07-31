package org.java_code.homework;

import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		Scanner scn = new Scanner(System.in);

		int num1, num2, count = 0; // 0이 있어야 함. 숫자를 세워주는 변수 초기값 필요함.
		//int min; //min 없어도 무관 
		
		System.out.print("두 수를 입력하시오: ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();

		System.out.print("공약수: ");
		for (int i = 1; i <= num1; ++i) { // i <= num1 대신 i<num2+1
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
				++count;
			}
		}
		//System.out.println(" "); // "\n"
		System.out.println("\n" + num1 + "과 " + num2 + "의 공약수는 " + count + "개 입니다.");
	}

}
