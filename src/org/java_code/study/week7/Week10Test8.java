package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test8 {
	public static void gendernumber(String x) {
		char y = x.charAt(6);

		if (y == '1' || y == '3') {
			System.out.println("남자");
		} else if (y == '2' || y == '4') {
			System.out.println("여자");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resnum = sc.nextLine();

		while (!resnum.equals("0")) {
			gendernumber(resnum);
			resnum = sc.nextLine();

		}
		if (resnum.equals("0")) {
			System.out.println("종료");
		}
	}

}
