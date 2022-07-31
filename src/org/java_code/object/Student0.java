package org.java_code.object;

public class Student0 {
	private String StudentNo;
	private String Name;
	private boolean registered;

	public Student0() {
		this.registered = true;
	}

	public Student0(String StudentNo, String Name) {
		this(); // 맨 앞에 기본생성자 호출
		this.StudentNo = StudentNo;
		this.Name = Name;
		// this.registered = true;
	}

	public void showInfo() {
		System.out.println(" 학번 " + this.StudentNo + " 이름 " + this.Name + " 등록여부 " + this.registered);
	}

	public void register() {
		if (this.registered) {
			System.out.println("이미 등록되어있습니다. ");
		} else {
			this.registered = true; //주의, 변경해야함
			System.out.println("등록되었습니다. ");
		}
	}

	public void leave() {
		if (this.registered == false) {
			System.out.println("이미 휴학중입니다.  ");
		} else {
			this.registered = false; //변경해야함
			System.out.println("휴학처리되었습니다. ");
		}
	}

	public static void main(String[] args) {
		Student0 s1 = new Student0(); // 생성자를 호출하라
		Student0 s2 = new Student0("60211127", "Jane");
		s1.register();
		s1.leave();
		s1.showInfo();
		s2.register();
		s2.leave();
		s2.showInfo();
	}

}
