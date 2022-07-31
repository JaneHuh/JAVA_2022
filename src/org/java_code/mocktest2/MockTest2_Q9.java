package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		/*for (int i = 1; i <= a; ++i) { // i가 1로 시작해야함
			if (a % i == 0 && i != 1 && i != a) {
				System.out.println(i + "의 배수입니다.");
				break;
			} else if (i == a)
				System.out.println("소수입니다.");
		}*/
		
		int i;
		
		for (i = 2; i <= a; ++i) {
			if(a % i == 0) break;
		}
		
		if (i < a) System.out.println(i+"의 배수");
		else System.out.println("소수입니다");

	}

}
