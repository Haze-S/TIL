# JSON(JavaScript Object Notation)
- JSON은 속성-값 쌍 또는 "키-값 쌍"으로 이루어진 데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는 텍스트를 사용하는 개방형 표준 포맷
- 비동기 브라우저/서버 통신 (AJAX)을 위해, 넓게는 XML(AJAX가 사용)을 대체하는 주요 데이터 포맷이다.
- JSON의 공식 인터넷 미디어 타입은 application/json이며, JSON의 파일 확장자는 .json이다.
**문자열을 이용할 때는 큰 따옴표(" ")만 사용이 가능하며, undefined 자료형은 없다.**
[위키백과](https://ko.wikipedia.org/wiki/JSON)

### JSON 표기법
```json
{
  "string": "STRING",
  "number": 123,
  "boolean": true,
  "null": null,
  "object": {},
  "array": []
}
```
JSON은 하나의 문자 데이터이다.

```js
import myData from './myData.json'

console.log(myData)

const user = {
  name: 'Haze',
  age: 20,
  emails: [
    'haze@gma.com',
    'neo@zillinks.com'
  ]
}
console.log('user', user) // user {name: "Haze", age: 85, emails: Array(2)}

const str = JSON.stringify(user) // js 내부에서 JSON의 포맷으로 문자데이터화 해주는 메소드
console.log('str', str) // str {name: "Haze", age: 85, emails: ["haze@gma.com","neo@zillinks.com"]}
console.log(typeof str) // string

const obj = JSON.parse(str) // 분석해서 js에서 사용할 수 있도록 재조립
console.log('obj', obj) // obj {name: "Haze", age: 85, emails: Array(2)}
```
