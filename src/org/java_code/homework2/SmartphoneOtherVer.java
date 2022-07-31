package org.java_code.homework2;

public class SmartphoneOtherVer {
	// 변수 설정
	String number; // 핸드폰번호
	String agency; // 통신사
	int memory; // 메모리 잔량
	int battery; // 배터리 충전 정도
	boolean wifi; // 와이파이 연결 유무

	// 메소드 설정
	void phone_default() {
		System.out.println("핸드폰 번호는 " + this.number + "입니다. ");
		System.out.println("통신사는 " + this.agency + "입니다. ");
		System.out.println("메모리 잔량은 " + this.memory + "MB입니다. ");
		System.out.println("배터리는 " + this.battery + "% 입니다. ");
		
	}
	
	void change_agency(String b) {
		if(b.equals(agency)) {
			System.out.println("기존 통신사와 동일합니다. \n");
		}
		else if (b.equals("LGU") ||b.equals("SKT") || b.equals("KT")  ) {
			agency = b;
			System.out.println(agency + "로 변경되었습니다. \n");
		}
		else System.out.println("통신사를 제대로 입력해주세요. \n");
	}
	
	void take_photo(int c) {
		memory -= 5 * c;
		if (memory < 0) {
			memory = 0;
			System.out.println("메모리가 부족합니다. \n");
		} else {
			System.out.println("현재 메모리 잔량은 " + memory + "MB입니다. \n ");
		}
	}

	void delete_photo(int d) {
		memory += 5 * d;
		System.out.println("현재 메모리 잔량은 " + memory + "MB입니다. \n ");
	}

	void charge_battery(double a ) {
		battery = (int) (battery * (1+ (0.3*a)));
		if(battery >=100) {
			battery = 100;
			System.out.println(battery+"% 입니다. 충전이 완료되었습니다. \n");
		}
		System.out.println(battery+"% 입니다. \n");
	}
	
	void connect_wifi() {
		if (this.wifi) {
			System.out.println("와이파이가 연결되어 있습니다. \n");
		} else {
			System.out.println("와이파이가 연결되어 있지 않습니다. \n");
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
