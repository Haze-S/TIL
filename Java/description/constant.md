# 상수와 리터럴
## 상수(constant)

- 변하지 않는 수
- final 예약어를 사용하여 선언한다.
- 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고 혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없다.

```java
public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;
	}
}
```

## 리터럴(literal)

- 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻한다.
- 리터럴은 상수 풀(constant pool)에 있다.
- 정수 리터럴은 int로 실수 리터럴은 double로 저장된다.
- 정수의 범위가 넘어가는 경우는 L 또는 l을, float로 사용하려는 경우는 F 또는 f 식별자를 써야 한다.

## 형 변환

- 서로 다른 자료형 간에 연산 등의 수행을 위해 하나의 자료형으로 통일하는 것
- 묵시적 형 변환(explicit type conversion, 자동 형 변환) 과 명시적 형 변환(implicit type conversion, 강제 형 변환) 이 있다.
- 바이트 크기가 작은 바료형에서 큰 자료형으로의 형 변환은 자동으로 이루어진다.
- 덜 정밀한 자료형에서 더 정밀한 자료형으로의 형 변환은 자동으로 이루어 진다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-10/img/conversion.PNG](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-10/img/conversion.PNG)