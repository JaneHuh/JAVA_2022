package org.java_code.study.week3;

public class Practice2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4-i; ++j) {
				System.out.print(" ");
				// "j < 4-i": 공백이 4개부터 시작 4,3,2,1,0 
			}
			for (int k = 0; k < i+1; ++k) {
				System.out.print("*");
				
			}
			System.out.println();
			// 결과 "*"들 사이에 공백 넣고 싶으면 Practice1_1 참고 
		}

	}

}
