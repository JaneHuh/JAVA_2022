package org.java_code.loop;

import java.util.Scanner;

public class ChallengeWhile2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int current = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int next = scn.nextInt();
		
		while (current<next) {
			current = next; // == -> x
			System.out.print("���ڸ� �Է��Ͻÿ�.");
			next = scn.nextInt();
			
		}
		System.out.println("����");
	}

}
