package org.java_code.mocktest1;

public class MockTest1_Q5 {

	public static void main(String[] args) {
		int[][] array = new int [5][5];
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				array[i][j] = (int)(Math.random()*10);
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
