package org.java_code.homework2;

//하위클래스
public class PhilosophyAndPsyshologyConstructorVer extends BookConstructorVer { 
	// 철학은 책의 한 분류이기 때문에
	// 책 객체를 상속한다.

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
		System.out.println("참고한 원서는 " + originalBook + "입니다. \n");
	}

}
