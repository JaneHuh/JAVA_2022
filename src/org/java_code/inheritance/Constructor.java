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
		return "이름: " + name + ", 나이: " + age;
	}
}

public class Constructor {
	public static void main(String[] args) {
		//Person p1 = new Person();
		Person p1 = new Person(28, "손흥민");
		System.out.println(p1.personInfo());
		//Person p2 = new Person(); //기본 생성자가 없는데 호출했으니 에러..
		//없는 메소드를 호출하는 꼴
	}

}
