package org.java_code.method;

import java.util.Scanner;

public class MethodMax {
	public static int max(int x ,int y) {
		if ( x > y ) return x;
		else return y;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println("큰 수는 " + max(a,b) + "입니다.");
				
	}

}
