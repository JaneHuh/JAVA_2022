package org.java_code.ptest;

import java.util.Scanner;

public class PTest_Q3 {

	public static void main(String[] args) {
		System.out.println("3번 ");
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int max = 0, min = 0;

		int n = sc.nextInt();
		max = n;
		min = n;
		
		for(int i = 1; i < 5; ++i) {
		
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
			
			n = sc.nextInt();
			
		}

		System.out.println("최소 " + min);
		System.out.println("최대 " + max);
		
	}

}
