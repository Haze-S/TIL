# 배열(Array)
Number 객체는 숫자 값으로 작업할 수 있게 해주는 래퍼(wrapper) 객체<br/>
<br/>
[mdn](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array)

```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

console.log(numbers[1])
console.log(fruits[2])
```

## methods

### Array.prototype.length
- 배열의 길이를 반환
- length 속성에 값을 설정할 경우 배열의 길이를 변경
```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

console.log(numbers.length) // 4
console.log(fruits.length) // 3
console.log([1, 2].length) // 2
console.log([].length) // 0
```

### Array.prototype.concat()
- 인자로 주어진 배열이나 값들을 기존 배열에 합쳐서 새 배열을 반환
- 원본의 데이터는 수정되지 않는다.
```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

console.log(numbers.concat(fruits)) // (7) [1, 2, 3, 4, 'Apple', 'Banana', 'Cherry']
```

### Array.prototype.forEach()
- 주어진 함수를 배열 요소 각각에 대해 실행
- 배열의 아이템 개수만큼 콜백함수가 반복되면서 실행된다.
- 매개변수 (반복되는 아이템, 인덱스(횟수), 원본 배열데이터)
```js
const fruits = ['Apple', 'Banana', 'Cherry']

fruits.forEach(function (element, index, array) {
  console.log(element, index, array)
})
// Apple 0 (3) ['Apple', 'Banana', 'Cherry']
// Banana 1 (3) ['Apple', 'Banana', 'Cherry']
// Cherry 2 (3) ['Apple', 'Banana', 'Cherry']
```

### Array.prototype.map()
- 열 내의 모든 요소 각각에 대하여 주어진 함수를 호출한 결과를 모아 **새로운 배열**을 반환
- 배열의 아이템 개수만큼 콜백함수가 반복되면서 실행된다.
- `return` 키워드를 사용해서 **콜백함수 밖으로 반환**
```js
const fruits = ['Apple', 'Banana', 'Cherry']

const a = fruits.forEach((fruit, index) => {
  console.log(`${fruit}-${index}`)
  // Apple-0
  // Banana-1
  // Cherry-2
})
console.log(a) // undefined

const b = fruits.map((fruit, index) => ({
  id: index,
  name: fruit
}))
console.log(b) // (3) [{…}, {…}, {…}]
// 0: {id: 0, name: 'Apple'}
// 1: {id: 1, name: 'Banana'}
// 2: {id: 2, name: 'Cherry'}
// length: 3
```

### Array.prototype.filter()
- 주어진 함수의 테스트를 통과하는 모든 요소를 모아 새로운 배열로 반환
- 원본 배열의 개수와 .filter로 만들어진 배열의 개수가 다를 수 있다.
- 원본 배열의 데이터는 훼손하지 않는다.
```js
const numbers = [1, 2, 3, 4]

const a = numbers.map(number => number < 3)
console.log(a) // (4) [true, true, false, false]

const b = numbers.filter(number => number < 3)
console.log(b) // (2) [1, 2]
```

### Array.prototype.find()
- 주어진 판별 함수를 만족하는 첫 번째 요소의 값을 반환
- 그런 요소가 없다면 undefined를 반환
```js
const fruits = ['Apple', 'Banana', 'Cherry']

const a = fruits.find(fruit => /^B/.test(fruit)) 
// 정규표현식(/^B/) 대문자 B로 시작하는 문자데이터

console.log(a) // Banana
```

### Array.prototype.findIndex()
- 주어진 판별 함수를 만족하는 배열의 첫 번째 요소에 대한 인덱스를 반환
- 만족하는 요소가 없으면 -1을 반환
```js
const fruits = ['Apple', 'Banana', 'Cherry']

const a = fruits.findIndex(fruit => /^B/.test(fruit))
console.log(a) // 1
```

### Array.prototype.includes()
- 배열이 특정 요소를 포함하고 있는지 판별
```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

const a = numbers.includes(3)
console.log(a) // true

const b = fruits.includes('Haze')
console.log(b) // false
```

### Array.prototype.push()
- 배열의 끝에 하나 이상의 요소를 추가하고, 배열의 새로운 길이를 반환
- **주의! 원본이 수정된다**
```js
const numbers = [1, 2, 3, 4]

numbers.push(5)
console.log(numbers) // (5) [1, 2, 3, 4, 5]
```

### Array.prototype.unshift()
- 새로운 요소를 배열의 맨 앞쪽에 추가하고, 새로운 길이를 반환
- **주의! 원본이 수정된다**
```js
const numbers = [1, 2, 3, 4]

numbers.unshift(0)
console.log(numbers) // (6) [0, 1, 2, 3, 4, 5]
```

### Array.prototype.reverse()
- 배열의 순서를 반전
- 첫 번째 요소는 마지막 요소가 되며 마지막 요소는 첫 번째 요소가 된다.
- **주의! 원본이 수정된다**
```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

numbers.reverse()
fruits.reverse()

console.log(numbers) // (4) [4, 3, 2, 1]
console.log(fruits) // (3) ['Cherry', 'Banana', 'Apple']
```

### Array.prototype.splice()
- 배열의 기존 요소를 삭제 또는 교체하거나 새 요소를 추가하여 배열의 내용을 변경
- **주의! 원본이 수정된다**
```js
const numbers = [1, 2, 3, 4]
const fruits = ['Apple', 'Banana', 'Cherry']

numbers.splice(2, 1) // (index, 삭제할 아이템 개수) (삭제)
console.log(numbers) // (3) [1, 2, 4]

numbers.splice(2, 0, 50) // 50을 원래 3의 자리에 넣음 (교체)
console.log(numbers) // (4) [1, 2, 50, 4]

fruits.splice(2, 0, 'orange') // 새로운 데이터 끼워넣음
console.log(fruits) // (4) ['Apple', 'Banana', 'orange', 'Cherry']
```