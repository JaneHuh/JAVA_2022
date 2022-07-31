package org.java_code.object;

public class Calculator {
	int a, b;
	
	public int sum(){//클래스 내부 메소드 static x, 
		return a+b;  //파라미터 x, 메인메소드에서 값을 전달받는게 아님... 클래스 멤버변수 활용하고 돌려줌
	}
	
	public int mul() {
		return a*b;
	}

	public int sub() {
		return a-b;
	}
	
	public double div() {
		return (double)a/(double)b;
	}
	

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.a = 4;
		c.b = 3;
		
		System.out.println(c.sum());
		System.out.println(c.mul());
		System.out.println(c.div());
		System.out.println(c.sub());
	}

}
