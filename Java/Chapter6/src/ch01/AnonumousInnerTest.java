package ch01;

class Outer2{

	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {  // Runnable = java.lang ��Ű���� �������̽�, Ŭ������ ������ȭ �� �� run �޼��带 ������
		
		int num = 10;
		
		class MyRunnable implements Runnable {
			
			int localNum = 1000;

			@Override
			public void run() {
			
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
			
		}
		return new MyRunnable();
		
	}
	
}


public class AnonumousInnerTest {

	public static void main(String[] args) {

	}

}
