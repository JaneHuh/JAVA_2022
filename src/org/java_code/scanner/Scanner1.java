package org.java_code.scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int i = scn.nextInt(); //int �Է¹޴´�.
		double d = scn.nextDouble();
		String s = scn.nextLine();
		
		System.out.println("int: " + i);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);//�׳� ���� ġ�� ""�Էµ� �ɷ� �ν�
		
	}

}
