package org.java_code.homework;

import java.util.Scanner;

public class Week5_1 {
	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		String postposition = "�� "; 
		String distinguish = "�Ҽ��� �ƴմϴ�.";

		if (n % 10 == 2 || n % 10 == 4 || n % 10 == 5 || n % 10 == 9)
			postposition = "�� ";

		for (int i = 2; i < n; ++i) {
			if (n % i != 0)
				distinguish = "�Ҽ��Դϴ�.";
		}

		System.out.println(n + postposition + distinguish);

	}

}

//if (n<2) distinguish = "�Ҽ��� �ƴմϴ�.";
/*
 * for (int i=2; i<n; ++i) { if(n%i!=0) { distinguish = "�Ҽ��Դϴ�."; break; } else
 * distinguish = "�Ҽ��Դϴ�."; }
 */