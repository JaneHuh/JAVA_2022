package org.java_code.mocktest3;

public class Human {
	private String name;
	private int age;
	private int weight;
	
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}
	
	public Human(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void show_info() {
		System.out.println("이름: " + name + " 나이: " + age + " 몸무게: "+ weight);
	}
	
	public String show_name() {
		return this.name; //String!!!!!유의, 다른 클래스에서 쓰이게 될 예정 private 
	}
	
	
	public void gain_weight(int w) {
		this.weight += w;
		System.out.println(name + "의 몸무게가 " + weight + "kg이 되었습니다");
		if (weight > 100) {
			System.out.println("위험합니다. 체중을 줄이세요.");
		}
	}
	
	/*public static void main(String[] args) {
		Human h1 = new Human("홍길동", 20, 88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
	}*/

}
