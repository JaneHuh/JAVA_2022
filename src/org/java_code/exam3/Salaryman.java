package org.java_code.exam3;

public class Salaryman extends Worker{
	private int salary;
	
	public Salaryman(String name, boolean married, int start_year, int salary) {
		super(name, married, start_year);
		this.salary = salary; 
	}

	public void increase_salary(int salary) {
		salary = (int)(salary*0.01); //double?
		this.salary = this.salary*(1+ salary);
	
	}
	public void show_info() {
		super.show_status();
		System.out.println("ø¨∫¿: " + this.salary);
	}
	public static void main(String[] args) {
		Salaryman s01 = new Salaryman("¿Ã∏Ì¡ˆ", true, 2012, 6000);
		 s01.show_info();
		 s01.increase_salary(5);
		 s01.show_info();

	}

}
