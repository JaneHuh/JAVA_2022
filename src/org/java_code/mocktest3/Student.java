package org.java_code.mocktest3;

public class Student extends Human {

	String std_no;

	public Student() {
		super();
		this.std_no = "60200000";
	}

	public Student(String name, int age, int weight, String std_no) {
		super(name, age, weight);
		this.std_no = std_no;
	}

	public void study(int h) {// show_name()
		System.out.println(super.show_name() + "���� " + h + "�ð� �����߽��ϴ�.");
	}

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 20, 88, "60211127");
		Student s2 = new Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}
}//��ȣ 