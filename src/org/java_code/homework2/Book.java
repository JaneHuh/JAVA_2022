package org.java_code.homework2;

public class Book {
	//책의 특징을 객체화 한다. 
	public int publicationYear; //출판연도
	public String name,author; // 도서명, 저자명
	
	public void bookinfo() {
		System.out.println("도서명은 " + name + "입니다.");
		System.out.println("저자는 " + author + "입니다.");
		System.out.println("출판연도는 " + publicationYear +  "년도 입니다.");
	}
}
