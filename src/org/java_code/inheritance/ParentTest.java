package org.java_code.inheritance;

class Parent {
	int data = 100;

	public void print() {
		System.out.println("부모 클래스");
	}
}

class Child extends Parent {
	int data = 200;

	public void print() {
		int data = 300;
		super.print(); // 부모 클래스
		System.out.println("자식 클래스");
		System.out.println("data : " + data); // 가장 가까운 값
		System.out.println("this.data : " + this.data); // Child 클래스 안에
		System.out.println("super.data : " + super.data); // Parent 클래스
	}
}

public class ParentTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}

}
