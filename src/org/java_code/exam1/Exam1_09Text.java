package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_09Text {

	public static void main(String[] args) {
		System.out.println("9��");
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
			
		int com = (int) (Math.random() * 3 + 1); // ������ ���ĺ� ����// 65 -> (int)('A')
		
		System.out.println("���� ���� �� 1. ���� 2. ���� 3. ��");
		int me = sc.nextInt();
		
		System.out.println("��: " + str[me-1]);
		System.out.println("��ǻ��: " + str[com-1]);
		
		if(com == me) {
			System.out.println("���º�");
		}
		else if((me==1 && com ==3) || (me==2 && com ==1) || (me==3 && com ==2)) {
			System.out.println("�� ��");
		}
		else {
			System.out.println("��ǻ�� ��");
		}
		
		//String "����" String me sc.nextLine; String equals
	}

}