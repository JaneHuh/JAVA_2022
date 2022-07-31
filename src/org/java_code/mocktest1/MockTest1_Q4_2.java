package org.java_code.mocktest1;

public class MockTest1_Q4_2 {

	public static void main(String[] args) {
		/*int[][] array3 = new int [5][5];
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				if (i+j == 4 || i == j)
					System.out.print("O");
				array3[i][j] = (2*j)+i+1;
				System.out.print(array3[i][j]+ " ");
			}
			System.out.println();
		}*/

		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=5; ++j) {
				if (i+j == 4 || i == j)
				System.out.print("O");
				else { 
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}

}
