# 인터페이스(interface)
- 모든 메서드가 추상 메서드로 선언된다. public abstract
- 모든 변수는 상수로 선언된다. public static final

```java
interface 인터페이스 이름 {
	public static final float pi = 3.14F;
	public void makesomething();
}
```

- 자바 8부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능의 제공으로 일부 구현 코드가 있다.
- CompleteCalc는 Calc의 타입 상속을 받음

### 인터페이스 구현과 형 변환

- 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환 할 수 있음

```java
Calc calc = new CompleteCalc();
```

- 상속에서의 형 변환과 동일한 의미
- 클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있다( cf. extends )
- 형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능하다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-11/img/type.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-11/img/type.png)

## 인터페이스가 하는 일

- 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
- 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제공하는 명세(specification)
- 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있다.
- 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미이다.
- 인터페이스를 구현한 다양한 객체를 사용한다 - 다형성

## 인터페이스의 다형성

- 하나의 인터페이스를 여러 객체가 구현하게 되면 클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있다 (다형성)

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-13/img/dao.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-13/img/dao.png)

### Dao

- DB에 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있게 구현한다.
- 환경파일(db.properties)에서 database의 종류에 대한 정보를 읽고 그 정보에 맞게 dao 인스턴스를 생성하여 실행될 수 있게 한다.

## 인터페이스의 여러가지 요소

### 상수

- 모든 변수는 상수로 변환 된다. public static final

```java
double PI = 3.14;
int ERROR = -999999999;
```

### 추상메서드

- 모든 선언된 메서드는 추상 메서드이다. public abstract

### 디폴트 메서드 (자바 8 이후)

- 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
- 인스턴스가 생성된 뒤 사용할 수 있다.
- default 키워드 사용

```java
default void description(){
	System.out.println("정수 계산기를 구현합니다.");
	myMethod();
}
```

- 구현하는 클래스에서 재정의 할 수 있다.

```java
@Override
public void description(){
	System.out.println("CompleteCalc에서 재정의한 default 메서드");
	// super.description();
}
```

- 인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능하다.

### 정적 메서드 (자바 8 이후)

- 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드

```java
static int total(int[] arr){
	int total = 0;
	
	for(int i : arr){
		total += i;
	}
	mystaticMethod();
	return total;
}
```

### private 메서드 (자바 9 이후)

- 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없다.
- 인터페이스 내부에서만 사용하기 위해서 구현하는 메서드
- default 메서드나 static 메서드에서 사용한다.

```java
private void myMethod() {
	System.out.println("private method");
}

private static void mystaticMethod(){
	System.out.println("private static method");
}
```

## 여러 인터페이스 구현

- 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스를 구현할 수 있다.
- 디폴트 메서드가 중복 되는 경우는 구현하는 클래스에서 재정의 하여야 한다.
- 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능하다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/multi.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/multi.png)

### 디폴트 메서드가 중복되는 경우

- 구현 코드를 가지고 인스턴스 생성된 경우만 호출되는 디폴트 메서드의 경우 두 개의 인터페이스에서 중복되면 구현하는 클래스에서 반드시 재정의를 해야한다.

```java
// Sell.java
public interface Sell {
	void sell();
	
	default void order(){
		System.out.println("판매 주문");
	}
}
```

```java
// Buy.java
public interface Buy {
	void buy();
	
	default void order(){
		System.out.println("구매 주문");
	}
}
```

```java
// Customer.java
public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");		
	}

	@Override
	public void order() {
		System.out.println("customer order");
	} // 중복된 디폴트 메서드 재정의

}
```

## 인터페이스의 상속

- 인터페이스 사이에도 상속을 사용할 수 있다.
- extends 키워드를 사용 한다.
- 인터페이스는 다중 상속이 가능하고 구현 코드의 상속이 아니므로 타입 상속이라고 한다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/inheritance.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/inheritance.png)

## 클래스 상속과 인터페이스 구현 함께 쓰기

- 실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/book.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-15/img/book.png)

1. 책이 순서대로 대여가 되는 도서관 구현
2. 책을 보관하는 자료 구조가 Shelf에 구현됨(ArrayList)
3. Queue 인터페이스를 구현함
4. Shelf 클래스를 상속 받고 Queue를 구현한다.