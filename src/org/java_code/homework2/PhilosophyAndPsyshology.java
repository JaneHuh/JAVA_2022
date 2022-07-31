package org.java_code.homework2;

public class PhilosophyAndPsyshology extends Book {
	//철학은 책의 한 분류이기 때문에
	//책 객체를 상속한다. 
	
	public String originalBook;
	
	public void reference(){
		System.out.println("참고한 원서는 " + originalBook + "입니다. \n");
	}

}
