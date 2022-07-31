package org.java_code.method;

import java.util.Scanner;

public class MethodSort {
	public static int[] sort(int x, int y, int z) {
		int[] arr = new int[3];
		
		//가장 큰 수 
		if (x > y && x > z) arr[2] = x;
		else if (y > z) arr[2] = y; // x < y , y > z
		else arr[2] = z; // y < z, x < z 
		
		//가장 작은 수
		if (x > y && z > y) arr[0] = y;
		else if (x > z) arr[0] = z;
		else arr[0] = x;
		
		//중간 수 
		if ((x > y && y > z) || (z > y && y > x)) arr[1] = y;
		else if ((y > x && x > z) || (z > x && x > y))arr[1] = x;
		else arr[1] = z;
		
		return arr;		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("서로 다른 세 수를 입력하시오.");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		int s[] = sort(num1, num2, num3);
				
		System.out.println(s[0] + " " + s[1] + " "  + s[2] );
	}
	




}
