package org.java_code.homework;

import java.util.Scanner;

public class week4_2 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		switch (a){
		case "Korea":
		case "korea":
			System.out.println("���ѹα�");
			break;
		case "China":
		case "china":
			System.out.println("�߱�");
			break;
		case "Vietnam":
		case "vietnam":
			System.out.println("��Ʈ��");
			break;
		default :
			System.out.println("�ش����");
		}
	}

}
