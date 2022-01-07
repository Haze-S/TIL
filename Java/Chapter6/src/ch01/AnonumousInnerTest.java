package ch01;

class Outer2{

	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {  // Runnable = java.lang 패키지의 인터페이스, 클래스를 쓰레드화 할 때 run 메서드를 구현함
		
		int num = 10;
		
		return new Runnable(){ // 익명 함수
			
			int localNum = 1000;

			@Override
			public void run() {
			
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				
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
