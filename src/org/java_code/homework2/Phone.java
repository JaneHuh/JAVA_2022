package org.java_code.homework2;

public class Phone {
	String number;
	Boolean battery_is_full;

	void show_phone_number() {
		System.out.println("����ȣ�� " + number + "�Դϴ�.");
	}

	void recharge() {
		if (battery_is_full)
			System.out.println("�̹� ���͸��� �����Ǿ� �ֽ��ϴ�. ");
		else {
			System.out.println("�������Դϴ�.");
			battery_is_full = true;
		}
	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");
		Phone p = new Phone();
		p.number = "010-1234-5678";
		p.battery_is_full = false;
		
		p.show_phone_number();
		p.recharge();
		p.recharge();
	}

}
