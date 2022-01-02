package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		
		
		char ch1 = 'A'; // 2byte 문자, 쌍따옴표를 쓰는 경우는 문자열을 나타낸다. 내부적으로 문자열의 끝을 알리는 null char이 같이 있다(A10)
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char korean = '한';
		char uni = '\uD55C'; // UNICODE
		System.out.println(korean);
		System.out.println(uni);
	}
}
