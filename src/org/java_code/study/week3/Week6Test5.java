package org.java_code.study.week3;

import java.util.Scanner;

public class Week6Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("수를 입력하시오.");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
