package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q3 {
	public static void print_ascii(char ch1, char c2) {
		int x, y;
		x = (int)ch1;
		y = (int)c2;
		
		System.err.println(x + " " + y);
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		print_ascii(a,b);
	}

}
