package org.java_code.study.week3;

public class Practice1_1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print("  "); // Class Practice1_0에서 공백 하나 추가
			}
			for (int k = 0; k < 5 - i; ++k) {
				System.out.print("* "); // Class Practice1_0에서 * 뒤에 공백 하나 추가

			}
			System.out.println();
		}
	}

}
