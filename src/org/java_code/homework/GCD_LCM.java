package org.java_code.homework;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		Scanner scn = new Scanner(System.in);

		System.out.print("두 수를 입력하시오: ");
		int num1, num2, GCD = 0, LCM = 0; // 초기값..

		num1 = scn.nextInt();
		num2 = scn.nextInt();

		for (int i = 1; i < num1; ++i) {
			if (num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}

		}

		int max;
		if (num1 > num2) max = num1;
		else max = num2;

		for (int i = max; i <= num1 * num2; ++i) {
			if(i % num1 == 0 && i % num2 ==0) {
				LCM = i;
				break; //즉시 끝냄, 최소공배수
			}
		}

			// LCM = (num1 * num2) / GCD; // 유클리드 호제법 a * b = lcm(a,b) * gcd(a,b)

		System.out.println("최소공배수: " + LCM);
		System.out.println("최대공약수: " + GCD);

	}

}
