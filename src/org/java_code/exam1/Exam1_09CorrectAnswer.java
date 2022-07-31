package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_09CorrectAnswer {

	public static void main(String[] args) {
		System.out.println("9번");
		Scanner sc = new Scanner(System.in);

		int com = (int) (Math.random() * 3 + 1); // 임의의 알파벳 문자// 65 -> (int)('A')
		
		System.out.println("가위 바위 보 1. 가위 2. 바위 3. 보");
		int me = sc.nextInt();
		
		System.out.println("나: " + me);
		System.out.println("컴퓨터: " + com);
		
		if(com == me) {
			System.out.println("무승부");
		}
		else if((me==1 && com ==3) || (me==2 && com ==1) || (me==3 && com ==2)) {
			System.out.println("나 승");
		}
		else {
			System.out.println("컴퓨터 승");
		}

	}

}
