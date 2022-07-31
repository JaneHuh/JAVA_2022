package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_05 {

	public static void main(String[] args) {
		System.out.println("5¹ø");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i % 2 == 0) continue;
			else System.out.print(i + " ");
		}
		
	}

}
