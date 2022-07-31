package org.java_code.inheritance;

public class Temp { //this

	int a;
	
	Temp(){
		a = 5; //this.a = 5
	}
	
	int func (int a) {
		//return a; //파라미터 인자값 (가까운 값을 가져옴)
		return this.a; //Temp.a = 5 //this = 클래스명
		
	}
	
	public static void main(String[] args) {
		Temp t = new Temp();
		System.out.println(t.func(3)); //3
		System.out.println(t.a); //5
		
	}

}
