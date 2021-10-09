# 숫자(Number)
Number 객체는 숫자 값으로 작업할 수 있게 해주는 래퍼(wrapper) 객체<br/>
<br/>
[mdn](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Number)

## methods

### Number.prototype.toFixed()
- 숫자를 고정 소수점 표기법으로 표기해 반환
- 문자 데이터로 반환된다.
```js
const pi = 3.14159265358979
console.log(pi) // 3.14159265358979

const str = pi.toFixed(2)
console.log(str) // 3.14
console.log(typeof str) // string
```

### Number.parseInt()
- 문자열을 분석하고 특정 진수를 사용한 정수로 변환해 반환
```js
const integer = parseInt(str)
console.log(integer) // 3
console.log(typeof integer) // number
```

### Number.parseFloat()
- 문자열을 분석해 부동소수점 실수로 반환
```js
const float = parseFloat(str)
console.log(float) // 3.14
console.log(typeof float) // number
```
