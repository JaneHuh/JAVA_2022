package org.java_code.inheritance;

public class Temp { //this

	int a;
	
	Temp(){
		a = 5; //this.a = 5
	}
	
	int func (int a) {
		//return a; //�Ķ���� ���ڰ� (����� ���� ������)
		return this.a; //Temp.a = 5 //this = Ŭ������
		
	}
	
	public static void main(String[] args) {
		Temp t = new Temp();
		System.out.println(t.func(3)); //3
		System.out.println(t.a); //5
		
	}

}
