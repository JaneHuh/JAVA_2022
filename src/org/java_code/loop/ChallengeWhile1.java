package org.java_code.loop;

import java.util.Scanner;

public class ChallengeWhile1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		
		System.out.print("숫자를 입력하시오: ");
		int n = scn.nextInt();
		
		while (i <= n) {
			System.out.print(i);
			if(i<n) System.out.print(" + ");
			else System.out.print(" = ");
			sum += i;
			i++;
			
		}
		System.out.print(sum);
	}

}
