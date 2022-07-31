package org.java_code.condition;

public class Switch1 {

	public static void main(String[] args) {
		String fruit = "사과";
		
		switch (fruit) { //카테고리별~
			case "사과":
			case "딸기":
				System.out.println("맛나");
				break;
			case "귤":
			case "오렌지":
				System.out.println("보통");
				break;
			default: //case에 선택되지 않은 값
				System.out.println("별로");
		}
	}

}
