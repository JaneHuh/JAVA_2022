package org.java_code.homework;

import java.util.Scanner;

public class Week9_4_teacher_ver {

	public static void main(String[] args) {
		char[][] ladder = new char[10][7];

		create_ladder(ladder); // ��ٸ� ����
		print_init_ladder(ladder);// �ʱ� ��ٸ� ���

		int num_ladder = input_num_ladder();// ��ٸ� ��ȣ �Է�
		int result = find(ladder, num_ladder);// ��� Ž��

		print_final_ladder(ladder, result);// ���� ��ٸ� ���
	}

	public static void create_ladder(char[][] array) {
		String[] pattern = { "| | | |", "|-| | |", "| |-| |", "| | |-|", "|-| |-|" }; // "|-|-|-|"�� �� ��
		for (int i = 0; i < array.length; ++i) {
			array[i] = pattern[(int) (Math.random() * 5)].toCharArray(); // ���ڿ�.toCharArray
		}
	}

	public static void print_init_ladder(char[][] array) {
		for (int i = 0; i < 50; ++i) {
			System.out.println();
		}
		System.out.println("1 2 3 4");
		for (int i = 0; i < array.length; ++i) {
			if (i >= 4 && i <= 7) {
				System.out.println("???????");
			} else
				System.out.println(array[i]); // char �� �迭�� �ۼ��ص� �� ��µ�
		}
	}

	public static int input_num_ladder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ٸ� ��ȣ ����: ");
		int num = sc.nextInt();
		return (num - 1) * 2; // 0 2 4 6
	}

	public static int find(char[][] array, int num) { // return int�Ű澲��
		for (int i = 0; i < array.length; ++i) {
			while (true) {// ���� for�� ����� -> ����, ������, ������ �� �� �ֱ� ������.. Ư�� x
				array[i][num] = '*';
				if (num > 0 && array[i][num - 1] == '-') { // ���ʿ� �ٸ��� ����Ǿ� �ִ� ���,���� �߿�!!array[0-1]�� ���� ������ 
					array[i][num - 1] = '*';
					num -= 2;// �������� ��ĭ �̵��ϴ� ����
				} else if (num < 6 && array[i][num + 1] == '-') { // ���ʿ� �ٸ��� ����Ǿ� �ִ� ���
					array[i][num + 1] = '*';
					num += 2;// �������� ��ĭ �̵��ϴ� ����
				} else
					break;

			}
		}
		return num;
	}

	public static void print_final_ladder(char[][] array, int num) {
		for (int i = 0; i < 50; ++i) {
			System.out.println();
		}
		System.out.println("1 2 3 4");
		for(int i = 0; i<array.length;++i ) {
			System.out.println(array[i]);
		}
		System.out.println(((num/2)+1)+" �� ��÷");
	}
}
