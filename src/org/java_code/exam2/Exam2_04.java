package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_04 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		System.out.println("4��");

		Scanner sc = new Scanner(System.in);
		double[][] score = new double[4][2];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				System.out.print((i+1)+"�г�" + (j+1)+ "�б��?" );
				score[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < 4; ++i) {
				double res = (score[i][0]+score[i][1])/2;
				System.out.print((i+1)+"�г� ");
				System.out.printf("3.1f%n", res);
				
			}
		
		/*for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				sum += score[i][j];
			}
		}*/
		
		//System.out.print(("1 �г�" + (score[0][0] + score[0][1] +score[0][2])/3 );

	}

}
