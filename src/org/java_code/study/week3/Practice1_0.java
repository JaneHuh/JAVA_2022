package org.java_code.study.week3;

public class Practice1_0 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) { 
				System.out.print(" ");// 공백*i번 만큼 밀려남 (i번만큼 for문이 돈다) 
				// "j < i" 설명: 첫 번째 i=0 j=0 -> j<i 성립 x (안돈다: 공백 없다) 
				//              두 번째 i=1 j=0 -> j<i 성립 o, i=1 j=1 -> j<i 성립 x (1번 돈다: 공백 한 개) 
				//	 		    세 번째 i=2 j=0 -> j<i 성립 o, i=2 j=1 -> j<i 성립 o, i=2 j=1 -> j<i 성립 x (2번 돈다: 공백 두 개)
			}
			for (int k = 0; k < 5 - i; ++k) {// 들여쓰기 해서 삼중중첩문 만들면 곤란.. 결과가 궁금하다면 직접 해보는 걸로!
				System.out.print("*");// Class Practice0와 구문 동일 (변수 이름만 j -> k로 달라짐 )
			}
			
			System.out.println();
			// 참고: 반드시 '공백 추가하는 for구문' 다음에 '"*"추가하는 for문' 순서대로 작성..  바꿔서 적으면 앞에 공백이 추가가 안 되더라고..
		}
	}

}
