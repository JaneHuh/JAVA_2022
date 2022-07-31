package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_Reference_MinMax {

	public static void main(String[] args) {
		//5개 중에 제일 큰값 구하기 (배열사용)
		Scanner sc = new Scanner (System.in);
		System.out.println("다섯 개의 수를 입력하시오.");
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
		System.out.println("가장 큰 수는 " + max);
		
		
		
		
		//숫자를 음수가 될 때까지 입력 받다가 가장 "큰 수"와 가장 "작은수"를 출력 (음수로 종료)
		//Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
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
		System.out.println("가장 큰 수는 " + max1);
		System.out.println("가장 작은 수는 " + min1);
		
		
		
		
		//세개의 입력받은 수 중에 "제일 큰 값" 구하기 (입력받기)
		int a0,b0,c0;
		int max0;
		//Scanner sc = new Scanner(System.in);
		a0 = sc.nextInt();
		b0 = sc.nextInt();
		c0 = sc.nextInt();
		
		if(a0>b0 && a0>c0) max0 = a0;
		else if(b0>c0) max0 = b0;
		else max0 = c0;
		
		System.out.println("가장 큰 수는 "+max0);
		
		
		
		
		//숫자를 입력받아서 이전에 입력한 수보다 "큰 수"가 입력되면 다시 입력받기. 작거나 같으면 종료 (while문)
		int current = 0; //처음에 0입력 가정
		//Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int next = sc.nextInt();
		
		while (current<next) {
			current = next; // == -> x
			System.out.print("숫자를 입력하시오.");
			next = sc.nextInt();
		}
		System.out.println("종료");
		
		
		//MethodSort
		
		
	}

}
