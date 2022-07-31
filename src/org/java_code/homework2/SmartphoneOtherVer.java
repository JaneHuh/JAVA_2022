package org.java_code.homework2;

public class SmartphoneOtherVer {
	// ���� ����
	String number; // �ڵ�����ȣ
	String agency; // ��Ż�
	int memory; // �޸� �ܷ�
	int battery; // ���͸� ���� ����
	boolean wifi; // �������� ���� ����

	// �޼ҵ� ����
	void phone_default() {
		System.out.println("�ڵ��� ��ȣ�� " + this.number + "�Դϴ�. ");
		System.out.println("��Ż�� " + this.agency + "�Դϴ�. ");
		System.out.println("�޸� �ܷ��� " + this.memory + "MB�Դϴ�. ");
		System.out.println("���͸��� " + this.battery + "% �Դϴ�. ");
		
	}
	
	void change_agency(String b) {
		if(b.equals(agency)) {
			System.out.println("���� ��Ż�� �����մϴ�. \n");
		}
		else if (b.equals("LGU") ||b.equals("SKT") || b.equals("KT")  ) {
			agency = b;
			System.out.println(agency + "�� ����Ǿ����ϴ�. \n");
		}
		else System.out.println("��Ż縦 ����� �Է����ּ���. \n");
	}
	
	void take_photo(int c) {
		memory -= 5 * c;
		if (memory < 0) {
			memory = 0;
			System.out.println("�޸𸮰� �����մϴ�. \n");
		} else {
			System.out.println("���� �޸� �ܷ��� " + memory + "MB�Դϴ�. \n ");
		}
	}

	void delete_photo(int d) {
		memory += 5 * d;
		System.out.println("���� �޸� �ܷ��� " + memory + "MB�Դϴ�. \n ");
	}

	void charge_battery(double a ) {
		battery = (int) (battery * (1+ (0.3*a)));
		if(battery >=100) {
			battery = 100;
			System.out.println(battery+"% �Դϴ�. ������ �Ϸ�Ǿ����ϴ�. \n");
		}
		System.out.println(battery+"% �Դϴ�. \n");
	}
	
	void connect_wifi() {
		if (this.wifi) {
			System.out.println("�������̰� ����Ǿ� �ֽ��ϴ�. \n");
		} else {
			System.out.println("�������̰� ����Ǿ� ���� �ʽ��ϴ�. \n");
		}
	}
	
	
	public static void main(String[] args) {
		SmartphoneOtherVer s1 = new SmartphoneOtherVer();
		
		s1.number = "010-1234-5678";
		s1.agency = "SKT";
		s1.memory = 20;
		s1.battery = 90;
		s1.wifi = false;
		
		s1.phone_default();
		s1.connect_wifi();
		s1.take_photo(10);
		s1.delete_photo(5);
		s1.charge_battery(3.5);
		s1.change_agency("KT");
		
	}

}
