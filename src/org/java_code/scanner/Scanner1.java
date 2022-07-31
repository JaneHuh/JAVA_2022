package org.java_code.scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int i = scn.nextInt(); //int 입력받는다.
		double d = scn.nextDouble();
		String s = scn.nextLine();
		
		System.out.println("int: " + i);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);//그냥 엔터 치면 ""입력된 걸로 인식
		
	}

}
