package org.java_code.mocktest2;

import java.util.Scanner;

public class MockTest2_Q2_oddeven_booleantype {
	//boolean type!!
	public static boolean odd_even(int n) {
		if(n%2 == 0 ) return true;
		else return false;
		//return (n % 2 == 0);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (odd_even(a) == true)
			System.out.print("Â¦¼ö");
		else
			System.out.print("È¦¼ö");

	}

}
