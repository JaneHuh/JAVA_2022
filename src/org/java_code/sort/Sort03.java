package org.java_code.sort;

import java.util.Arrays;

public class Sort03 {

	public static void main(String[] args) {
		String[] arr = {"Steve", "Lee", "Park", "Kim" };

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
