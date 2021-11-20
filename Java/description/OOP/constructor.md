## 생성자

```java
<class_name>({[argument_list]}{[statements]})
```

- 객체를 생성할 때 new 키워드와 함께 사용
- 생성자는 기능을 호출하는 것이 아니라 객체를 생성할 때만 new와 함께 호출 된다.
- 객체가 생성될 때 변수나 상수를 초기화하거나 다른 초기화 기능을 수행하는 메서드를 호출한다.
- 생성자는 반환 값이 없고, 클래스 이름과 동일하다.
- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private로 선언되는 경우도 있다.

## 기본 생성자(default constructor)

- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
- 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있다.
- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어준다.

```java
public Student(){}
```

- 매개 변수, 구현부가 없다.

- 객체인 경우 항상 생성자를 써야하며 생성자는 힙이라는 메모리에 인스턴스가 생성이 된다.
- 자바 클래스의 경우 생성자를 제공하지 않으면 기본 생성자를 만들어준다.

## 생성자 오버로딩(overloading)

여러가지 생성자를 정의한다.

### 생성자 정의 하기

- 생성자를 구현해서 사용할 수 있다.
- 클래스에 생성자를 따로 구현하면 기본생성자는 제공되지 않는다.
- 생성자를 호출하는 코드에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있다.
- 사용하는 이유 : 사용하는 쪽의 편의성(필요에 따라 이용)을 위해서 제공한다.
## 참조자료형 변수
### 변수의 자료형

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-09/img/datatype.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-09/img/datatype.png)

- 클래스형으로 변수를 선언
- 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 참조 자료형은 클래스에 따라 다르다.
- 참조 자료형을 사용할 때는 해당 변수에 대해 생성하여야 한다.
    
    ( String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)
    

### 참조 자료형 사용

```java
public class Student {

	int sudentId;
	String studentName;
	
	Subject korea;  //  멤버변수 참조자료형
	Subject math;
	
	Student(int studentId, String StudentName){
		this.sudentId = studentId;
		this.studentName = StudentName;
		
		korea = new Subject();  //  생성자
		math = new Subject();
	}
}
```