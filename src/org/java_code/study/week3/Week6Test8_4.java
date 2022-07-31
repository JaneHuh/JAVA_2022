package org.java_code.study.week3;

public class Week6Test8_4 {

	public static void main(String[] args) {
		int count = 16; // 1~15까지 나타내는 변수

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print("   "); //두자리 수로 시작 -> 공백 3칸 

			}
			for (int k = 0; k < 5 - i; ++k) {
				count -= 1; //1씩 감소 *위치 주의 
				if (count < 10) System.out.print(" " + count + " "); //한 자리수 -> 앞에 공백 한칸 추가  
				else System.out.print(count + " ");
				//만약 count -= 1; 가 이 자리에 위치하게 된다면 count = 15로 설정해야 됨

			}
			System.out.println();
		}
	}

}
