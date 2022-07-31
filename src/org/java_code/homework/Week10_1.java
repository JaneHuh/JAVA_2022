package org.java_code.homework;

import java.util.Scanner;

public class Week10_1 {

	public static String combine (String x, String y) {
		return x+y;
	}

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 문자열? ");
		String a = sc.nextLine();
		System.out.print("두번째 문자열? ");
		String b = sc.nextLine();
		System.out.println("결과: " + combine(a,b));
	}

}
