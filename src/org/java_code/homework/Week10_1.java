package org.java_code.homework;

import java.util.Scanner;

public class Week10_1 {

	public static String combine (String x, String y) {
		return x+y;
	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڿ�? ");
		String a = sc.nextLine();
		System.out.print("�ι�° ���ڿ�? ");
		String b = sc.nextLine();
		System.out.println("���: " + combine(a,b));
	}

}
