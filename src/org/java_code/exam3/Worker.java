package org.java_code.exam3;

public class Worker {
	private String name;
	private boolean married;
	private int start_year;

	public Worker() {
		this.name = "nonmae";
		this.married = false;
		this.start_year = 2020;
	}

	public Worker(String name, boolean married, int start_year) {
		this.name = name;
		this.married = married;
		this.start_year = start_year;
	}

	public void show_status() {
		System.out.print("�̸�: " + this.name);
		if (this.married) {
			System.out.print(" ��ȥ����: ��ȥ");
		}
		else {
			System.out.print(" ��ȥ����: ��ȥ");
		}
		System.out.println(  " ����: " + (2022 - this.start_year) + "��");
		}

	public void change_marital_status() {
		if (this.married) {
			this.married = false;
		} else {
			this.married = true;
		}
	}

	public static void main(String[] args) {
		Worker Kim = new Worker();
		Worker Lee = new Worker("�����", false, 2010);
		Kim.show_status();
		Lee.show_status();
		Lee.change_marital_status();
		Lee.show_status();
	}

}
