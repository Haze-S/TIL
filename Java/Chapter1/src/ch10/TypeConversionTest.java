package ch10;

public class TypeConversionTest {
	public static void main(String[] args) {
		
//		byte bNum = 125;
//		int iNum = bNum;
//		
//		System.out.println(iNum);
//		
//		int iNum2 = 10;
//		byte bNum2 = (byte)iNum; 
//		// 더 작은 공간에 데이터를 넣기 위해서는 자료형을 명시해서 변환해줘야 한다.
//		// 주의! 자료에 문제가 생길 수 있음
//		
//		System.out.println(bNum2);
//		
//		double dNum = 3.14;
//		int inum = (int)dNum;
//		
//		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		// 형변환 후 연산의 순서에 따라 결과가 달라질 수 있음
	}
}
