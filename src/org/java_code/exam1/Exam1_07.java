package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_07 {

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
