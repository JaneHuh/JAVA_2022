package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		int[][] score = new int[3][3];
		int max = 0;

		for (int i = 0; i < score.length; ++i) {//열
			System.out.println((i+1)+"번째 학생 점수는?");
			for (int j = 0; j < score[i].length; ++j) { //행
				score[i][j] = scn.nextInt();
				if (score[i][j]>max)
					 max = score[i][j];
			}
		}
		
		System.out.println("최고점은 "+ max);
	}

}
