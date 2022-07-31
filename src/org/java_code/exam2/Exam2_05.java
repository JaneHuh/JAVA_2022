package org.java_code.exam2;

public class Exam2_05 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("5번");
		
		System.out.println("60211127 허재인");
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				//arr[i][j] = (i+1)*(j+4);
				arr[i][j] = (int)Math.pow(2, j+i);
				System.out.printf("%-4d", arr[i][j]);

			}
			System.out.println();
		}
		
	}

}
