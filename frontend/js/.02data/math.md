# 수학(Math)
수학적인 상수와 함수를 위한 속성과 메서드를 가진 **내장 객체**

## methods
### Math.abs()
- abs : absolute의 약어
- 주어진 숫자의 절대값을 반환한다.
```js
console.log('abs: ', Math.abs(-12)) // abs: 12
```

### Math.min()
- 주어진 숫자들 중 가장 작은 값을 반환
```js
console.log('min: ', Math.min(2, 8)) // min: 2
```

### Math.max()
- 입력값으로 받은 0개 이상의 숫자 중 가장 큰 숫자를 반환
```js
console.log('max: ', Math.max(2, 8)) // max: 8
```

### Math.ceil()
- 주어진 숫자보다 크거나 같은 숫자 중 가장 작은 숫자를 integer 로 반환
- 정수 기준으로 수의 올림 처리를 한다.
```js
console.log('ceil: ', Math.ceil(3.14)) // ceil: 4
```

### Math.floor()
- 주어진 숫자와 같거나 작은 정수 중에서 가장 큰 수를 반환
- 수의 내림 처리를 한다.
```js
console.log('floor: ', Math.floor(3.14)) // floor: 3
```

### Math.round()
- asingle precision 포맷으로 표현할 수 있는 실수들 중에서 가장 가까운 숫자를 리턴
- 정수를 기준으로 수의 반올림 처리를 한다.
```js
console.log('round: ', Math.round(3.14)) // round: 3
console.log('round: ', Math.round(3.6)) // round: 4
```

### Math.random()
- 0 이상 1 미만의 구간에서 근사적으로 균일한(approximately uniform) 부동소숫점 의사**난수**를 반환
- 사용자가 원하는 범위로 변형할 수 있다.
- 난수 생성 알고리즘에 사용되는 초기값은 구현체가 선택하며, 사용자가 선택하거나 초기화할 수 없다
```js
console.log('random: ', Math.random()) // random: 0.랜덤값
```
```js
console.log(Math.floor(Math.random() * 10)) // 0~9까지의 랜덤값 반환
```