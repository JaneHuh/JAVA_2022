package org.java_code.object;

public class Company_worker extends Worker {
	String company_name;
	
	public Company_worker(int working_year, String company_name){
		super(working_year); //int�ε� string���� �Է������� �ʾҴ��� ����Ÿ�� Ȯ��
		this.company_name = company_name;
	}
	
}
