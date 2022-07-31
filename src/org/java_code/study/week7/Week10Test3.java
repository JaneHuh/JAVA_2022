package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test3 {
	public static int sum(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}

	public static double avg(int i, int j, int k) {
		double avg = (double)(i + j + k) / 3;
		return avg;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c;
		System.out.println("세 수를 입력하시오.");
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		System.out.println("총합은 " + sum(a,b,c));
		System.out.println("평균은 " + avg(a,b,c));

	}
}
