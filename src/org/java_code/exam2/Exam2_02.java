package org.java_code.exam2;

import java.util.Scanner;

public class Exam2_02 {

	public static boolean is_prime(int n) {
		for (int i = 2; i < n; ++i) {
			if(n % i == 0  ) {
				return false;
			}
		}
		return true; //�ݺ��� �������ͼ�..
		
		
		/*for (int i = 2; i <= n; ++i) {
		if(n % i != 0 && n == i ) return true;
		else return false;
		}*/
	
	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		System.out.println("2��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (is_prime(a))
			System.out.print("�Ҽ�");
		else
			System.out.print("�Ҽ��ƴ�");

	}

}


