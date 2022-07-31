package org.java_code.homework;

public class Week8_3 {

	public static void main(String[] args) {
		System.out.println("60211127 «„¿Á¿Œ");
		int randomNum;

		for (int i = 0; i < 5; ++i) {
			randomNum = (int) (Math.random() * 5 + 1);
			for (int j = 0; j < randomNum; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
