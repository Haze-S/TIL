package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char korean = '��';
		char uni = '\uD55C';
		System.out.println(korean);
		System.out.println(uni);
	}
}