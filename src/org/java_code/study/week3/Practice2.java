package org.java_code.study.week3;

public class Practice2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4-i; ++j) {
				System.out.print(" ");
				// "j < 4-i": ������ 4������ ���� 4,3,2,1,0 
			}
			for (int k = 0; k < i+1; ++k) {
				System.out.print("*");
				
			}
			System.out.println();
			// ��� "*"�� ���̿� ���� �ְ� ������ Practice1_1 ���� 
		}

	}

}
