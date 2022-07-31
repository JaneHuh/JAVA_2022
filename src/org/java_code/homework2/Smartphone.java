package org.java_code.homework2;

import java.util.Scanner;

public class Smartphone {
	String number;
	String agency;
	int battery_remain;
	int memory_remain;
	String language; //â��

	void show_phone_information() {
		System.out.println("����ȣ: " + number);
		System.out.println("��Ż�: " + agency);
		System.out.println("���͸� ���� ����: " + battery_remain + "%");
		System.out.println("�޸� �ܷ�: " + memory_remain + "MB");
		System.out.println("���: " + language + "\n");

	}

	void change_agency() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��Ż縦 �Է��Ͻÿ�. ");
		String ca = sc.nextLine();

		String[] agencyarray = { "SKT", "KT", "LGU" };
		int temp = 0;
		for (int i = 0; i < agencyarray.length; i++) {
			if (ca.equals(agencyarray[i])) {
				if (ca.equals(agency)) {
					System.out.println("�̹� �ش� ��Ż� �Դϴ�. \n");
				} else {
					agency = ca;
					System.out.println(agency + "�� ��Ż� ������ �Ϸ� �Ǿ����ϴ�. \n");
				}
				temp = 1;
				break;
			}
		}
		if (temp != 1) {
			System.err.println("error \n");
		}
	}

	void charge_battery() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���͸� ���� �ð��� �Է��Ͻÿ�. ");
		double b = sc.nextDouble();
		b *= 30;
		battery_remain += (int) b;
		if (battery_remain > 100) {
			battery_remain = 100;
		}
		System.out.println(battery_remain + "% \n");
	}

	void take_picture() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �� �Կ��Ͻðڽ��ϱ�? ");
		int n = sc.nextInt();
		n *= 5;
		memory_remain -= n;
		if (memory_remain < 0) {
			memory_remain = 0;
			System.out.println("�޸𸮰� �����մϴ�.");
		}
		System.out.println("�޸� �ܷ�: " + memory_remain + "MB \n");
	}

	void delete_picture() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �� ���� �ϰڽ��ϱ�? ");
		int n = sc.nextInt();
		n *= 5;
		memory_remain += n;
		if (memory_remain > 100) {
			memory_remain = 100;
			System.out.println("�޸𸮰� ����� Ȯ���Ǿ����ϴ�.");
		}
		System.out.println("�޸� �ܷ�: " + memory_remain + "MB \n");
	}

	void change_language() { //â��
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ����� �Է��Ͻÿ�. ");
		String lang = sc.nextLine();

		String[] languagearray = { "Chinese", "Spanish", "English", "Japanese", "Korean" };
		int temp0 = 0;

		for (int i = 0; i < languagearray.length; i++) {
			if (lang.equals(languagearray[i])) {
				if (lang.equals(language)) {
					System.out.println("�̹� �ش� ����Դϴ�. \n");
				} else {
					language = lang;
					System.out.println(language + "(��)�� �� ����Ǿ����ϴ�. \n");
				}
				temp0 = 1;
				break;
			}
		}

		if (temp0 != 1) {
			System.err.println("error \n");
		}
	}

	public static void main(String[] args) {
		System.out.println("60211127 ������");

		Smartphone sp = new Smartphone();
		sp.number = "010-1234-5678";
		sp.agency = "KT";
		sp.battery_remain = 60;
		sp.memory_remain = 5;
		sp.language = "English";

		sp.show_phone_information();
		sp.change_agency();
		sp.charge_battery();
		sp.take_picture();
		sp.delete_picture();
		sp.change_language(); //â��

	}

}

















