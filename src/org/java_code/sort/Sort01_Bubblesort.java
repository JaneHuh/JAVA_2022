package org.java_code.sort;

public class Sort01_Bubblesort {

	public static void main(String[] args) {
		int[] arr = { 43, 16, 13, 8, 32, 10 };

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					// 사이다 콜라 내용물을 바꾸려면 빈병...이 필요함
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

					// 중복.. 똑같아져버림
					// arr[j] = arr[j+1];
					// arr[j+1] = arr[j];
				}
				for(int k=0; k<arr.length; ++k) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				
			}
		}
		
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
