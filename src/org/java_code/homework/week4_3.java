package org.java_code.homework;

import java.util.Scanner;

public class week4_3 {
	
	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행결과");
		System.out.print("나: ");
		char user = sc.nextLine().charAt(0); //char형 데이터 입력받기
	
		char computer = (char)(Math.random()*26 + 65); //임의의 문자 // 65 -> (int)('A')
		System.out.println("컴퓨터: " + computer);
		
		if (user>computer) System.out.println(computer + " " + user);
		else System.out.println(user + " " + computer);
	}
}
