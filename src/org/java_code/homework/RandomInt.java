package org.java_code.homework;

public class RandomInt {

	public static void main(String[] args) {
		int randomNum = (int)(Math.random()*10);  //(int) ����ȯ, 0���� 9������ �� ��ȯ
		//randomNum = (int)Math.random()*10;      //���� -> �����ڰ� ����ȯ���� ���� ����Ǿ� �������� ��� 0���� ���´�.
		//1���� 10������ ���� ��ȯ�ϰ� �ʹٸ� �ڿ� +1�� �ϸ� �ȴ�. 
		//���� 0 �̻� 9 �̸��� ������ �����ϰ� �ʹٸ� *10 ��� *9�� �ϸ� �ȴ�. 
		
		System.out.println("60211127 ������");
		System.out.println(randomNum);
	}

}
