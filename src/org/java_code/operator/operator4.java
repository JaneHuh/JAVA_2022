package org.java_code.operator;

public class operator4 {

	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("c "+c);
		System.out.println(a==b); //true
		System.out.println(a==c); //false ���� �ٸ� �ּҰ� -> ���� �ٸ� ��
		System.out.println(a.equals(c)); //true �� ��ü ��
	}

}
