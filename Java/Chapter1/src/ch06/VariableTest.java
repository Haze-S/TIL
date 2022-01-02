package ch06;

public class VariableTest {
	public static void main(String[] args) {
		
		byte bnum = -128; // ~ 127
		
		System.out.println(bnum);
		
		// int num = 12345678900;  에러
		long num = 12345678900L; // long 사이즈의 리터럴을 이용할 때엔 숫자 뒤에 L을 붙여서 사용한다. 
		
		System.out.println(num);
	}
}
