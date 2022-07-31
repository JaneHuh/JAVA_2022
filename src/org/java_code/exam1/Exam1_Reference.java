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
		
		
		//����
		int x = 1;
		System.out.println(Math.pow(x, 2)); //double ����. ���� ���� ����Ϸ��� ����ȯ �ʼ�!
		
		int y = 2;
		for (int i = 1; i<8; ++i) {
			System.out.print((int)Math.pow(y, i) + " ");
		}
		
		//����
		System.out.println(Math.random()); //0 �̻� 1 �̸��� �Ǽ��� ��ȯ
		int randomNum = (int)(Math.random()*10);  //(int) ����ȯ, 0���� 9������ �� ��ȯ
		//randomNum = (int)Math.random()*10;      //���� -> �����ڰ� ����ȯ���� ���� ����Ǿ� �������� ��� 0���� ���´�.
		//1���� 10������ ���� ��ȯ�ϰ� �ʹٸ� �ڿ� +1�� �ϸ� �ȴ�. 
		//���� 0 �̻� 9 �̸��� ������ �����ϰ� �ʹٸ� *10 ��� *9�� �ϸ� �ȴ�.
		int n = (int)(Math.random()*100); //100������ 101���� �±���,. 
		System.out.println("������ " + n);
		char computer = (char)(Math.random()*26 + 65); //������ ���ĺ� ����// 65 -> (int)('A')
		System.out.println("��ǻ��: " + computer);
		
		
		//�ݿø�
		double random1 = Math.random();
		//random1 = Math.round(random1*10)/10; // ����/����=���� -> 0
		System.out.println(random1);
		//random1 = (double)Math.round(random1*10)/10; //�Ҽ� ��°�ڸ����� �ݿø�
		//System.out.println(random1); 
		random1 = (double)Math.round(random1*100)/100; //�Ҽ� ��°�ڸ����� �ݿø�
		System.out.println(random1);
		
		
		//�� �� 
		String p = "aaa";
		String q = p;
		String r = new String("aaa");
		System.out.println(p==q); //true
		System.out.println(p==r); //false ���� �ٸ� �ּҰ� -> ���� �ٸ� ��
		System.out.println(p.equals(r)); //true �� ��ü ��
		
		
		//switch��
		switch (a) { //ī�װ���~
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(31);
			break;//break������ �ؿ� ������ �Ѿ
		case 2:
			System.out.print(28);
			break;
		case 4: case 6:	case 9:	case 11:
			System.out.print(30);
			break;
		default: // case�� ���õ��� ���� ��
			System.out.println("�߸��� ��");
		}
		
		
		//����
		if ((a%4 == 0 && a % 100 != 0) || a % 400 ==0) {
			System.out.println("����");
		}
		else {System.out.println("����ƴ�");}
		
		
		//try ~ catch �ڵ�
		try {
			System.out.println(); //�迭 �ȿ� ������� try //System.out.println(name[number-1]); 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� ������ϴ�.");
		}
		
		try {
			//result = a / b; 
			System.out.println();//result);
		} catch (ArithmeticException e) { //������ 0���� ������� �߻�
			System.out.println("���ܹ߻�");
		}

		//IllegalArgumentException �߸��� ���ڸ� ������ �� �߻� 
		//NumberFormatException ���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ�� �߻� 
		
		
		
		
		
		
		
		//1���� 10������ ���� ���Ͻÿ� (for��) (for������ �������ɼ�!!)
		int sum=0;
		
		for(int i = 1; i<=10; ++i ) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
		
		//���ڸ� �ϳ� �Է¹޾Ƽ� �Է¹��� �������� ��. 1 + 2 + 3 + .. + 9 = 45 (for��)
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
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
		
		
		// 1~5���� ��� (while���� break��) 
		int i0 = 1;
		while ( true ) {
			//System.out.println(++i0); // 2~6���� ���
			if ( i0 > 5) break;
			System.out.println(i0++); // 1~5���� ���
		}
		
		
		//���� for�� �⺻�� 
		for(int i=1; i<=5; ++i) {
			for(int j=1; j<=5; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
