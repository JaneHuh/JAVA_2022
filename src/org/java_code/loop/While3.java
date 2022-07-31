package org.java_code.loop;

public class While3 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		
		while(i<=10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
