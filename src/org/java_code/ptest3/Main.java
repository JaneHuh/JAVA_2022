package org.java_code.ptest3;

public class Main {

	void add() {
		System.out.println();
		return;
	}
	
	public static void main(String[] args) {
		Bird b01 = new Bird();
		b01.move();
		b01.twitter();
		
		Bird b02 = new Bird(160, 90);
		System.out.println("������� " + b02.get_size() + "�Դϴ�. " );
		System.out.println("������� " + b02.get_weight() + "�Դϴ�. " );
		
	
	}

}
