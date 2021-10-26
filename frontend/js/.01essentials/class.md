# 클래스

## 생성자 함수(prototype)
```javascript
function User(first, last){ // 리터럴 {}, [], " " 등
  this.firstName = first
  this.lastName = last
} 

User.prototype.getFullName = function () {
  return `${this.firstName} ${this.lastName}`
} // 통일화, 인스턴스가 참조함

// 인스턴스들
const haze = new User('haze', 'song')
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith')

console.log(haze)
console.log(amy.getFullName())
console.log(neo.getFullName())
```
```javascript
const a = [1, 2, 3]
// ()안의 데이터가 속해있는지 확인하는 메소드
a.includes(2) // true
a.includes(4) // false
```

## this
- 일반(Normal) 함수는 호출 위치에 따라 this 정의
- 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의
```javascript
const haze = {
  name: 'Haze',
  normal() { // function
    console.log(this.name)
  }, // Haze
  arrow: () => {
    console.log(this.name)
  } // undefined
}
haze.normal()
haze.arrow()

const amy = {
  name: 'Amy',
  normal: haze.normal, // Amy
  arrow: haze.arrow // undefined
  // 호출 X, 할당
}
amy.normal();
amy.arrow();
```
```javascript
function User(name){
  this.name = name
} 

User.prototype.normal = function () {
  console.log(this.name)
} 

User.prototype.arrow = () => {
  console.log(this.name)
} 

const haze = new User('Haze')

haze.normal() // Haze
haze.arrow() // undefined
```
```javascript
const timer = {
  name: 'Haze!',
  timeout: function() {
    setTimeout(() => {
      console.log(this.name)
    }, 1000)
  }
}
timer.timeout() // Haze!
```

## ES6 Classes
```javascript
// function User(first, last){ 
//   this.firstName = first
//   this.lastName = last
// } 

// User.prototype.getFullName = function () {
//   return `${this.firstName} ${this.lastName}`
// } 

class User {
  constructor(first, last) { // function
    this.firstName = first
    this.lastName = last
  }
  getFullName() {
    return `${this.firstName} ${this.lastName}`
  }
}

const haze = new User('haze', 'song')
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith')

console.log(haze)
console.log(amy.getFullName())
console.log(neo.getFullName())
```

## 상속(확장)
```javascript
class Vehicle {
  constructor(name, wheel) {
    this.name = name
    this.wheel = wheel
  }
}
const myVehicle = new Vehicle('운송수단', 2)
console.log(myVehicle) // Vehicle {name: '운송수단', wheel: 2}

class Bicycle extends Vehicle { // extends 확장(상속)
  constructor(name, wheel) {
    super(name, wheel) // super = 상속을 해주는 클래스
  }
}
const myBicycle = new Bicycle('삼천리', 2)
const daughtersBicycle = new Bicycle('세 발', 3)
console.log(myBicycle) // Bicycle {name: '삼천리', wheel: 2}
console.log(daughtersBicycle) // Bicycle {name: '세 발', wheel: 3}

class Car extends Vehicle {
  constructor(name, wheel, license){
    super(name, wheel)
    this.license = license // 확장
  }
}
const myCar = new Car('벤츠', 4, true)
const daughtersCar = new Car('포르쉐', 4, false)

console.log(myCar) // Car {name: '벤츠', wheel: 4, license: true}
console.log(daughtersCar) // Car {name: '포르쉐', wheel: 4, license: false}
```