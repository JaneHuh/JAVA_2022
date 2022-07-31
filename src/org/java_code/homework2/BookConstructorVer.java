package org.java_code.homework2;

//상위클래스
public class BookConstructorVer { 

	// 책의 특징을 객체화 한다.
	private int publicationYear; // 출판연도
	private String name, author; // 도서명, 저자명

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
		System.out.println("도서명은 " + name + "입니다.");
		System.out.println("저자는 " + author + "입니다.");
		System.out.println("출판연도는 " + publicationYear + "년도 입니다.");
	}
	
	/*public void Update_bookinfo(String name, String author, int publicationYear ) {
		this.name = name;
		this.author = author;
		this.publicationYear = publicationYear;
	}*/
}
