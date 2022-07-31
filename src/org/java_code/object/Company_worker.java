package org.java_code.object;

public class Company_worker extends Worker {
	String company_name;
	
	public Company_worker(int working_year, String company_name){
		super(working_year); //int인데 string으로 입력하지는 않았는지 지정타입 확인
		this.company_name = company_name;
	}
	
}
