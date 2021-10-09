# Query String
주소?속성=값&속성=값%속성=값

## axios
- js 특정 객체 Promise 기반의 HTTP 요청을 처리해주는 js 패키지
- 브라우저, node.js에서 사용 가능하다.

### 설치
```bash
$ npm i axios
```
```json
{
  "dependencies": {
    "axios": "^0.24.0"
  }
}
```

### OMDb API
- 영화 정보 데이터를 받아서 사용할 수 있는 API

[OMDb](http://www.omdbapi.com/)

### 활용
```js
import axios from 'axios'

function fetchMovies() {
  axios
    // 메소드 체이닝
    .get('https://www.omdbapi.com/?apikey=고유키&s=영화제목') // 데이터 요청
    .then(res => { // 요청한 데이터 활용
      console.log(res) // 해당 영화의 데이터가 출력됨
      const h1El = document.querySelector('h1')
      const imgEl = document.querySelector('img')
      h1El.textContent = res.data.Search[0].Title
      imgEl.src = rex.daga.Search[0].Poster
    })
}
fetchMovies()
```
