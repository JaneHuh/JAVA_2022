package org.java_code.homework;

public class Week8_1 {

	public static void main(String[] args) {
		System.out.println("60211127 «„¿Á¿Œ");
		int[][] arr = new int[9][9];

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				arr[i][j] = (i+1)*(arr.length-j);
				System.out.printf("%-3d", arr[i][j]);

			}
			System.out.println();
		}
		
	}

}


//System.out.print(arr[i][j]+" ");
