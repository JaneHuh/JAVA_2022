package org.java_code.object;

public class Scope {
	
	static int i = 100;
	
	static void test() {
		i = 0; //전역변수 i가 0으로 바뀌어 결과가 0으로 도출됨
	}
	
	public static void main(String[] args) {
		test();
		System.out.println(i);
		
	}

}
