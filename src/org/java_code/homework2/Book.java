package org.java_code.homework2;

public class Book {
	//å�� Ư¡�� ��üȭ �Ѵ�. 
	public int publicationYear; //���ǿ���
	public String name,author; // ������, ���ڸ�
	
	public void bookinfo() {
		System.out.println("�������� " + name + "�Դϴ�.");
		System.out.println("���ڴ� " + author + "�Դϴ�.");
		System.out.println("���ǿ����� " + publicationYear +  "�⵵ �Դϴ�.");
	}
}
