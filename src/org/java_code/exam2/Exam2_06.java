package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_06 {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		System.out.println("6번");
		
		char[] arr = {'A', 'B', 'C'};
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		try {
			System.out.println(arr[num]); //배열 안에 집어넣음 try //System.out.println(name[number-1]); 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("범위에서 벗어났습니다.");
		}
		
		
		
	}
	

}
