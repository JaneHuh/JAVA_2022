package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_Reference_MinMax {

	public static void main(String[] args) {
		//5�� �߿� ���� ū�� ���ϱ� (�迭���)
		Scanner sc = new Scanner (System.in);
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");
		int max = 0;
		int[] array = new int[5];

		for (int i = 0; i < 5 ; ++i) {
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < 5 ; ++j) {
			if (array[j] > max) {
				max = array[j];
			}
		}
		System.out.println("���� ū ���� " + max);
		
		
		
		
		//���ڸ� ������ �� ������ �Է� �޴ٰ� ���� "ū ��"�� ���� "������"�� ��� (������ ����)
		//Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�.");
		int max1 = 0, min1 = 0;

		int n = sc.nextInt();
		max1 = n;
		min1 = n;
		
		while (true) {
			n = sc.nextInt();

			if (n < 0) {
				break;
			} else if (n > max1) {
				max1 = n;
			} else if (n < min1) {
				min1 = n;
			}

		}
		System.out.println("���� ū ���� " + max1);
		System.out.println("���� ���� ���� " + min1);
		
		
		
		
		//������ �Է¹��� �� �߿� "���� ū ��" ���ϱ� (�Է¹ޱ�)
		int a0,b0,c0;
		int max0;
		//Scanner sc = new Scanner(System.in);
		a0 = sc.nextInt();
		b0 = sc.nextInt();
		c0 = sc.nextInt();
		
		if(a0>b0 && a0>c0) max0 = a0;
		else if(b0>c0) max0 = b0;
		else max0 = c0;
		
		System.out.println("���� ū ���� "+max0);
		
		
		
		
		//���ڸ� �Է¹޾Ƽ� ������ �Է��� ������ "ū ��"�� �ԷµǸ� �ٽ� �Է¹ޱ�. �۰ų� ������ ���� (while��)
		int current = 0; //ó���� 0�Է� ����
		//Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int next = sc.nextInt();
		
		while (current<next) {
			current = next; // == -> x
			System.out.print("���ڸ� �Է��Ͻÿ�.");
			next = sc.nextInt();
		}
		System.out.println("����");
		
		
		//MethodSort
		
		
	}

}
