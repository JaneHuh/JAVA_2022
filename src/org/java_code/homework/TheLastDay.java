package org.java_code.homework;

import java.util.Scanner;

public class TheLastDay {

	public static void main(String[] args) {
		//개인톡 #1
		System.out.println("60211127 허재인");
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("달 입력하세요: ");
		int month = sc.nextInt();
		
		switch (month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(31);
			break;
		case 2:
			System.out.print(28);
			break;
		case 4: case 6:	case 9:	case 11:
			System.out.print(30);
			break;
		default:
			System.out.println("잘못된 값");
		}
	}

}
