package org.java_code.method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodArraySort {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("���� �ٸ� �� ���� �Է��Ͻÿ�.");
		
		int[] n = new int[3];
		
		for(int i = 0; i<n.length; ++i) {
			n[i] = scn.nextInt();
		}
		
		sort(n);

	}
	
	public static void sort(int[] num) {
		Arrays.sort(num);
		for(int i = 0; i<num.length; ++i) {
			System.out.print(" " + num[i]);
		}
		//return; ����

	}

}
