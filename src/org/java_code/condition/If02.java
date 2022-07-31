package org.java_code.condition;

public class If02 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100);
		
		System.out.println(n);
		
		if (n>=70) {
			System.out.println("»ó");
		}
		else if (n>=40){ //40 <= n && n < 70
			System.out.println("Áß");
		}
		else {
			System.out.println("ÇÏ");
		}
			
	}

}
