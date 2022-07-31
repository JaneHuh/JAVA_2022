package org.java_code.homework;

import java.util.Scanner;

public class Week5_1 {
	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		String postposition = "은 "; 
		String distinguish = "소수가 아닙니다.";

		if (n % 10 == 2 || n % 10 == 4 || n % 10 == 5 || n % 10 == 9)
			postposition = "는 ";

		for (int i = 2; i < n; ++i) {
			if (n % i != 0)
				distinguish = "소수입니다.";
		}

		System.out.println(n + postposition + distinguish);

	}

}

//if (n<2) distinguish = "소수가 아닙니다.";
/*
 * for (int i=2; i<n; ++i) { if(n%i!=0) { distinguish = "소수입니다."; break; } else
 * distinguish = "소수입니다."; }
 */