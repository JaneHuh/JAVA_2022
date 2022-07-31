package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_02 {

	public static boolean is_prime(int n) {
		for (int i = 2; i < n; ++i) {
			if(n % i == 0  ) {
				return false;
			}
		}
		return true; //반복문 빠져나와서..
		
		
		/*for (int i = 2; i <= n; ++i) {
		if(n % i != 0 && n == i ) return true;
		else return false;
		}*/
	
	}

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("2번");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (is_prime(a))
			System.out.print("소수");
		else
			System.out.print("소수아님");

	}

}


