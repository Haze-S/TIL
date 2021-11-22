# 클래스 상속
- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능을 확장하여 클래스를 구현한다.
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속한다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-01/img/inheritance.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-01/img/inheritance.png)

- 상속의 문법

```java
class B extends A{ }
```

extends 키워드 뒤에는 단 하나의 클래스만 올 수 있다.

자바는 단일 상속(single inheritance)만을 지원한다.

## 상속을 구현하는 경우

- 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가진다.
- 하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가진다.
- 하위 클래스가 상위 클래스의 속성과 기능을 확장(extends)한다는 의미

## protected 접근 제어자

- 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근할 수 없다.
- 외부 클래스는 접근 할 수 없지만 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용한다.

## super();

- 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
- super()는 상위 클래스의 기본 생성자를 호출한다.
- 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출된다.
    - 이 때 반드시 상위 클래스의 기본 생성자가 존재해야 한다.
- 상위 클래스의 기본 생성자가 없는 경우 (다른 생성자가 있는 경우) 하위 클래스 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출한다.
- super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있다.

## 상속에서 인스턴스 메모리의 상태

- 항상 상위 클래스의 인스턴스가 먼저 생성되고, 하위 클래스의 인스턴스가 생성된다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-03/img/memory.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-03/img/memory.png)

## 업 캐스팅(upcasting)

- 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성한다.

```java
Customer customerLee = new VIPCustomer();
```

- 상위 클래스 타입의 변수에 하위 클래스 변수가 대입된다.

```java
VIPCustomer vCustomer = new VIPCustomer(); 
int addCustomer(Customer customer){ }
addCustomer(vCustomer);
```

- 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능하다.
- 상속 관계에서 모든 하위 클래스는 상위 클래스로 형 변환(업캐스팅)이 된다.
- 업캐스팅을 한 경우 상위 클래스의 멤버 변수와 메서드만 이용할 수 있다.

## 다운 캐스팅(downcasting)

- 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
- 하위 클래스로의 형 변환은 명시적으로 해야한다.

```java
Customer vc = new VIPCustomer();         // 묵시적
VIPCustomer vCustomer = (VIPCustomer)vc; // 명시적
```

### instanceof

- 원래 인스턴스의 혀ㅑㅇ이 맞는지 여부를 체크하는 키워드
- 맞으면 true 아니면 false를 반환한다.

## 상속은 언제 사용할까
### IS-A 관계 (is a relationship : inheritance)

- 일반적인(general)개념과 구체적인(specific) 개념과의 관계
- 상위 클래스 : 하위 클래스보다 일반적인 개념 ( 예: Employee )
- 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐( 예: Engineer, Manager... )
- 상속은 클래스간의 결합도가 높은 설계
- 상위 클래스의 수정이 많으면 하위 클래스에 영향을 미칠 수 있다.
- 계층 구조가 복잡하거나 hierarchy가 높으면 좋지 않다.

### HAS-A 관계(composition)

- 클래스가 다른 클래스를 포함하는 관계 (변수로 선언)
- 코드 재사용의 가장 일반적인 방법
- Student가 Subject를 포함하는
- Library를 구현할 때 ArrayList를 생성하여 사용
- 상속하지 않는다.