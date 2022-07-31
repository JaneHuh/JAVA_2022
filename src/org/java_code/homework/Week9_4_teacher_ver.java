package org.java_code.homework;

import java.util.Scanner;

public class Week9_4_teacher_ver {

	public static void main(String[] args) {
		char[][] ladder = new char[10][7];

		create_ladder(ladder); // 사다리 생성
		print_init_ladder(ladder);// 초기 사다리 출력

		int num_ladder = input_num_ladder();// 사다리 번호 입력
		int result = find(ladder, num_ladder);// 경로 탐색

		print_final_ladder(ladder, result);// 최종 사다리 출력
	}

	public static void create_ladder(char[][] array) {
		String[] pattern = { "| | | |", "|-| | |", "| |-| |", "| | |-|", "|-| |-|" }; // "|-|-|-|"은 안 됨
		for (int i = 0; i < array.length; ++i) {
			array[i] = pattern[(int) (Math.random() * 5)].toCharArray(); // 문자열.toCharArray
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
				System.out.println(array[i]); // char 는 배열명만 작성해도 다 출력됨
		}
	}

	public static int input_num_ladder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사다리 번호 선택: ");
		int num = sc.nextInt();
		return (num - 1) * 2; // 0 2 4 6
	}

	public static int find(char[][] array, int num) { // return int신경쓰기
		for (int i = 0; i < array.length; ++i) {
			while (true) {// 이중 for문 어려움 -> 왼쪽, 오른쪽, 밑으로 갈 수 있기 때문에.. 특정 x
				array[i][num] = '*';
				if (num > 0 && array[i][num - 1] == '-') { // 왼쪽에 다리가 연결되어 있는 경우,순서 중요!!array[0-1]은 없기 때문에 
					array[i][num - 1] = '*';
					num -= 2;// 왼쪽으로 한칸 이동하는 개념
				} else if (num < 6 && array[i][num + 1] == '-') { // 왼쪽에 다리가 연결되어 있는 경우
					array[i][num + 1] = '*';
					num += 2;// 왼쪽으로 한칸 이동하는 개념
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
		System.out.println(((num/2)+1)+" 번 당첨");
	}
}
