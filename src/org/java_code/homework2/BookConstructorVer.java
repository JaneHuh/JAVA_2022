package org.java_code.homework2;

//����Ŭ����
public class BookConstructorVer { 

	// å�� Ư¡�� ��üȭ �Ѵ�.
	private int publicationYear; // ���ǿ���
	private String name, author; // ������, ���ڸ�

	public BookConstructorVer() {
		this.name = "unknown";
		this.author = "unknown";
		this.publicationYear = 0;
	}
	
	public BookConstructorVer(String name, String author, int publicationYear ) {
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public void bookinfo() {
		System.out.println("�������� " + name + "�Դϴ�.");
		System.out.println("���ڴ� " + author + "�Դϴ�.");
		System.out.println("���ǿ����� " + publicationYear + "�⵵ �Դϴ�.");
	}
	
	/*public void Update_bookinfo(String name, String author, int publicationYear ) {
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}*/
}
