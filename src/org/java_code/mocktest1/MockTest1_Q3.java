package org.java_code.mocktest1;

import java.util.Scanner;

public class MockTest1_Q3 {

	public static void main(String[] args) {
		System.out.println("7��");
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		switch (a) { //ī�װ���~
		
		case 3: case 6: case 9:
			System.out.print("3�� ���");
			break;
		default: // case�� ���õ��� ���� ��
			System.out.println("3�� ��� �ƴ� ");
		}
		
		
	}

}
