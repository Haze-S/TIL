# 기본 자료형(primitive data type)
![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-06/img/intdatatype.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-06/img/intdatatype.png)

## 정수 자료형

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-06/img/intdatatype2.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-06/img/intdatatype2.png)

### byte와 short

- byte : 1바이트 단위의 자료형. 동영상, 음악파일, 실행 파일의 자료를 처리할 때 사용한다.
- short : 2바이트 단위의 자료형 C/C++ 언어와 호환 시 사용한다.

### int

- 자바에서 사용하는 정수에 대한 기본 자료형
- 4바이트 단위의 자료형
- 프로그램에서 사용하는 모든 숫자(리터럴)는 int로 저장된다.
- 32비트를 초과하는 숫자는 long 자료형으로 처리한다.

### long

- 8바이트 자료형
- 숫자의 뒤에 알파벳 L 또는 l을 써서 long형임을 표시한다.

```java
int num = 12345678900;    // 오류
long num = 12345678900;   // 오류
long num = 12345678900L;  // ok
```

## 실수 자료형

### 부동 소수점 방식

- 실수는 정수보다 정밀하기 때문에 정수와는 다른 방식으로 표현된다.
- 부동 소수점 방식으로 실수 값 0.1이 표현된다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-07/img/realnum.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-07/img/realnum.png)

- 지수부와 가수부로 표현한다.
- 컴퓨터에서는 밑수를 2로 사용한다.
- 정규화 : 가수가 밑수보다 작은 한 자리까지 가수로 표현되는 것
- 컴퓨터에서는 밑수가 2이므로 정규화를 하게 되면 가수부분의 첫 번째 자리 숫자는 항상 1이다.

### float와 double

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-07/img/float.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-07/img/float.png)

- 자바에서는 실수의 기본 타입을 double로 사용한다.
- 지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에 오차가 발생할 수 있다.

```java
public class DoubleTest2 {

	public static void main(String[] args) {

		double dnum = 1;
		
		for(int i = 0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}
```

## 문자 자료형

### 문자도 정수로 표현한다.

- 어떠한 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
- 문자세트 : 각 문자를 얼마로 표현할 것인지 코드 값을 모아둔 것을 문자세트(charater set)라 한다. ( ex. ASKII, euc-kr, utf-8, utf-16 )
- 자바는 문자를 나타내기 위해 전 세계 표준인 UNICODE를 사용한다.
- utf-16 인코딩 사용 (모든 문자를 2바이트로 표시)

### 문자형 변수 선언

- 문자를 위한 데이터 타입 `char ch = "A";`
- 내부적으로는 숫자로 표현되기 때문에 숫자를 넣어도 문자가 출력될 수 있다. `char ch2 = 66;`

### 참고 용어

- character set : 문자를 숫자로 변환한 값의 세트
- encoding : 문자가 숫자로 변환되는 것
- decoding : 숫자에서 다시 문자로 변환되는 것
- ASKII code : 알파벳과 숫자 특수 문자등을 1바이트에 표현하는 데 사용하는 문자 세트
- UNICODE : 전 세계 표준으로 만든 문자 세트
- UTF-8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있다.
- UTF-16 : 2바이트로 문자를 표현한다.

## 논리형

- true, false 두 가지만 나타낸다.
- 1바이트를 사용 한다.
- 값이 존재하는지, 배열이 비었는지, 결과가 참인지 거짓인지 등을 표현한다.

## 자료형 없이 사용하는 지역 변수 ( 자바 10 이상)

- Local variable type inference
- 추론 가능한 변수에 대한 자료형을 선언하지 않음
- 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
- 지역 변수만 사용 가능

```java
public class LocalVariableType {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; 
	}
}
```