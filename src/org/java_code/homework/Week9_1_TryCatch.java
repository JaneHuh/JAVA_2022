package org.java_code.homework;

import java.util.Scanner;

public class Week9_1_TryCatch {

	public static void main(String[] args) {
		char[] name = {'J', 'A', 'N', 'E'};
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("���° ���ĺ��� ����Ʈ�ұ��? ");
			int number = sc.nextInt();
			
			try {
				System.out.println(name[number-1]); //ù��° ���ĺ�, 0��° �迭
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�������� ������ϴ�.");
			}
		}
	}

}
