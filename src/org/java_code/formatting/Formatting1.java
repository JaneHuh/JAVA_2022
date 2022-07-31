package org.java_code.formatting;

public class Formatting1 {

	public static void main(String[] args) {
		System.out.printf("%d + %d = %d ¿‘¥œ¥Ÿ.", 10, 20, 30);
		System.out.println();
		
		System.out.println( "Name " + "Total " + "Avg");
		System.out.println("Jones " + 950 + " " + 80.2436);
		System.out.println("Tom " + 1050 + " " + 90.43);
		
		System.out.printf("%s %s %s\n", "Name", "Total", "Avg");
		System.out.printf("%s %d %f\n", "Jones ", 950, 80.2436);
		System.out.printf("%s %d %f\n", "Tom", 1050, 90.43);
		
	}

}
