package org.java_code.object;

public class ApplicationForClasses {
	String name, student_no;
	int credits;

	void register() {
		this.credits += 3;
		if (this.credits <= 18)
			System.out.println("수강신청 완료");
		else {
			credits -= 3;
			System.out.println("학점초과 ");
		}

	}

	void withdraw() {
		this.credits -= 3;
		if (this.credits > 0)
			System.out.println("수강철회 완료");
		else {
			credits += 3;
			System.out.println("철회할 과목 없음 ");
		}

	}

	void show_info() {
		System.out.println(this.name + " " + this.student_no);
		System.out.println(this.credits + "학점 신청중");
		
	}
	
	public ApplicationForClasses(String name, String no){
		this.name = name;
		this.student_no = no;
		this.credits = 0;
	}//자동 호출
	
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
