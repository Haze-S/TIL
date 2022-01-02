package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5;   // 00000101
		int num2 = 10;	// 00001010
		
		System.out.println( num1 | num2 );
		System.out.println( num1 & num2 );
		System.out.println( num1 ^ num2 );
		System.out.println( ~num1 );
		
		System.out.println( num1 << 2 );  // 옮기려는 비트 수(n)는 2의 n승이 되며, 왼쪽으로 옮길 경우 '초기 값 x 2의 n승'을 하면 출력되는 숫자를 알 수 있다.
		System.out.println( num1 <<= 2 );
		System.out.println( num1 >> 1 );  // 오른쪽으로 옮기면 '초기 값 / 2의 n승'이다.
	}

}
