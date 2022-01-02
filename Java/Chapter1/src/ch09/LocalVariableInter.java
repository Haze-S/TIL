package ch09;

public class LocalVariableInter {
	public static void main(String[] args) {
		
		var i = 10;        // int
		var j = 10.0;      // double
		var str = "test";  // String
		
		// 자바 10버전 이후 사용할 수 있는 var 변수 키워드
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3;    		이미 쓰여진 변수의 데이터 형을 바꿀 경우 에러가 난다.
	}
}
