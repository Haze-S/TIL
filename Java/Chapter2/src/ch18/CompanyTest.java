package ch18;

import java.util.Calendar;

public class CompanyTest {
	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		// static인 경우 클래스 이름으로 가져와 쓴다.
		
		System.out.println(company1);
		System.out.println(company2);
		
		// Calender = Java util에서 제공되는 클래스
		Calendar calendar = Calendar.getInstance(); 
	}
}
