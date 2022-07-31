package org.java_code.homework2;

import java.util.Scanner;

public class Smartphone {
	String number;
	String agency;
	int battery_remain;
	int memory_remain;
	String language; //창작

	void show_phone_information() {
		System.out.println("폰번호: " + number);
		System.out.println("통신사: " + agency);
		System.out.println("배터리 충전 정도: " + battery_remain + "%");
		System.out.println("메모리 잔량: " + memory_remain + "MB");
		System.out.println("언어: " + language + "\n");

	}

	void change_agency() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 통신사를 입력하시오. ");
		String ca = sc.nextLine();

		String[] agencyarray = { "SKT", "KT", "LGU" };
		int temp = 0;
		for (int i = 0; i < agencyarray.length; i++) {
			if (ca.equals(agencyarray[i])) {
				if (ca.equals(agency)) {
					System.out.println("이미 해당 통신사 입니다. \n");
				} else {
					agency = ca;
					System.out.println(agency + "로 통신사 변경이 완료 되었습니다. \n");
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
		System.out.print("배터리 충전 시간을 입력하시오. ");
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
		System.out.print("사진을 몇 장 촬영하시겠습니까? ");
		int n = sc.nextInt();
		n *= 5;
		memory_remain -= n;
		if (memory_remain < 0) {
			memory_remain = 0;
			System.out.println("메모리가 부족합니다.");
		}
		System.out.println("메모리 잔량: " + memory_remain + "MB \n");
	}

	void delete_picture() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사진을 몇 장 삭제 하겠습니까? ");
		int n = sc.nextInt();
		n *= 5;
		memory_remain += n;
		if (memory_remain > 100) {
			memory_remain = 100;
			System.out.println("메모리가 충분히 확보되었습니다.");
		}
		System.out.println("메모리 잔량: " + memory_remain + "MB \n");
	}

	void change_language() { //창작
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 언어를 영어로 입력하시오. ");
		String lang = sc.nextLine();

		String[] languagearray = { "Chinese", "Spanish", "English", "Japanese", "Korean" };
		int temp0 = 0;

		for (int i = 0; i < languagearray.length; i++) {
			if (lang.equals(languagearray[i])) {
				if (lang.equals(language)) {
					System.out.println("이미 해당 언어입니다. \n");
				} else {
					language = lang;
					System.out.println(language + "(으)로 언어가 변경되었습니다. \n");
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
		System.out.println("60211127 허재인");

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
		sp.change_language(); //창작

	}

}

















