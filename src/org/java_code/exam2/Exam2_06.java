package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_06 {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		System.out.println("6��");
		
		char[] arr = {'A', 'B', 'C'};
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		try {
			System.out.println(arr[num]); //�迭 �ȿ� ������� try //System.out.println(name[number-1]); 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� ������ϴ�.");
		}
		
		
		
	}
	

}
