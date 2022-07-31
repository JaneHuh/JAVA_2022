package org.java_code.array;

public class ChallengeArray2 {

	public static void main(String[] args) {
		int[] array = new int[30];

		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < array.length; ++i) {
			array[i] = array[i-1] + array[i-2];
		}
		
		for (int i=0; i < 30; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
