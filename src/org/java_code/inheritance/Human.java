package org.java_code.inheritance;

public class Human { //super
	int age;
	void breathe() {
		System.out.println("ÈŞ");
	}
	
	public Human() {
		this.age = 1;
	}
	
	public Human(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		Human h2 = new Human(20);
	}
	
	/*int age;
	void breathe() {
		System.out.println("ÈŞ");
	}
	
	public Human() {
		age = 1;
	}*/


}
