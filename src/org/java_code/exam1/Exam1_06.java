package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_06 {

	public static void main(String[] args) {
		System.out.println("6¹ø");
		
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[5];
		//int sum = 0;
		
		for(int i=0; i<5; ++i) {
			array1[i] = sc.nextInt();
			
		} 
		for(int i=4; i>=0; --i) {
			System.out.println( array1[i] );
		}
		
	}

}
