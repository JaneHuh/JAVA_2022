package org.java_code.object;

public class Student0 {
	private String StudentNo;
	private String Name;
	private boolean registered;

	public Student0() {
		this.registered = true;
	}

	public Student0(String StudentNo, String Name) {
		this(); // �� �տ� �⺻������ ȣ��
		this.StudentNo = StudentNo;
		this.Name = Name;
		// this.registered = true;
	}

	public void showInfo() {
		System.out.println(" �й� " + this.StudentNo + " �̸� " + this.Name + " ��Ͽ��� " + this.registered);
	}

	public void register() {
		if (this.registered) {
			System.out.println("�̹� ��ϵǾ��ֽ��ϴ�. ");
		} else {
			this.registered = true; //����, �����ؾ���
			System.out.println("��ϵǾ����ϴ�. ");
		}
	}

	public void leave() {
		if (this.registered == false) {
			System.out.println("�̹� �������Դϴ�.  ");
		} else {
			this.registered = false; //�����ؾ���
			System.out.println("����ó���Ǿ����ϴ�. ");
		}
	}

	public static void main(String[] args) {
		Student0 s1 = new Student0(); // �����ڸ� ȣ���϶�
		Student0 s2 = new Student0("60211127", "Jane");
		s1.register();
		s1.leave();
		s1.showInfo();
		s2.register();
		s2.leave();
		s2.showInfo();
	}

}
