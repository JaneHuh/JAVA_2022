package org.java_code.condition;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		int a0,b0,c0;
		int max0;
		Scanner sc = new Scanner(System.in);
		a0 = sc.nextInt();
		b0 = sc.nextInt();
		c0 = sc.nextInt();
		
		if(a0>b0 && a0>c0) max0 = a0;
		else if(b0>c0) max0 = b0;
		else max0 = c0;
		
		System.out.println("가장 큰 수는 "+max0);
			
	}

}
