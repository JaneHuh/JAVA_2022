package org.java_code.object;

public class Scope {
	
	static int i = 100;
	
	static void test() {
		i = 0; //�������� i�� 0���� �ٲ�� ����� 0���� �����
	}
	
	public static void main(String[] args) {
		test();
		System.out.println(i);
		
	}

}
