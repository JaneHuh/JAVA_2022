package org.java_code.study.week7;

import java.util.Scanner;

public class Week10Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lotto = new int[20];
		int[] human = new int[20];

		for (int i = 0; i < 4; ++i) {
			int num = (int) (Math.random() * 20);
			if (lotto[num] == 0) {
				lotto[num] = 1;
			} else
				--i;
			
		}

		
		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		for (int i = 0; i < 4; ++i) {
			human[sc.nextInt()-1] = 1;
		}
		
		System.out.println("��÷��ȣ�� ");
		for (int i = 0; i < 20; ++i) {
			if(lotto[i] == 1)
				System.out.println((i+1) + " ");
		}
		int n=4;
		for (int i = 0; i < 4; ++i) {
			if (human[i] == lotto[i]) {
				n =- 1;
			}
			
		}
		
		if (n<=4 && n>=2) System.out.println(n + "��!");
		else System.out.println("��");

	}

}
