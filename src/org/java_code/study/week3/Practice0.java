package org.java_code.study.week3;

public class Practice0 { 

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5 - i; ++j) {
				System.out.print("* "); 
				// "j < 5-i" ����: ù ��° i=0 -> j < (5-0) -> j=0,1,2,3,4 (5�� ����) 
				//                �� ��° i=1 -> j < (5-1) -> j=0,1,2,3   (4�� ����) 
				//	 	          �� ��° i=2 -> j < (5-2) -> j=0,1,2     (3�� ����) ...
			}
			System.out.println();
		}
	}

}
