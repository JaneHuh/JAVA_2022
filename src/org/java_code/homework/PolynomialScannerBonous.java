package org.java_code.homework;

import java.util.Scanner;

public class PolynomialScannerBonous {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("60211127 ������");
		System.out.println("y = 3x2 + 4x + 5 �� �� x�� ���� �Է��Ͻÿ�.");
		System.out.print("x = ");
		
		int x = scn.nextInt();
		double y;
		
		y = 3*Math.pow(x, 2) + 4*x + 5 ;
		
		System.out.println("y = " + (int) y);
	}

}
