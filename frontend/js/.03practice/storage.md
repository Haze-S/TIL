# storage

## Local Storage
[mdn](https://developer.mozilla.org/ko/docs/Web/API/Window/localStorage)<br/>
- Storage 객체에 접근할 수 있다.
- 저장한 데이터는 브라우저 세션 간에 공유된다.
- local storage에 저장되는 데이터는 해당하는 도메인 주소에 종속되서 저장이 된다.
- 하나의 사이트에 종속됨
- 데이터가 만료되지 않는다.

#### 항목 추가
```js
localStorage.setItem('key', 'value');
```
value는 문자 데이터로 저장하는 것을 권고한다.

#### 읽기 전용
```js
const cat = localStorage.getItem('key');
```
해당 데이터의 속성(키)값만 알면 된다.

#### 제거
```js
localStorage.removeItem('key');
```

## session Storage
- 페이지 세션이 끝날 때, 즉 페이지를 닫을 때 사라진다.

## 실행
### JSON.stringfy (JSON 문자화)
```js
const user = {
  name: 'Haze',
  age: 85,
  emails: [
    'haze@gma.com',
    'neo@zillinks.com'
  ]
}

localStorage.setItem('user', user)
```
위의 방법으로 저장하면 value 값은 원하는 데이터의 형태가 아닌 [object Object]라는 문자 형태로 저장이 된다.<br/>
따라서 데이터를 저장할 때 평소에 사용하는 일반적인 데이터(배열, 객체)가 아닌 문자 데이터로 변환해서 저장해야한다.
```js
localStorage.setItem('user', JSON.stringify(user))
```

### JSON.parse (js에서 이용하기 위해 변환)
문자 데이터로 저장된 JSON을 js로 사용하려면 객체 데이터로 다시 변환해야 한다.
```js
console.log(JSON.parse(localStorage.getItem('user')))
// {name: 'Haze', age: 85, emails: Array(2)}
// age: 85
// emails: (2) ['haze@gma.com', 'neo@zillinks.com']
// name: "Haze"
// [[Prototype]]: Object
```

### JSON.removeItem (데이터 삭제)
```js
localStorage.removeItem('user')
```

### JSON.setItem (데이터 수정)
순서
1. local storage에 있는 데이터를 가져와서 object로 변환
2. 키 값을 이용하여 데이터 수정
3. 수정된 object를 string으로 변환
4. .setItem으로 덮어쓰기
```js
const user = {
  name: 'Haze',
  age: 85,
  emails: [
    'haze@gma.com',
    'neo@zillinks.com'
  ]
}

const str = localStorage.getItem('user')
console.log(typeof str) // string
const obj = JSON.parse(str)
console.log(typeof obj) // object
obj.age = 22
console.log(obj) // {name: 'Haze', age: 22, emails: Array(2)}
localStorage.setItem('user', JSON.stringify(obj)) // 수정한 후 저장 (덮어쓰기)
```

## lowdb(lodash)
- 웹 브라우저에서 사용할 수 있는 작은 JSON 기반의 데이터베이스
- lodash 패키지를 기반으로 활용할 수 있다.
[lowdb](https://github.com/typicode/lowdb)
