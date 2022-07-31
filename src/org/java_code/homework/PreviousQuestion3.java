package org.java_code.homework;

import java.util.Scanner;

public class PreviousQuestion3 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		
		Scanner sc = new Scanner(System.in);
		int computer, user;

		computer = (int) (Math.random() * 10 + 1); // 0부터 10사이
		//System.out.println(computer); //컴퓨터가 출력한 값

		while (true) {
			System.out.print("숫자를 입력하시오. ");
			user = sc.nextInt();

			if (user > computer) {
				System.out.println("크다");
			} else if (user == computer) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("작다");

			}
		}
	}

}
