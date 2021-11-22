# static 변수
## 공통으로 사용하는 변수가 필요한 경우

- 여러 인스턴스가 공유하는 기준 값이 필요한 경우
- 여러개의 인스턴스들이 공유할 수 있는 변수가 static 변수이다.
    - 학생마다 새로운 학번, 카드 발급 시 새로운 카드 번호 등

### static 변수 선언과 사용하기

static int serialNum;

- 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
- 클래스 변수, 정적변수라고도 한다(vs, 인스턴스 변수)
- 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조
- static 변수는 인스턴스에서 공통으로 사용하는 영역이다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/mem.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-16/img/mem.png)

### static methods(클래스 메서드)

- 인스턴스 변수를 사용할 수 없다.
- static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있다.
- 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없다.

### 변수의 유효 범위(스코프)와 메모리

- 변수의 유효 범위와 생성과 소멸(life cycle)은 각 변수의 종류마다 다르다.
- 지역변수, 멤버 변수, 클래스 변수는 유효 범위와 life cycle, 사용하는 메모리가 다르다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-17/img/variable.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-17/img/variable.png)

- static 변수는 프로그램이 메로리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않다.
- 클래스 내부의 여러 메소드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋다.
- 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데 없는 메모리가 할당된다.

## 싱글톤 패턴(singleton pattern)

- 프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수, 메서드를 활용하여 구현할 수 있다.

### 구현하기

1. 생성자는 private로 선언
2. 클래스 내부에 유일한 private 인스턴스 생성
3. 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
    
    ![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-18/img/singleton.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-18/img/singleton.png)