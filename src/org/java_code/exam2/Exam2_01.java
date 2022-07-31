package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_01 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("1번");
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(sum(num));
		
		
	}
	
	public static int sum(int num) {
		int sum= 0;
		for (int i = 1; i <= num; ++i) {
			sum += i;
		}
		return sum;
	}

}
