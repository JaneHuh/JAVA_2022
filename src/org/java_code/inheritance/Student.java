package org.java_code.inheritance;

public class Student extends Human{ //extends Human !!!!!!!!
	String name;
	String std_no;
	
	void study() {
		System.out.println("����");
	}
	
	public Student() {//super�� ���� ���� ȣ��Ǿ����
		super(); //Student�� �⺻ �����ڰ� ȣ��Ǳ� ���� �θ� Ŭ������ �⺻ �����ڰ� ȣ�� �Ǿ����
		this.name = "noname"; //this ��� ���� x
	}
	
	public Student(int age, String name, String std_no) {
		super.age = age; // Student�� ���� Human �θ�Ŭ������ ���� -> super
		this.name = name; // StudentŬ���� �ȿ� ���� 
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
