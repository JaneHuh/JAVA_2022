package org.java_code.ptest3;

public class Dog {
	private String name, color, phone;
	private char sex;
	
	public Dog() {
		this.name = "�۸���";
		this.sex = 'm';
		this.color = "���";
		this.phone = "000-0000-0000";
	}
	
	public Dog(String name, char sex, String color, String phone) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.phone = phone;
	}
	
	public void show_info() {
		System.out.println("�̸�: " + name );
		if (this.sex == 'm') { // char�� ���, equals ���� == ���
			System.out.println("����: ����");
		}
		else {
			System.out.println("����: ����");
		}
		
		System.out.println("����: " + color );
		System.out.println("���� �ڵ���: " + phone);
	}
	
	public String show_name() { // return ���� void �Ұ��� 
		return name;
	}
	
	
	public void change_phone(String phone) {
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		Dog d01 = new Dog();
		Dog d02 = new Dog("�ϴ�", 'f', "������", "010-1234-5678");
		d01.show_info();
		d02.show_info();
		d01.change_phone("010-2345-2345");
		d01.show_info();
		System.out.println(d02.show_name());
		
	}

}
