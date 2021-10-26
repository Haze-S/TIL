# 함수
  
```javascript
function sum() {
  console.log(arguments)
  return // 함수가 종료됨을 의미함. 그 이후에 나오는 것들은 실행되지 않음.
}
```

## 화살표 함수
() => {}  vs  funtion () {}
```javascript
const double1 = function (x) {
  return x * 2
}

console.log('double: ', double1(7))

// const doubleArrow = (x) => {
//   return x * 2
// }
const doubleArrow = x => x * 2 
// 축약형은 중괄호를 이용하는 객체데이터의 경우 ({}) 소괄호 안에 감싸서 실행한다.

console.log('doubleArrow: ', doubleArrow(7))
```

## 즉시실행함수
IIFE, Immediately-Invoked Function Expression<br/>
함수를 만들자마자 즉시 실행하는 경우에 사용, 사용 직전 로직에 세미콜론을 써야 에러가 나지 않는다.
```javascript
const a = 7
function double2() {
  console.log(a * 2)
}
double2();

(function () {
  console.log(a * 2)
})();

(function () {
  console.log(a * 2)
}()) // 권장
```

## 호이스팅(Hoisting)
함수 선언부가 유효범위 최상단으로 끌어올려지는 현상
```javascript
const b = 7

double3();

function double3 () {
  console.log(b * 2)
}
```

## 타이머함수
- setTimeout(함수, 시간): 일정 시간 후 함수 실행
- setInterval(함수, 시간): 시간 간격마다 함수 실행
- clearTimeout(): 설정된 Timeout 함수를 종료
- clearInterval(): 설정된 Interval 함수를 종료
```javascript
const timer = setInterval(() => {
  console.log('hello')
}, 3000)

const h1El = document.querySelector('h1');
h1El.addEventListener('click', () => {
  clearInterval(timer)
})
```

## 콜백(Callback)
함수의 인수로 사용되는 함수 <br/>
실행위치를 보장하는 용도로 활용된다.<br/>
ex) setTimeout(함수, 시간)
```javascript
function timeout (callback) {
  setTimeout(() => {
    console.log('hi')
    callback()
  }, 3000)
}

timeout(() => {
  console.log('done')
})
```