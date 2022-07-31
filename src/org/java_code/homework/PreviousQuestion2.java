package org.java_code.homework;

public class PreviousQuestion2 {

	public static void main(String[] args) {
		System.out.println("60211127 «„¿Á¿Œ");
		int[][] array = new int [5][5];
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				array[i][j] = (2*j)+i+1;
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
