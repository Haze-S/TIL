# 데이터베이스
여러 사람에 의해 공유되어 사용될 목적으로 통합하여 관리되는 데이터의 집합을 말한다.<br/>
자료 항목의 중복을 없애고 자료를 구조화하여 저장함으로서 자료 검색과 갱신의 효율을 높인다.<br/>
공동 자료로서 각 사용자는 같은 데이터라 할지라도 각자의 응용 목적에 따라 다르게 사용할 수 있다.<br/>
[위키백과](https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4)

### 데이터베이스의 특징
1. 실시간 접근성
2. 지속적인 변화
3. 동시 공유
4. 내용에 대한 참조
5. 데이터 논리적 독립성

### 데이터베이스의 장단점
- 데이터베이스 장점
  - 데이터 중복 최소화
  - 데이터 공유
  - 일관성, 무결성, 보안성 유지
  - 최신의 데이터 유지
  - 데이터의 표준화 가능
  - 데이터의 논리적, 물리적 독립성
  - 용이한 데이터 접근
  - 데이터 저장 공간 절약

  <br/>
- 데이터베이스 단점
  - 데이터베이스 전문가 필요
  - 많은 비용 부담
  - 데이터 백업과 복구가 어려움
  - 시스템의 복잡함
  - 대용량 디스크로 엑세스가 집중되면 과부하 발생

### 데이터베이스 용어
- 식별자(identifier) : 여러개의 집합체를 담고있는 관계형 데이터베이스에서 각각의 구분할 수 있는 논리적인 개념
  - 유일성 : 하나의 릴레이션에서 모든 행은 서로 다른 키 값을 가져야 한다.
  - 최소성 : 꼭 필요한 최소한의 속성들만 키를 구성해야 한다.
- 튜플(Tuple) : 테이블에서 행을 의미한다. 같은 말로 레코드(Record) 혹은 로우(Row)라고 하며, 튜플은 릴레이션에서 같은 값을 가질 수 없다. 튜플의 수는 카디날리티(Cardinality) 라고 한다.
- 어트리뷰트(Attribute): 테이블에서 열을 의미한다. 같은말로 칼럼(Columm)이라고도 하며 어트리뷰트(Attribute)의 수를 의미하는 단어는 디그리(Degree)라고 한다.

### 데이터베이스 모델
- 관계 데이터 모델
  - 술어 논리와 집합론에 기반을 둔 일종의 데이터베이스 모델이다. 
- SQL
  - 관계형 데이터베이스 관리 시스템(RDBMS)의 데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어이다. 관계형 데이터베이스 관리 시스템에서 자료의 검색과 관리, 데이터베이스 스키마 생성과 수정, 데이터베이스 객체 접근 조정 관리를 위해 고안되었다.
- NoSQL
  - 데이터베이스는 전통적인 관계형 데이터베이스 보다 덜 제한적인 일관성 모델을 이용하는 데이터의 저장 및 검색을 위한 매커니즘을 제공한다. 디자인의 단순화, 수평적 확장성, 세세한 통제를 포함하며, NoSQL 데이터베이스는 단순 검색 및 추가 작업을 위한 매우 최적화된 키 값 저장 공간으로, 레이턴시와 스루풋과 관련하여 상당한 성능 이익을 내는 것이 목적이다. NoSQL 시스템은 SQL 계열 쿼리 언어를 사용할 수 있다는 사실을 강조한다는 면에서 "Not only SQL"로 불리기도 한다

### 데이터베이스 스키마
데이터베이스에서 자료의 구조, 자료의 표현 방법, 자료 간의 관계를 형식 언어로 정의한 구조이다. 데이터베이스 관리 시스템(DBMS)이 주어진 설정에 따라 데이터베이스 스키마를 생성하며, 데이터베이스 사용자가 자료를 저장, 조회, 삭제, 변경할 때 DBMS는 자신이 생성한 데이터베이스 스키마를 참조하여 명령을 수행한다.
- 외부 스키마(External Schema) : 프로그래머나 사용자의 입장에서 데이터베이스의 모습으로 조직의 일부분을 정의한 것
- 개념 스키마(Conceptual Schema) : 모든 응용 시스템과 사용자들이 필요로하는 데이터를 통합한 조직 전체의 데이터베이스 구조를 논리적으로 정의한 것
- 내부 스키마(Internal Schema) : 전체 데이터베이스의 물리적 저장 형태를 기술하는 것

### 쿼리 문법의 세 종류와 문법에 대한 설명
1. 데이터 정의 언어 (DDL)
  - 관계형 데이터베이스의 구조를 정의함
  - 쌍, 속성, 관계 인덱스 파일 위치 등 데이터베이스 고유의 특성을 포함함
2. 데이터 조작 언어 (DML)
  - 데이터베이스 검색, 등록, 삭제, 갱신을 하기 위해 사용하는 데이터베이스 언어
  - 데이터베이스의 검색 및 업데이트 등 데이터 조작을 위해 사용
3. 데이터 제어 언어 (DCL)
  - 데이터베이스에서 데이터에 대한 엑세스를 제어하기 위한 데이터베이스 언어 또는 데이터베이스 언어 요소
  - 박탈, 연결, 권한 부여, 질의, 자료 삽입, 갱신, 삭제 등