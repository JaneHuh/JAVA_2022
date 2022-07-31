package org.java_code.homework2;

public class MainConstructorVer {

	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		// Book을 상속받은 PhilosophyAndPsyshology 객체 생성
		PhilosophyAndPsyshologyConstructorVer p1 = 
				new PhilosophyAndPsyshologyConstructorVer();
		PhilosophyAndPsyshologyConstructorVer p2 =
				new PhilosophyAndPsyshologyConstructorVer("니코마코스 윤리학", "아리스토텔레스", 2022, "Ethica Nicomachea");
		p1.bookinfo();
		p1.reference();
		
		p2.bookinfo();
		p2.reference();

		// Book을 상속받은 GeneralWorks 객체 생성
		GeneralWorksConstructorVer g1 = 
				new GeneralWorksConstructorVer();
		GeneralWorksConstructorVer g2 = 
				new GeneralWorksConstructorVer("Do it! 자바 프로그래밍 입문", "박은종", 2018, "IT/프로그래밍");
		g1.bookinfo();
		g1.subCategoryinfo();
		
		g2.bookinfo();
		g2.subCategoryinfo();
	}

}
