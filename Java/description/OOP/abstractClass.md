# 추상 클래스(abstract class)
## 추상 클래스란?

- 상속만을 하기 위해 만들어진 클래스
- 구현 코드없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
- 메서드 선언(declaration) : 반환 타입, 메서드 이름, 매개 변수로 구성
- 메서드 정의(definition) : 메서드 구현(implementation)과 동일한 의미 구현부(body)를 가진다.

```java
int add(int x, int y);   // 선언
int add(int x, int y){} // 구현부가 있음, 추상 메서드 X
```

- abstract 예약어를 사용한다.
- 추상 클래스는 new 할 수 없다 (인스턴스화 할 수 없음)

## 추상 클래스 구현하기

- 메서드에 구현 코드가 없으면 abstract로 선언
- abstract로 선언된 메서드를 가지는 클래스는 abstract로 선언
- 모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 할 수 없다.
- 추상 클래스의 추상 메서드는 하위 클래스가 상속하여 구현한다.
- 추상 클래스 내의 추상 메서드 : 하위 클래스가 구현해야 하는 메서드
- 추상 클래스 내의 구현된 메서드 : 하위 클래스가 공통으로 사용하는 메서드(필요에 따라 하위 클래스에서 재정의한다)

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-09/img/notebook.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-09/img/notebook.png)

## 템플릿 메서드 패턴

- 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
- final로 선언하여 사위 클래스에서 재정의 할 수 없게 한다.
- 프레임워크에서 많이 사용되는 설계 패턴
- 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현하도록 한다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-10/img/car.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-10/img/car.png)

### Hook 메서드

- 구현부는 있지만 구현 내용은 없는 메서드
- 추상 메서드가 아니다.
- 필요한 경우 하위 클래스에서 재정의하여 사용할 수 있다.

```java
public void washCar() {}
```

### final 예약어

- final 변수 : 값이 변경될 수 없는 상수

```java
public static final double PI = 3.14;
```

- final 메서드 : 하위 클래스에서 재정의 할수 없는 메서드
- final 클래스 : 상속할 수 없는 클래스