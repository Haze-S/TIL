# 객체(Object)
객체 래퍼(wrapper)를 생성<br/>
객체 데이터에서 속성의 이름은 고유해야한다.
<br/>
[mdn](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Object)

## methods
### static method
- .prototype이 아닌 경우
- 데이터 뒤에 바로 사용하지 못 한다.

`[ ].reverse()` ← 사용 가능 <br/>
`{ }.assign()` ← 사용 불가능 <br/>
`Object.assign()` ← 사용 가능

### Object.assign()
- 열거할 수 있는 하나 이상의 출처 객체로부터 대상 객체로 속성을 **복사할 때 사용**
- 대상 객체를 반환
```js
const userAge = {
  // key: value
  name: 'Haze',
  age: 20
}
const userEmail = {
  name: 'Haze',
  email: 'haze@gma.com'
}

const target = Object.assign(userAge, userEmail)
console.log(target) // {name: 'Haze', age: 20, email: 'haze@gma.com'}
console.log(userAge) // {name: 'Haze', age: 20, email: 'haze@gma.com'}
console.log(target === userAge) // true
// 생김새가 같아서 true가 아니라 메모리 영역이 같아서 true이다.

const a = { k: 123 }
const b = { k: 123 }
console.log(a === b) // false
// a, b는 서로 다른 메모리 주소를 보고 있다.
```
- 원본을 손상시키지 않고 대상 객체를 만드는 방법
```js
const userAge = {
  // key: value
  name: 'Haze',
  age: 20
}
const userEmail = {
  name: 'Haze',
  email: 'haze@gma.com'
}

const target = Object.assign({}, userAge, userEmail) // 빈 객체를 대상 객체로 만든다.
console.log(target) // {name: 'Haze', age: 20, email: 'haze@gma.com'}
console.log(userAge) // {name: 'Haze', age: 20}
console.log(target === userAge) // false
```

### Object.keys()
- 객체의 속성 이름들을 일반적인 반복문과 동일한 순서로 순회되는 열거할 수 있는 배열로 반환
```js
const user = {
  // key: value
  name: 'Haze',
  age: 20,
  email: 'haze@gma.com'
}

const keys = Object.keys(user)
console.log(keys) // (3) ['name', 'age', 'email']

// 객체의 인덱싱방법
console.log(user['email']) // haze@gma.com

const values = keys.map(key => user[key])
console.log(values) // (3) ['Haze', 20, 'haze@gma.com']
```