package org.java_code.homework2;

//���� Ŭ����
public class GeneralWorksConstructorVer extends BookConstructorVer {
	// �ѷ��� å�� �� �з��̱� ������
	// å ��ü�� ����Ѵ�.

	private String subCategory;

	public GeneralWorksConstructorVer() {
		super();
		this.subCategory = "unknown";
	}
	
	public GeneralWorksConstructorVer( String name, String author, int publicationYear, String subCategory) {
		super(name, author, publicationYear);
		//super.Update_bookinfo(name, author, publicationYear);
		this.subCategory = subCategory;
	}
	
	public void subCategoryinfo() {
		System.out.println("�Һз��� " + subCategory + "�Դϴ�. \n");
	}
}
