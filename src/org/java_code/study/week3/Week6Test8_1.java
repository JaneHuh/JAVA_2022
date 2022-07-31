package org.java_code.study.week3;

public class Week6Test8_1 {

	public static void main(String[] args) {
		String[][] array = new String[5][5];
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				if((i+j)%2 == 0) {
					array[i][j] = "*";
				}
				else { 
					array[i][j] = " ";
				} 
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
