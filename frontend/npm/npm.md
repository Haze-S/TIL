# npm
NPM(Node Package Manager)은 전 세계의 개발자들이 만든 다양한 기능(패키지, 모듈)들을 관리.<br/>

- npm으로 패키지 관리를 하는 명령어
```
$ npm init -y
```
실행하면 package.json이 생성된다.
```json
{
  "name": "test",
  "version": "1.0.0",
  "description": "",
  "main": "index.js", 
  "scripts": {
    "dev": "parcel index.html",
    "build": "parcel build index.html"
  },
  "keywords": [],
  "author": "",
  "license": "ISC"
  }
}
```

- 설치 명령어
```
$ npm install parcel-bundler -D
```
- parcel-bundler는 패키지의 이름으로 원하는 패키지를 누르면 된다.
- -D는 dev를 뜻하며 개발용 의존성 패키지를 설치한다는 뜻이다. (-D, --save-dev)
- 설치하면 .cache와 dist, node_modules 폴더가 만들어지며, 그 안에 설치한 패키지 외의 다른 패키지들도 들어있다.
- package.json에 설치 내역이 추가된다.
```json
{
  "name": "test",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "dev": "parcel index.html",
    "build": "parcel build index.html"
  },
  "keywords": [],
  "author": "",
  "license": "ISC",
  "devDependencies": {
    "parcel-bundler": "^1.12.5"
  }
}
```
## 개발 서버 실행
개발 서버를 실행하기 위해서는 package.json 파일의 scripts에 명령어를 추가해야 한다.
```json
"scripts": {
    "dev": "parcel index.html",
    "build": "parcel build index.html"
  },
```
명령어 실행
```bash
$ npm run dev
```
- 명령어를 실행하면 localhost 주소가 생성된다.
- 단순히 개발 용도의 로컬 서버이며, 사용자들이 보는 용도의 명령은 build를 사용한다.
```bash
$ npm run build
```
dist 폴더에 파일이 생성되며 기존에 작성한 파일의 압축형(난독화 된 코드)이 생성된다.