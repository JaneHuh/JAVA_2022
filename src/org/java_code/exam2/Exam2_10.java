package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] com = new int[10];
		int[] human = new int[10];
		for (int i = 0; i < 3; ++i) {
			int num = (int) (Math.random() * 10 + 1);
			if (com[num] == 0) {
				com[num] = 1;
			} else
				--i;
		}
		System.out.println("세 숫자를 입력하시오.");
		for (int i = 0; i < 3; ++i) {
			human[sc.nextInt()-1] = 1;
		}
		
		int n=3;
		for (int i = 0; i < 3; ++i) {
			if (human[i] == com[i]) {
				n =- 1;
			}
		}
		if (n==3) System.out.println("3Strike");
		if (n==2) System.out.println("2Strike 1 Ball");
		if (n==1) System.out.println("1Strike 2Ball");
		else System.out.println("3ball");
		
	}

}

//System.out.println("60211127 허재인");
		//System.out.println("10번");