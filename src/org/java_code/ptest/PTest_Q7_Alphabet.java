package org.java_code.ptest;

import java.util.Scanner;

public class PTest_Q7_Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char d = sc.next().charAt(0);
		int e = (int)d;
		
		if (e >= 97 && e <= 122) { //소문자
			e = e - 32;
			d = (char)e;
		}
		else if (e >= 65 && e <= 90){ //대문자
			e = e + 32;
			d = (char)e;
		}
		System.out.println(d);
	}

}
