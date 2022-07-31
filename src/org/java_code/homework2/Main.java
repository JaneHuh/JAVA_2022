package org.java_code.homework2;

public class Main {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");
		
		//Book을 상속받은 PhilosophyAndPsyshology 객체 생성
		PhilosophyAndPsyshology p = new PhilosophyAndPsyshology(); 
		p.name = "니코마코스 윤리학";
		p.author = "아리스토텔레스";
		p.publicationYear = 2022;
		p.bookinfo();
		
		p.originalBook = "Ethica Nicomachea";
		p.reference();
		
		//Book을 상속받은 GeneralWorks 객체 생성
		GeneralWorks g = new GeneralWorks(); 
		g.name = "Do it! 자바 프로그래밍 입문";
		g.author = "박은종";
		g.publicationYear = 2018;
		g.bookinfo();
		
		g.subCategory = "IT/프로그래밍";
		g.subCategoryinfo();
			
		
	}

}
