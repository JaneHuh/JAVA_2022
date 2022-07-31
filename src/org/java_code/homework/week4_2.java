package org.java_code.homework;

import java.util.Scanner;

public class week4_2 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		switch (a){
		case "Korea":
		case "korea":
			System.out.println("대한민국");
			break;
		case "China":
		case "china":
			System.out.println("중국");
			break;
		case "Vietnam":
		case "vietnam":
			System.out.println("베트남");
			break;
		default :
			System.out.println("해당없음");
		}
	}

}
