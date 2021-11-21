# 배열(array)
- 동일한 자료형의 순차적 자료 구조
    - 배열을 사용할 땐 사이즈를 선언하고 사용한다(데이터 타입에따라 선언)
- 인덱스 연산자[]를 이용하여 빠른 참조가 가능
- 물리적 위치와 논리적 위치가 동일
- 배열의 순서는 0부터 시작
- 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용한다.

### 배열 선언과 초기화

- 배열 선언하기

```java
int[] arr1 = new int[10];
int arr2[] = new int[10];
```

- 배열 초기화하기
    - 배열은 선언과 동시에 자료형에 따라 초기화 된다(정수 = 0, 실수 = 0.0, 객체 = null)
    - 필요에 따라 초기값을 지정할 수 있다.

```java
int[] numbers = new int[] {10, 20, 30} // 개수 생략

int[] numbers = {10, 20, 30} // new int[] 생략 가능

int[] ids;
ids = new int[] {10, 20, 30} // 선언 후 배열을 생성하는 경우는 new int[] 생략 불가
```

### 배열 사용

- [ ] 인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아준다.
- **배열의 길이와 요소의 개수는 동일하지 않다.**
    - 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이터)가 없는 경우도 있음
    - 배열의 lenght 속성을 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
- lenght를 활용하여 오류가 나는 경우

```java
double[] dArr = new double[5];

dArr[0] = 1.1;
dArr[1] = 2.1;
dArr[2] = 3.1;

double mtotal = 1;
for(int i = 0; i < dArr.lenght; i++){
	mtotal *= dArr[i];
}

System.out.println(mtotal); // 0
```

- 요소의 개수에 대한 변수(count)를 따로 유지

```java
double[] dArr = new double[5];
int count = 0;
dArr[0] = 1.1; count++;
dArr[1] = 2.1; count++;
dArr[2] = 3.1; count++;

double mtotal = 1;
for(int i = 0; i < count; i++){
	mtotal *= dArr[i];
}

System.out.println(mtotal);
```

## 객체 배열

### 객체 배열 선언과 구현

기본 자료형 배열은 선언과 동시에 배열의 크기만큼 메모리가 할당되지만, 객체 배열의 경우 요소가 되는 개체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-21/img/library.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-21/img/library.png)

### 객체 배열 복사하기

```java
System.arrayCopy(src, srcPos, dest, destPos, length) // 자바에서 제공되는 배열 복사 메서드
```

- 얕은 복사
    - 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됨. 즉, 두 배열이 같은 객체를 가리킴
- 깊은 복사
    - 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함

## 다차원 배열

- 이차원 이상으로 구현 된 배열
- 평면 (이차원 배열)이나 공간(삼차원 배열)을 활용한 프로그램 구현

### 이차원 배열

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-22/img/two.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-22/img/two.png)

```java
int[][] arr = {{1,2,3}, {4,5,6}}
```

## 객체 배열을 구현한 클래스 ArrayList

### java.util 패키지에서 제공되는 ArrayList

- 기존의 배열 선언과 사용 방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지만 배열을 재 할당하고 복사해야 했다
- 배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야함
- ArrayList는 객체 배열을 좀 더 효율적으로 관리하기 위해 자바에서 제공해주는 클래스
- 이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용 방법만 익히면 유용하게 사용할 수 있다.
- 개수를 지정하지 않으면 default로 10개를 잡는다.

### ArrayList의 주요 메서드

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-23/img/method.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-23/img/method.png)

※ 이클립스의 경우 `F1`을 누르면 해당 클래스의 공식 문서를 볼 수 있다.  
메서드 별로 어떤 파라미터를 받아서 무엇을 반환해주는지 보는 것이 좋다.