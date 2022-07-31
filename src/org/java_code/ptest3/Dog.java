package org.java_code.ptest3;

public class Dog {
	private String name, color, phone;
	private char sex;
	
	public Dog() {
		this.name = "멍멍이";
		this.sex = 'm';
		this.color = "흰색";
		this.phone = "000-0000-0000";
	}
	
	public Dog(String name, char sex, String color, String phone) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.phone = phone;
	}
	
	public void show_info() {
		System.out.println("이름: " + name );
		if (this.sex == 'm') { // char알 경우, equals 말고 == 사용
			System.out.println("성별: 남자");
		}
		else {
			System.out.println("성별: 여자");
		}
		
		System.out.println("색상: " + color );
		System.out.println("주인 핸드폰: " + phone);
	}
	
	public String show_name() { // return 사용시 void 불가능 
		return name;
	}
	
	
	public void change_phone(String phone) {
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		Dog d01 = new Dog();
		Dog d02 = new Dog("하니", 'f', "검은색", "010-1234-5678");
		d01.show_info();
		d02.show_info();
		d01.change_phone("010-2345-2345");
		d01.show_info();
		System.out.println(d02.show_name());
		
	}

}
