package org.java_code.object;

public class Car {
	String color;
	int speed;
	
	void get_color() { //String get_color()
		System.out.println("차량 색상은 "+color);
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
		Car c1 = new Car(); // 클래스 객체(인스턴스)
		c1.speed = 0; //speed 초기화
		c1.color = "빨강";
		c1.get_color(); //객체명.메소드
		//System.out.println("차량 색상은 "+cl.get_color());	
		c1.speed_up(100);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_up(150);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_down(300);
		System.out.println("차량 속도는 "+c1.get_speed());	
		
		Car c2 = new Car();
	}

}
