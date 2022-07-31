package org.java_code.operator;

public class operator3 {

	public static void main(String[] args) {
		/*		char a, b;
		a = 'A'; // "" -> x    '' -> o
		System.out.println((int)a); //아스키코드 값 */
		
		char c1, c2; 
		c1 = 'a';
		c2 = 'z'; 
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println("a가 z보다 앞선 것은 "+(c1<c2)); //c1>c2가 아니라 c1<c2로 해야함.  
	}

}


