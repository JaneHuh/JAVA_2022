package org.java_code.homework;

import java.util.Scanner;

public class PreviousQuestion3 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		Scanner sc = new Scanner(System.in);
		int computer, user;

		computer = (int) (Math.random() * 10 + 1); // 0���� 10����
		//System.out.println(computer); //��ǻ�Ͱ� ����� ��

		while (true) {
			System.out.print("���ڸ� �Է��Ͻÿ�. ");
			user = sc.nextInt();

			if (user > computer) {
				System.out.println("ũ��");
			} else if (user == computer) {
				System.out.println("����");
				break;
			} else {
				System.out.println("�۴�");

			}
		}
	}

}
