package org.java_code.ptest3;

public class Animal {
	private int weight;
	
	public Animal() { //Bird 기본생성자가 생성되므로 생성해야함
	}
	
	public Animal(int weight) { //Bird 생성자에서 사용하므로 생성해야함
		this.weight =  weight;
	}
	public void move() { //Method는 상속이 된다!
		System.out.println("움직입니다.");
	}
	
	public int get_weight() { //Method는 상속이 된다!
		return this.weight;
	}
}
