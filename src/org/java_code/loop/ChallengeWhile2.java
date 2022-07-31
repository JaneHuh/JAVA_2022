package org.java_code.loop;

import java.util.Scanner;

public class ChallengeWhile2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int current = 0;
		
		System.out.print("숫자를 입력하시오.");
		int next = scn.nextInt();
		
		while (current<next) {
			current = next; // == -> x
			System.out.print("숫자를 입력하시오.");
			next = scn.nextInt();
			
		}
		System.out.println("종료");
	}

}
