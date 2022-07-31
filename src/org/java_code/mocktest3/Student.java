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
		System.out.println(super.show_name() + "님이 " + h + "시간 공부했습니다.");
	}

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20, 88, "60211127");
		Student s2 = new Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}
}//괄호 