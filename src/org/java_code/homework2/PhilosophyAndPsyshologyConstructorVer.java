package org.java_code.homework2;

//����Ŭ����
public class PhilosophyAndPsyshologyConstructorVer extends BookConstructorVer { 
	// ö���� å�� �� �з��̱� ������
	// å ��ü�� ����Ѵ�.

	private String originalBook;

	public PhilosophyAndPsyshologyConstructorVer() {
		super();
		this.originalBook = "unknown";
	}

	public PhilosophyAndPsyshologyConstructorVer(String name, String author, int publicationYear, String originalBook) {
		super(name, author, publicationYear);
		//super.Update_bookinfo(name, author, publicationYear);
		this.originalBook = originalBook;
	}

	public void reference() {
		System.out.println("������ ������ " + originalBook + "�Դϴ�. \n");
	}

}
