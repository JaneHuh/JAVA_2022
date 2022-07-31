package org.java_code.homework2;

//�ݷ������� �������� ���� �����ϰ� ���� Ŭ���� 
public class Dog {
	int bcs; // BCS(Body Condition Score) ��ü�������: �񸸵� ���
	double weight, rer; // ������, RER( Resting Energy Requirement) ���� ������ �䱸��
	String name; // ������ �̸�

	// �̸��� �����Զ�� �Ű������� ���� ������
	public Dog(String name, double weight, int bcs) {
		this.name = name;
		this.weight = weight;
		this.bcs = bcs;
	}

	// ������ ������ �����ִ� Method
	void doginfo() {
		System.out.println("�̸��� " + this.name + "�Դϴ�.");
		System.out.println("�����Դ� " + this.weight + "�Դϴ�.");
	}

	// Resting Energy Requirement ���� ������ �䱸��(������ �����ϱ� ���� �ʿ��� �ּ����� Į�θ�)�� ����ϴ� Method
	void RER() {
		rer = 70 * Math.pow(weight, 0.75);
		rer = Math.round(rer * 100) / 100.0;
		System.out.println("RER�� " + rer + "���� �ּ��� " + rer + "�� Į�θ��� �����ؾ� �մϴ�.");
	}

	// Body Condition Score ��ü������� (�񸸵� ���)�� ����ϴ� Method
	// BCS�� 1���� 5������ ������ �񸸵��� �Ǵ��ϸ� 1�� �������� ����, 5�� �������� ���ϴٰ� ����.
	void BCS() {
		if (bcs == 1 || bcs == 2) {
			System.out.println("BCS " + bcs + "���� ��ü���Դϴ�.");
		} else if (bcs == 3) {
			System.out.println("BCS " + bcs + "���� ����ü���Դϴ�.");
		} else if (bcs == 4 || bcs == 5) {
			System.out.println("BCS " + bcs + "���� ��ü���Դϴ�.");
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("60211127 ������");

		Dog dog = new Dog("����", 3, 3);
		dog.doginfo();
		dog.RER();
		dog.BCS();
	}

}
