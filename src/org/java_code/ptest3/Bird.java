package org.java_code.ptest3;

public class Bird extends Animal{
	private int size;
	
	public Bird() {
		
	}
	public Bird(int size, int weight) {
		super(weight);
		this.size = size;
		
	}
	public void twitter() {
		System.out.println("�����Ҵϴ�");
	}
	
	public int get_size() {
		return this.size;
	}

	
}
