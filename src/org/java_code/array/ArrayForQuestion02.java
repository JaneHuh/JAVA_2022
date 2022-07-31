package org.java_code.array;

public class ArrayForQuestion02 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		double avg;
		

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = (double)(sum / arr.length);
		System.out.println(sum + " "+ avg); //sum+ avg -> 180.0, 사이에 공백 -> 150 30.0
	}

}
