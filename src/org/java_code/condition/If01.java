package org.java_code.condition;

public class If01 {

	public static void main(String[] args) {
		double n = Math.random();
		
		if(n>=0.5) {
			System.out.println("0.5이상");
		}//대괄호 오는게 하나의 문장이라면 생략가능 
		//if(n>0.5) System.out.println;
		else {
			System.out.println("0.5미만");
		}
;	}

}
