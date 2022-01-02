package ch04;

public class BinaryTest {
	public static void main(String[] args) {
		
		// 2, 8, 16진수를 이용할 때에는 숫자 앞에 식별자를 넣어야 한다.
		
		int num = 10;
		int bNum = 0B1010; // 2진수, 0B = B 이후에 나오는 수는 바이너리
		int oNum = 012; // 8진수, 숫자 앞에 0을 쓰면 8진수를 나타냄
		int xNum = 0XA; // 16진수, 0X = X 이후에 나오는 수는 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
