# 문자(string)
String 전역 객체는 문자열(문자의 나열)의 생성자<br/>
<br/>
[mdn](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String)

## methods
### String.prototype.indexOf()
- 호출한 String 객체에서 주어진 값과 일치하는 <u>첫 번째 인덱스</u>를 반환.
- 일치하는 값이 없으면 -1을 반환. 
```js
const result = 'Hello world!'.indexOf('world')
console.log(result) // 6

const result = 'Hello world!'.indexOf('Haze')
console.log(result) // -1

const str = '01 23'
console.log(str.indexOf('world') !== -1) // false
// 선언된 문자열에 매개변수가 있는 지를 숫자가 아닌 불린데이터로 출력
```

※ **prototype** : 프로토 타입을 통해서 지정한 메소드는 메모리에 딱 한번만 만들어지고 앞의 생성자(new)의 인스턴스에서 언제든지 활용할 수 있다.
```js
'Hello world!'.indexOf()
// String.prototype.indexOf()
```

### String.length
- 문자의 총 개수를 알 수 있다.
- **공백도 하나의 문자이다.**
```js
const str = '01 23'

console.log(str.length) // 5
```

### String.prototype.slice()
- 문자열의 일부를 추출하면서 새로운 문자열을 반환
```js
const str = 'Hello world!'

console.log(str.slice(0, 3)) // Hel
// 0부터 시작해서 2번째까지 반환
```

### String.prototype.replace()
- 첫번째 인수를 찾아서 두번째 인수로 교체한다.
```js
const str = 'Hello world!'

console.log(str.replace('world', 'Haze')) // Hello Haze!
console.log(str.replace(' world!', '')) // Hello
```

### String.prototype.match()
- 문자열이 정규식과 매치되는 부분을 검색한다.
- 문자열이 정규식과 일치하면, 전체 문자열을 첫 번째 요소로 포함하는 Array를 반환한 다음 괄호 안에 캡처된 결과가 나온다.
- 매개변수가 없으면 빈문자열이 있는 배열이, 일치하는 것이 없으면 null이 반환.
```js
const str = 'haze@gma.com'

console.log(str.match(/.+(?=@)/)) // ['haze', index: 0, input: 'haze@gma.com', groups: undefined]
console.log(str.match(/.+(?=@)/)[0]) // haze
// /.+(?=@)/ 정규표현식
```

### String.prototype.trim()
- 문자열 양 끝의 공백을 제거
```js
const str = '     Hello world  '
console.log(str.trim()) // Hello world
```