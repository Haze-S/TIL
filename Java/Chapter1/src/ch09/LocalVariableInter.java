package ch09;

public class LocalVariableInter {
	public static void main(String[] args) {
		
		var i = 10;        // int
		var j = 10.0;      // double
		var str = "test";  // String
		
		// �ڹ� 10���� ���� ����� �� �ִ� var ���� Ű����
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3;    		�̹� ������ ������ ������ ���� �ٲ� ��� ������ ����.
	}
}
