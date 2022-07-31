package org.java_code.object;

class A{
	static int i = 1;
	
	void print() { 
		int i = 2;
		System.out.println(i);
		System.out.println(this.i);
	}
}
public class ScopeClass {

	public static void main(String[] args) {
		A a01 = new A();
		a01.print();
		
	}

}
