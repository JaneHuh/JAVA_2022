package org.java_code.homework;

import java.util.Scanner;

public class week4_3 {
	
	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������");
		System.out.print("��: ");
		char user = sc.nextLine().charAt(0); //char�� ������ �Է¹ޱ�
	
		char computer = (char)(Math.random()*26 + 65); //������ ���� // 65 -> (int)('A')
		System.out.println("��ǻ��: " + computer);
		
		if (user>computer) System.out.println(computer + " " + user);
		else System.out.println(user + " " + computer);
	}
}
