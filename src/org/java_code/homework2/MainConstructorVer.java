package org.java_code.homework2;

public class MainConstructorVer {

	public static void main(String[] args) {
		System.out.println("60211127 ������");

		// Book�� ��ӹ��� PhilosophyAndPsyshology ��ü ����
		PhilosophyAndPsyshologyConstructorVer p1 = 
				new PhilosophyAndPsyshologyConstructorVer();
		PhilosophyAndPsyshologyConstructorVer p2 =
				new PhilosophyAndPsyshologyConstructorVer("���ڸ��ڽ� ������", "�Ƹ������ڷ���", 2022, "Ethica Nicomachea");
		p1.bookinfo();
		p1.reference();
		
		p2.bookinfo();
		p2.reference();

		// Book�� ��ӹ��� GeneralWorks ��ü ����
		GeneralWorksConstructorVer g1 = 
				new GeneralWorksConstructorVer();
		GeneralWorksConstructorVer g2 = 
				new GeneralWorksConstructorVer("Do it! �ڹ� ���α׷��� �Թ�", "������", 2018, "IT/���α׷���");
		g1.bookinfo();
		g1.subCategoryinfo();
		
		g2.bookinfo();
		g2.subCategoryinfo();
	}

}
