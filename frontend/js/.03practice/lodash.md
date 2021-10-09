# lodash
[lodash](https://lodash.com/docs/4.17.15#cloneDeep)
```js
import _ from 'lodash'
```

## methods
### _.uniq([])
- 배열 데이터에서 나오는 중복되는 값들을 제거하고 고유한 아이템들만 남겨놓는다.

#### _.uniqBy(중복된 데이터가 있는 배열, 중복을 구분할 고유한 속성)
```js
const usersA = [
  { userId: '1', name: 'Haze' },
  { userId: '2', name: 'Neo' }
]
const usersB = [
  { userId: '1', name: 'Haze' },
  { userId: '3', name: 'Amy' }
]
const usersC = usersA.concat(usersB) // usersA와 usersB를 합쳐서 usersC로 반환
console.log('concat', usersC) // (4) [{...}, {...}, {...}, {...}] 
// 중복 데이터가 있다.
console.log('uniqBy', _.uniqBy(usersC, 'userId')) // (3) [{...}, {...}, {...}]
// 중복이 없다. 배열이 하나일 때 사용
```

#### _.unionBy(배열1, 배열2, 중복을 구분할 고유한 속성)
중복이 발생할 수 있는 배열이 합치기 전에 사용
```js
const usersD = _.unionBy(usersA, usersB, 'userId')
console.log('unionBy', usersD) // (3) [{...}, {...}, {...}]
// 중복이 없다. 배열이 여러개 일 때 사용
```

### find & remove
#### _.find
- 배열 데이터에서 기준에 맞게 찾는다.
- 배열 안의 많은 데이터를 사이에서 특정한 데이터를 찾을 때 유용하게 사용할 수 있다.
```js
const users = [
  { userId: '1', name: 'Haze' },
  { userId: '2', name: 'Neo' },
  { userId: '3', name: 'Amy' },
  { userId: '4', name: 'Evan' },
  { userId: '5', name: 'Lewis' }
]
const foundUser = _.find(users, { name: 'Amy' })
console.log(foundUser) // { userId: '3', name: 'Amy' }
```
#### _.findIndex
- find와 같은 형태이나 찾는 데이터의 인덱스를 찾아준다.
```js
const foundUserIndex = _.findIndex(users, { name: 'Amy' })
console.log(foundUserIndex) // 2
```
#### _.remove
- 배열 안의 특정 데이터를 삭제한다.
```js
_.remove(users, { name: 'Haze' })
console.log(users) // (4) [{...}, {...}, {...}, {...}]
```