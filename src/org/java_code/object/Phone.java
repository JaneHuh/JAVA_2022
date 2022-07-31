package org.java_code.object;

public class Phone {
	private String number;
	
	public String show_number() {
		return number;
	}
	
	public void call() {
		System.out.println("전화 걸기 ");
	}
	
	public void hang_up() {
		System.out.println("전화 끊 ");
	}
	
}
