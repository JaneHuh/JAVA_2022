package org.java_code.exam1;

public class Exam1_08 {

	public static void main(String[] args) {
		System.out.println("8¹ø 2");
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i % 2 == 0 && j % 2 == 0) {
					System.out.print('0');
				} 
				 else {
					System.out.print('1');
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
