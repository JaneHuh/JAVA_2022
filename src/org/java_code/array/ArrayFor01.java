package org.java_code.array;

public class ArrayFor01 {

	public static void main(String[] args) {
		int [] num = new int[5];
		
		for (int i = 0; i<5; ++i) {
			num[i] = (i+1)*10;
			System.out.println(num[i]);
		}
	}

}
