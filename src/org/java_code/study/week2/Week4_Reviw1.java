package org.java_code.study.week2;

import java.util.Scanner;

public class Week4_Reviw1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String a = scn.nextLine();

		switch (a) {
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
