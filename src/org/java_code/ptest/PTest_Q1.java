package org.java_code.ptest;

public class PTest_Q1 {

	public static void main(String[] args) {
		
		for (int i = 0; i<5; ++i) {
			for (int j = 0; j<5; ++j) {
				if(i+j == 4 || i == j) {
					System.out.print(i+1);
				}
				else {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
