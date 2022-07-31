package org.java_code.homework2;

public class GeneralWorks extends Book {
	//총류는 책의 한 분류이기 때문에
	//책 객체를 상속한다. 
	
	public String subCategory;

	public void subCategoryinfo(){
		System.out.println("소분류는 " + subCategory + "입니다. \n");
	}
}
