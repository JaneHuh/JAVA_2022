package org.java_code.loop;

import java.util.Scanner;

public class ChallengeWhile1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
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
