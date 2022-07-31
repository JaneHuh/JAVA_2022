package org.java_code.inheritance;

class Parent {
	int data = 100;

	public void print() {
		System.out.println("�θ� Ŭ����");
	}
}

class Child extends Parent {
	int data = 200;

	public void print() {
		int data = 300;
		super.print(); // �θ� Ŭ����
		System.out.println("�ڽ� Ŭ����");
		System.out.println("data : " + data); // ���� ����� ��
		System.out.println("this.data : " + this.data); // Child Ŭ���� �ȿ�
		System.out.println("super.data : " + super.data); // Parent Ŭ����
	}
}

public class ParentTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}

}
