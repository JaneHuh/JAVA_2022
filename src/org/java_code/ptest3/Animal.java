package org.java_code.ptest3;

public class Animal {
	private int weight;
	
	public Animal() { //Bird �⺻�����ڰ� �����ǹǷ� �����ؾ���
	}
	
	public Animal(int weight) { //Bird �����ڿ��� ����ϹǷ� �����ؾ���
		this.weight =  weight;
	}
	public void move() { //Method�� ����� �ȴ�!
		System.out.println("�����Դϴ�.");
	}
	
	public int get_weight() { //Method�� ����� �ȴ�!
		return this.weight;
	}
}
