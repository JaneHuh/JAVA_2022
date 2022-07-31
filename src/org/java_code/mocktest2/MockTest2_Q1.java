package org.java_code.mocktest2;

public class MockTest2_Q1 {
	public static int get_max( int[] array ) {
		int max = 0;
		for(int i = 0; i<array.length; ++i) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {3, 6, 8, 2, 1};
		System.out.println("최대값은 " + get_max(arr));
	}

}
