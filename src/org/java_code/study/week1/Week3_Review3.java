package org.java_code.study.week1;

import java.util.Scanner;

//import java.util.Scanner;

public class Week3_Review3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //ctrl + shift + o  -> import 자동생성 
		
		
		System.out.println("y = 3x2 + 4x + 5의 값을 입력하시오.");
		System.out.print("x = ");
		
		int x = scn.nextInt();
		double y;
		
		y = 3*Math.pow(x, 2) + 4*x + 5;
		
		System.out.println("y = " + (int)y);
		
		System.out.println();
	}

}
