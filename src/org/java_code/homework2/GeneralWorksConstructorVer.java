package org.java_code.homework2;

//하위 클래스
public class GeneralWorksConstructorVer extends BookConstructorVer {
	// 총류는 책의 한 분류이기 때문에
	// 책 객체를 상속한다.

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
		System.out.println("소분류는 " + subCategory + "입니다. \n");
	}
}
