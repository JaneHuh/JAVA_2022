package org.java_code.study.week3;

public class Week6Test8_4 {

	public static void main(String[] args) {
		int count = 16; // 1~15���� ��Ÿ���� ����

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print("   "); //���ڸ� ���� ���� -> ���� 3ĭ 

			}
			for (int k = 0; k < 5 - i; ++k) {
				count -= 1; //1�� ���� *��ġ ���� 
				if (count < 10) System.out.print(" " + count + " "); //�� �ڸ��� -> �տ� ���� ��ĭ �߰�  
				else System.out.print(count + " ");
				//���� count -= 1; �� �� �ڸ��� ��ġ�ϰ� �ȴٸ� count = 15�� �����ؾ� ��

			}
			System.out.println();
		}
	}

}
