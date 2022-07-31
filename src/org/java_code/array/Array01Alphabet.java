package org.java_code.array;

public class Array01Alphabet {

	public static void main(String[] args) {
		char [] num = new char[5];
		
		for(int i=0; i<5; ++i) {
			num[i] = (char)('a'+i);
			System.out.println(num[i]);
		}
	}

}
