package org.java_code.homework;

import java.util.Scanner;

public class Week6_1 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		Scanner sc = new Scanner(System.in);
		String[] arname = new String[4];
		String[] arsubject = { "국어", "영어", "수학" };
		int[][] arscore = new int[4][3];
		int tot = 0;
		double avg = 0;

		for (int i = 0; i < arname.length; ++i) {
			System.out.print("이름과 점수를 입력하시오.\n이름: ");
			arname[i] = sc.next();
			for (int j = 0; j < arsubject.length; ++j) {
				System.out.print(arsubject[j] + ": ");
				arscore[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n    Kor Eng Mat Tot Avg");
		System.out.println("=======================");
		for (int i = 0; i < arname.length; ++i) {
			System.out.print(arname[i] + " ");
			for (int j = 0; j < arsubject.length; ++j) {
				System.out.print(arscore[i][j] + " ");
				tot += arscore[i][j];
			}
			avg = tot / arsubject.length;
			System.out.println(tot + " " + avg);
			tot = 0; //total 값 초기화

		}

	}

}
