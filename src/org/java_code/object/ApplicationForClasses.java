package org.java_code.object;

public class ApplicationForClasses {
	String name, student_no;
	int credits;

	void register() {
		this.credits += 3;
		if (this.credits <= 18)
			System.out.println("������û �Ϸ�");
		else {
			credits -= 3;
			System.out.println("�����ʰ� ");
		}

	}

	void withdraw() {
		this.credits -= 3;
		if (this.credits > 0)
			System.out.println("����öȸ �Ϸ�");
		else {
			credits += 3;
			System.out.println("öȸ�� ���� ���� ");
		}

	}

	void show_info() {
		System.out.println(this.name + " " + this.student_no);
		System.out.println(this.credits + "���� ��û��");
		
	}
	
	public ApplicationForClasses(String name, String no){
		this.name = name;
		this.student_no = no;
		this.credits = 0;
	}//�ڵ� ȣ��
	
	public ApplicationForClasses() {
		this.name = "noname";
		this.student_no = "nonumber";
		this.credits = 0;
	}
	
	
	
	public static void main(String[] args) {
		ApplicationForClasses s = new ApplicationForClasses("Jane", "60211127");
		//s.name = "Jane";
		//s.student_no = "60211127";
		ApplicationForClasses p = new ApplicationForClasses();
		
		p.register();
		p.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		
		
	}

}
