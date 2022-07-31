package org.java_code.loop;

import java.util.Scanner;

public class ChallengeFor1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("숫자를 입력하시오: ");
		int n0 = scn.nextInt();
		int sum0 = 0;
		
		for(int i=1; i<=n0; ++i) {
			sum0 += i;
			System.out.print(i);
			if (i<n0) System.out.print(" + ");
			else System.out.print(" = ");
		}
		System.out.println(sum0);
	}

}
