package org.java_code.array;

import java.util.Scanner;

public class ChallengeArray1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		String[] arSubject = {"����", "����", "����", "����"};
		int[] arScore = {100,80,90,95};
		
		String name;
		
		while(true) {
			System.out.println("������� �Է��ϼ���. ");
			name = scn.next();
			
			for(int i=0; i<arSubject.length;++i) {
				if(arSubject[i].equals(name))
					System.out.println(arSubject[i]+"�� ������"+arScore[i]);
			}
			
			if(name.equals("�׸�")) break;
		}
		
 	}

}
