package org.java_code.inheritance;

class Person{
	int age;
	String name;
	
	//public Person() {
	//	this.age = 20;
	//	this.name = "noname";
	//}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String personInfo() {
		return "�̸�: " + name + ", ����: " + age;
	}
}

public class Constructor {
	public static void main(String[] args) {
		//Person p1 = new Person();
		Person p1 = new Person(28, "�����");
		System.out.println(p1.personInfo());
		//Person p2 = new Person(); //�⺻ �����ڰ� ���µ� ȣ�������� ����..
		//���� �޼ҵ带 ȣ���ϴ� ��
	}

}
