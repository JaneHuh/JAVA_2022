package org.java_code.study.week3;

public class Week6Test8_3 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				array[i][j] = 10*i+(j+1+10);
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
