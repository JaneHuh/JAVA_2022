package org.java_code.condition;

public class Switch1 {

	public static void main(String[] args) {
		String fruit = "���";
		
		switch (fruit) { //ī�װ���~
			case "���":
			case "����":
				System.out.println("����");
				break;
			case "��":
			case "������":
				System.out.println("����");
				break;
			default: //case�� ���õ��� ���� ��
				System.out.println("����");
		}
	}

}
