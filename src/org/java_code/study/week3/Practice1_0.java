package org.java_code.study.week3;

public class Practice1_0 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) { 
				System.out.print(" ");// ����*i�� ��ŭ �з��� (i����ŭ for���� ����) 
				// "j < i" ����: ù ��° i=0 j=0 -> j<i ���� x (�ȵ���: ���� ����) 
				//              �� ��° i=1 j=0 -> j<i ���� o, i=1 j=1 -> j<i ���� x (1�� ����: ���� �� ��) 
				//	 		    �� ��° i=2 j=0 -> j<i ���� o, i=2 j=1 -> j<i ���� o, i=2 j=1 -> j<i ���� x (2�� ����: ���� �� ��)
			}
			for (int k = 0; k < 5 - i; ++k) {// �鿩���� �ؼ� ������ø�� ����� ���.. ����� �ñ��ϴٸ� ���� �غ��� �ɷ�!
				System.out.print("*");// Class Practice0�� ���� ���� (���� �̸��� j -> k�� �޶��� )
			}
			
			System.out.println();
			// ����: �ݵ�� '���� �߰��ϴ� for����' ������ '"*"�߰��ϴ� for��' ������� �ۼ�..  �ٲ㼭 ������ �տ� ������ �߰��� �� �Ǵ����..
		}
	}

}
