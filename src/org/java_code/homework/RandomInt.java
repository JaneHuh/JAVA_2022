package org.java_code.homework;

public class RandomInt {

	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*10);  //(int) 형변환, 0부터 9까지의 값 반환
		//randomNum = (int)Math.random()*10;      //오류 -> 연산자가 형변환보다 먼저 수행되어 최종값이 계속 0으로 나온다.
		//1부터 10까지의 값을 반환하고 싶다면 뒤에 +1을 하면 된다. 
		//만약 0 이상 9 미만의 정수를 생성하고 싶다면 *10 대신 *9를 하면 된다. 
		
		System.out.println("60211127 허재인");
		System.out.println(randomNum);
	}

}
