package org.java_code.homework;

import java.util.Scanner;

public class Homework9_3 {

	public static void main(String[] args) {
		System.out.println("60211129 황예원");
		Scanner scn = new Scanner(System.in);
		double[][] arr = new double[4][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println((i+1) + "학년 " + (j+1) + "학기 성적을 입력하시오");
				arr[i][j] = scn.nextDouble();
			}
		}

		System.out.print("학년을 입력하시오");
		int grade = scn.nextInt();
		System.out.println(grade + "학년 " + "1학기 성적: " + arr[grade - 1][0]);
		System.out.println(grade + "학년 " + "2학기 성적: " + arr[grade - 1][1]);
	}

}
