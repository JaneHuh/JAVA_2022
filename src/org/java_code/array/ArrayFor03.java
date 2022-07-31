package org.java_code.array;

import java.util.Scanner;

public class ArrayFor03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String [] str = new String[5];
		
		for(int i = 0; i<5; ++i) {
			str[i] = sc.next();
		}
		for(int i = 0; i<5; ++i) {
			System.out.println(str[i]);
		}
	}

}
