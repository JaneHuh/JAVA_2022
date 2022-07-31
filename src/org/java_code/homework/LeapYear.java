package org.java_code.homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("60211127 «„¿Á¿Œ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year%4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("¿±≥‚");
		}
		else {
			System.out.println("¿±≥‚æ∆¥‘");
		}
	}

}
