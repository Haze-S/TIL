# 객체간의 협력(collabration)
## 객체 지향 프로그래밍에서의 협력

- 객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
- 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 한다.
- 매개 변수로 객체가 전달되는 경우가 발생

## 객체 자신을 가리키는 this
### this가 하는 일

- 인스턴스 자신의 메모리를 가리킴
- 생성자에서 또 다른 생성자를 호출할 때 사용
- 자신의 주소(참조값)를 반환한다.

### 생성된 인스턴스 메모리의 주소를 가진다.

- 클래스 내에서 참조변수가 가지는 주소값과 동일한 주소값을 가지는 키워드

![https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-12/img/this1.png](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter2/2-12/img/this1.png)

### 생성자에서 다른 생성자를 호출 하는 this

- 클래스에 생성자가 여러 개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있다.
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없다.