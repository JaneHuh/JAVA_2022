package org.java_code.homework2;

//�ݷ������� �������� ���� �����ϰ� ���� Ŭ���� 
public class DogConstructorVer {
	private int bcs; // BCS(Body Condition Score) ��ü�������: �񸸵� ���
	private double weight, rer; // ������, RER( Resting Energy Requirement) ���� ������ �䱸��
	private String name; // ������ �̸�

	// ������
	public DogConstructorVer() {
		this.name = "������";
		this.weight = 0;
		this.bcs = 0;
	}

	public DogConstructorVer(String name, double weight, int bcs) {
		this.name = name;
		this.weight = weight;
		this.bcs = bcs;
	}

	// ������ ������ �����ִ� Method
	public void doginfo() {
		System.out.println("�̸��� " + this.name + "�Դϴ�.");
		System.out.println("�����Դ� " + this.weight + "�Դϴ�.");
	}

	// Resting Energy Requirement ���� ������ �䱸��(������ �����ϱ� ���� �ʿ��� �ּ����� Į�θ�)�� ����ϴ� Method
	public void RER() {
		rer = 70 * Math.pow(weight, 0.75);
		rer = Math.round(rer * 100) / 100.0;
		System.out.println("RER�� " + rer + "���� �ּ��� " + rer + "�� Į�θ��� �����ؾ� �մϴ�.");
	}

	// Body Condition Score ��ü������� (�񸸵� ���)�� ����ϴ� Method
	// BCS�� 1���� 5������ ������ �񸸵��� �Ǵ��ϸ� 1�� �������� ����, 5�� �������� ���ϴٰ� ����.
	public void BCS() {
		if (bcs == 1 || bcs == 2) {
			System.out.println("BCS " + bcs + "���� ��ü���Դϴ�. \n");
		} else if (bcs == 3) {
			System.out.println("BCS " + bcs + "���� ����ü���Դϴ�. \n");
		} else if (bcs == 4 || bcs == 5) {
			System.out.println("BCS " + bcs + "���� ��ü���Դϴ�. \n");
		} else {
			System.out.println("BCS ������ ������ϴ�. 1~5 ������ ���ڸ� �Է����ֽñ� �ٶ��ϴ�. \n");
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println("60211127 ������");
		DogConstructorVer dog1 = new DogConstructorVer();
		dog1.doginfo();
		dog1.RER();
		dog1.BCS();

		DogConstructorVer dog2 = new DogConstructorVer("����", 3, 3);
		dog2.doginfo();
		dog2.RER();
		dog2.BCS();
	}

}
