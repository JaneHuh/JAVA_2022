package org.java_code.object;

public class Car {
	String color;
	int speed;
	
	void get_color() { //String get_color()
		System.out.println("���� ������ "+color);
		//return color;
	}
	
	int get_speed() {
		return speed;
	}
	
	void speed_up(int v){
		speed += v;
		if(speed > 200) speed = 200;
	}
	
	void speed_down(int v){
		speed -= v;
		if (speed < 0 ) speed = 0;
		
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(); // Ŭ���� ��ü(�ν��Ͻ�)
		c1.speed = 0; //speed �ʱ�ȭ
		c1.color = "����";
		c1.get_color(); //��ü��.�޼ҵ�
		//System.out.println("���� ������ "+cl.get_color());	
		c1.speed_up(100);
		System.out.println("���� �ӵ��� "+c1.get_speed());
		c1.speed_up(150);
		System.out.println("���� �ӵ��� "+c1.get_speed());
		c1.speed_down(300);
		System.out.println("���� �ӵ��� "+c1.get_speed());	
		
		Car c2 = new Car();
	}

}
