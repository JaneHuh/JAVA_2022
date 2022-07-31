package org.java_code.sort;

import java.util.Scanner;

public class Sort04ArraysortReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] array = {3, 5, 7, 2, 0};
		
		for(int i=0; i<array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		array = reverse(array);
		for(int i=0; i<array.length; ++i) {
			System.out.print(array[i]+ " ");
		}
		
	}
	
	public static int[] reverse(int[] array) {
		int [] arr = new int[5];
		
		for (int i = 0 ; i < array.length - 1 ; ++i) {
			arr[4-i] = array[i];
		}
		
		return arr;
	}

}
