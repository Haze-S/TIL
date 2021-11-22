# 메서드 재정의(overriding)

## 하위 클래스에서 메서드 재정의 하기

- 오버라이딩(overriding): 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있다.
- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않는다.
- 재정의하여 구현해야 한다.
- function 시그니쳐가 똑같이 정의되어야 한다.

## @overriding 애노테이션(annotation)

- 애노테이션은 원래 주석이라는 의미
- 컴파일러에게 특별한 정보를 제공해주는 역할

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-04/img/annotation.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-04/img/annotation.png)

- @overriding 애노테이션은 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 난다.

### 형 변환과 오버라이딩 메서드 호출

```java
Customer vc = new VIPCustomer();
```

vc 변수의 타입은 customer지만 인스턴스 타입은 VIPCustomer이다.

자바에서는 항상 인스턴스의 메서드가 호출된다(가상메서드의 원리)

자바의 모든 메서드는 가상 메서드(virtual method)이다.

## 메서드 재정의와 가성 메서드 원리

- 메서드(함수)의 이름은 주소값을 나타낸다.
- 메서드는 명령어의 set이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set이 위치한다.
- 해당 메서드가 호출되면 명령어 set이 있는 주소를 찾아 명령어가 실행된다.
- 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치하게 된다.
- 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출된다.
- 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메서드 명령어 set은 처음 한번만 로드된다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/mem.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/mem.png)

### 가상 메서드의 원리

- 가상 메서드 테이블(vitual method table)에서 해당 메서드에 대한 address를 가지고 있다.
- 재정의된 경우에는 재정의 된 메서드의 주소를 가리킨다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/virtual.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/virtual.png)

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/calcprice.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-05/img/calcprice.png)