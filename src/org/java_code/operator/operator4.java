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
		System.out.println(a==c); //false 서로 다른 주소값 -> 서로 다른 값
		System.out.println(a.equals(c)); //true 값 자체 비교
	}

}
