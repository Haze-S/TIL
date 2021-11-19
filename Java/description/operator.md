# 연산자들
- 항(operand) : 연산에 사용되는 값
- 연산자(operator) : 항을 이용하여 연산하는 기호

### 대입 연산자 (assignment operator)

- 변수에 다른 변수나 값을 대입하는 연산자
- 이상 연산자 중 우선 순위가 가장 낮은 연산자들
- 왼쪽 변수 = 오른쪽 변수(또는 식, 값)

### 부호 연산자

- 단항 연산자
- 변수의 부호를 유지하거나(+) 바꾼다(-)
- 실제 변수의 부호가 변하려면 대입 연산자를 사용해야 한다.

### 산술 연산자

- 사칙 연산자

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/add.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/add.png)

- % 나머지 구하는 연산자, 숫자 n의 나머지 법위는 0 ~ n-1

### 복합 대입 연산자

- 대입 연산자와 다른 연산자가 함께 쓰인다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/multi.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/multi.png)

### 증가, 감소 연산자

- 단항 연산자
- 변수의 값을 1 더하거나 1 뺄 때 사용한다.
- 연산자가 항의 앞에 있는가, 뒤에 있는 가에 따라 연산 시점과 결과가 달라진다.
- 문장(statement)의 끝(;)을 기준으로 연산 시점을 생각해야 한다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/add2.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-11/img/add2.png)

### 관계 연산자

- 이항 연산자
- 연산의 결과가 true, false로 반환 되며 비교 연산자라고도 한다.
- 조건문, 반복문의 조건식으로 많이 사용된다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-12/img/relation.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-12/img/relation.png)

### 논리 연산자

- 관계 연산자와 혼합하여 많이 사용된다.
- 연산의 결과가 true, false로 반환된다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-12/img/logical.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-12/img/logical.png)

### 단락 회로 평가(short circuit evaluation)

- 논리 연산에서 모든 항이 실행되지 않는 경우
- 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true
    - 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않는다.
- 논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
    - 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않는다.

### 조건 연산자

- 삼항 연산자
- 조건식의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행된다.
- if (조건문)를 간단히 표현할 때 사용할 수 있다.

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/conditionop.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/conditionop.png)

### 비트 연산자

- 대입 연산자와 다른 연산자가 함께 쓰인다.
- 마스크 : 특정 비트를 가리고 몇 개의 비트 값만 사용할 때
- 비트 켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때
- 비트 끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때
- 비트 토글 : 모든 비트틀을 0은 1로, 1은 0으로 바꾸고 싶을 때

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/bit.PNG](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/bit.PNG)

### 연산자 우선 순위

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/priority.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/priority.png)