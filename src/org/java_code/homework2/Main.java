package org.java_code.homework2;

public class Main {

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		
		//Book�� ��ӹ��� PhilosophyAndPsyshology ��ü ����
		PhilosophyAndPsyshology p = new PhilosophyAndPsyshology(); 
		p.name = "���ڸ��ڽ� ������";
		p.author = "�Ƹ������ڷ���";
		p.publicationYear = 2022;
		p.bookinfo();
		
		p.originalBook = "Ethica Nicomachea";
		p.reference();
		
		//Book�� ��ӹ��� GeneralWorks ��ü ����
		GeneralWorks g = new GeneralWorks(); 
		g.name = "Do it! �ڹ� ���α׷��� �Թ�";
		g.author = "������";
		g.publicationYear = 2018;
		g.bookinfo();
		
		g.subCategory = "IT/���α׷���";
		g.subCategoryinfo();
			
		
	}

}
