package ch18;


//싱글톤 패턴 (유일한 클래스 Company)

public class Company { 

	private static Company instance = new Company(); // 유일한 객체
	
	private Company() {} // private으로 생성자를 만들어서 컴파일러가 자동으로 default constructor를 만드는 것을 제지

	public static Company getInstance() { // 외부에서 클래스 이름으로 호출해서 사용할 수 있도록 static 선언
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
