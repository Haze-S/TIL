package ch04;

public class BinaryTest {
	public static void main(String[] args) {
		
		// 2, 8, 16������ �̿��� ������ ���� �տ� �ĺ��ڸ� �־�� �Ѵ�.
		
		int num = 10;
		int bNum = 0B1010; // 2����, 0B = B ���Ŀ� ������ ���� ���̳ʸ�
		int oNum = 012; // 8����, ���� �տ� 0�� ���� 8������ ��Ÿ��
		int xNum = 0XA; // 16����, 0X = X ���Ŀ� ������ ���� 16����
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
