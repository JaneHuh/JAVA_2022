package org.java_code.mocktest1;

import java.util.Scanner;

public class MockTest1_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = (char)(Math.random()*3 + 65);
		
		while (true) {
			System.out.println("ABC �� ���߽ÿ�.");
			char b = sc.nextLine().charAt(0); //char�� ������ �Է¹ޱ�
			
			
			if (a == b) {
				System.out.println("����!");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��Ͻÿ�.");
			}

		}
	}

}
