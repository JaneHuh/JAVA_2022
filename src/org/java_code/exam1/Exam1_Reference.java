package org.java_code.exam1;

import java.util.Scanner;

public class Exam1_Reference {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		String c = sc.nextLine();
		char d = sc.next().charAt(0);
		
		
		//제곱
		int x = 1;
		System.out.println(Math.pow(x, 2)); //double 값임. 따라서 정수 출력하려면 형변환 필수!
		
		int y = 2;
		for (int i = 1; i<8; ++i) {
			System.out.print((int)Math.pow(y, i) + " ");
		}
		
		//랜덤
		System.out.println(Math.random()); //0 이상 1 미만의 실수를 반환
		int randomNum = (int)(Math.random()*10);  //(int) 형변환, 0부터 9까지의 값 반환
		//randomNum = (int)Math.random()*10;      //오류 -> 연산자가 형변환보다 먼저 수행되어 최종값이 계속 0으로 나온다.
		//1부터 10까지의 값을 반환하고 싶다면 뒤에 +1을 하면 된다. 
		//만약 0 이상 9 미만의 정수를 생성하고 싶다면 *10 대신 *9를 하면 된다.
		int n = (int)(Math.random()*100); //100점까지 101점이 맞김함,. 
		System.out.println("점수는 " + n);
		char computer = (char)(Math.random()*26 + 65); //임의의 알파벳 문자// 65 -> (int)('A')
		System.out.println("컴퓨터: " + computer);
		
		
		//반올림
		double random1 = Math.random();
		//random1 = Math.round(random1*10)/10; // 정수/정수=정수 -> 0
		System.out.println(random1);
		//random1 = (double)Math.round(random1*10)/10; //소수 둘째자리에서 반올림
		//System.out.println(random1); 
		random1 = (double)Math.round(random1*100)/100; //소수 셋째자리에서 반올림
		System.out.println(random1);
		
		
		//값 비교 
		String p = "aaa";
		String q = p;
		String r = new String("aaa");
		System.out.println(p==q); //true
		System.out.println(p==r); //false 서로 다른 주소값 -> 서로 다른 값
		System.out.println(p.equals(r)); //true 값 자체 비교
		
		
		//switch문
		switch (a) { //카테고리별~
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(31);
			break;//break없으면 밑에 문장들로 넘어감
		case 2:
			System.out.print(28);
			break;
		case 4: case 6:	case 9:	case 11:
			System.out.print(30);
			break;
		default: // case에 선택되지 않은 값
			System.out.println("잘못된 값");
		}
		
		
		//윤년
		if ((a%4 == 0 && a % 100 != 0) || a % 400 ==0) {
			System.out.println("윤년");
		}
		else {System.out.println("윤년아님");}
		
		
		//try ~ catch 코드
		try {
			System.out.println(); //배열 안에 집어넣음 try //System.out.println(name[number-1]); 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("범위에서 벗어났습니다.");
		}
		
		try {
			//result = a / b; 
			System.out.println();//result);
		} catch (ArithmeticException e) { //정수를 0으로 나눌경우 발생
			System.out.println("예외발생");
		}

		//IllegalArgumentException 잘못된 인자를 전달할 때 발생 
		//NumberFormatException 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생 
		
		
		
		
		
		
		
		//1부터 10까지의 합을 구하시오 (for문) (for문으로 출제가능성!!)
		int sum=0;
		
		for(int i = 1; i<=10; ++i ) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
		
		//숫자를 하나 입력받아서 입력받은 수까지의 합. 1 + 2 + 3 + .. + 9 = 45 (for문)
		System.out.print("숫자를 입력하시오: ");
		int n0 = sc.nextInt();
		int sum0 = 0;
		
		for(int i=1; i<=n0; ++i) {
			sum0 += i;
			System.out.print(i);
			if (i<n0) System.out.print(" + ");
			else System.out.print(" = ");
		}
		System.out.println(sum0);
		
		

		
		
		//continue ( 0 1 2 3 5 6 7 8 9 )4X
		for(int i=0; i<10; i++) {
			if(i == 4) continue;
			System.out.println(i);
		}
		for (int i=1; i<=10; ++i) {
			if(i%3 == 0) continue;
			System.out.println(i);
		}
		
		
		// 1~5까지 출력 (while문과 break문) 
		int i0 = 1;
		while ( true ) {
			//System.out.println(++i0); // 2~6까지 출력
			if ( i0 > 5) break;
			System.out.println(i0++); // 1~5까지 출력
		}
		
		
		//이중 for문 기본형 
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=5; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
