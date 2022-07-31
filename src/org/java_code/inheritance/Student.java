package org.java_code.inheritance;

public class Student extends Human{ //extends Human !!!!!!!!
	String name;
	String std_no;
	
	void study() {
		System.out.println("열공");
	}
	
	public Student() {//super가 가장 먼저 호출되어야함
		super(); //Student의 기본 생성자가 호출되기 전에 부모 클래스의 기본 생성자가 호출 되어야함
		this.name = "noname"; //this 명시 굳이 x
	}
	
	public Student(int age, String name, String std_no) {
		super.age = age; // Student에 없음 Human 부모클래스에 있음 -> super
		this.name = name; // Student클래스 안에 있음 
		this.std_no = std_no;
	}
	
	public Student(String std_no) {
		//super(); // Constructor call must be the first statement in a constructor
		this(); //this.name = "noname";
		this.std_no = std_no;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(24, "Park", "60201234");
		Student s3  = new Student("60201234");
	}

}
