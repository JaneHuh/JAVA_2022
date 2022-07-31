package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_01 {
	
	public static void main(String[] args) {
		System.out.println("1¹ø");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=1;
		
		for(int i=1; i<=a; ++i) {
			b = b*i;
		}
		
		System.out.println(a+"! = "+b);
	}
	
}
