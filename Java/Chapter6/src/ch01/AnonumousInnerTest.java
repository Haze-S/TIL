package ch01;

class Outer2{

	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {  // Runnable = java.lang ��Ű���� �������̽�, Ŭ������ ������ȭ �� �� run �޼��带 ������
		
		int num = 10;
		
		return new Runnable(){ // �͸� �Լ�
			
			int localNum = 1000;

			@Override
			public void run() {
			
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
			
		};
		
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {

			System.out.println("Runnable class");
		}
	};
	
}


public class AnonumousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
