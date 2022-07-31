package org.java_code.homework2;

//반려동물이 강아지일 경우로 가정하고 만든 클래스 
public class Dog {
	int bcs; // BCS(Body Condition Score) 신체충실지수: 비만도 계산
	double weight, rer; // 몸무게, RER( Resting Energy Requirement) 기초 에너지 요구량
	String name; // 강아지 이름

	// 이름과 몸무게라는 매개변수를 갖는 생성자
	public Dog(String name, double weight, int bcs) {
		this.name = name;
		this.weight = weight;
		this.bcs = bcs;
	}

	// 강아지 정보를 보여주는 Method
	void doginfo() {
		System.out.println("이름은 " + this.name + "입니다.");
		System.out.println("몸무게는 " + this.weight + "입니다.");
	}

	// Resting Energy Requirement 기초 에너지 요구량(생명을 유지하기 위해 필요한 최소한의 칼로리)를 계산하는 Method
	void RER() {
		rer = 70 * Math.pow(weight, 0.75);
		rer = Math.round(rer * 100) / 100.0;
		System.out.println("RER는 " + rer + "으로 최소한 " + rer + "의 칼로리를 섭취해야 합니다.");
	}

	// Body Condition Score 신체충실지수 (비만도 계산)를 계산하는 Method
	// BCS는 1부터 5까지로 나누어 비만도를 판단하며 1에 가까울수록 마름, 5에 가까울수록 비만하다고 본다.
	void BCS() {
		if (bcs == 1 || bcs == 2) {
			System.out.println("BCS " + bcs + "으로 저체중입니다.");
		} else if (bcs == 3) {
			System.out.println("BCS " + bcs + "으로 정상체중입니다.");
		} else if (bcs == 4 || bcs == 5) {
			System.out.println("BCS " + bcs + "으로 과체중입니다.");
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("60211127 허재인");

		Dog dog = new Dog("멍이", 3, 3);
		dog.doginfo();
		dog.RER();
		dog.BCS();
	}

}
