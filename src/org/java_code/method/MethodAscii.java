package org.java_code.method;

import java.util.Scanner;

public class MethodAscii {
	public static int ascii(char c) { // return x -> void
		int n = (int)c;
		return n;
		//return (int)c;
		//System.out.println((int)c); //return x -> 생성
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력하시오.");
		char a = sc.next().charAt(0);
		System.out.println(ascii(a)); // return x -> 없어도됨
	}

}
