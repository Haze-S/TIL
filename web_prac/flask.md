# 서버를 만들어보자!

## 서버란?

컴퓨터에 돌아가고 있는 하나의 프로그램
같은 컴퓨터에다 서버도 만들고, 요청도 해볼 예정이다.
즉, 클라이언트 = 서버
이것을 바로 "로컬 개발환경"이라고 한다.

<br/>

## Flask

Flask 프레임워크 : 서버를 구동시켜주는 편한 코드 모음.<br/>
서버를 구동하려면 필요한 복잡한 일들을 쉽게 가져다 쓸 수 있다.

### 프레임워크란?

남이 짜둔 규칙이나 틀 안에서 코딩을 자유롭게 한다.<br/>
통상적으로 하나의 프레임워크 안에서 로직을 짜는 것.<br/>
프레임워크를 사용할 때는 정해진 규칙을 따라야 한다.

### 라이브러리란?

코딩을 자유롭게 하다가 남이 만들어놓은 로직을 사용한다.<br/>
코딩을 하다가 100개든 1000개든 가져와 사용할 수 있다.<br/>
**localhost:5000**<br/>
내가 내 컴퓨터에서 서버를 돌리고 다른 브라우저를 열어서 접속을 할 수 있다.<br/> ~~컴퓨터 2대를 살 순 없으니..~~

5000 : 사이트에 접속 할 수 있는 '문'의 주소.

<br/>

### Flask 시작 코드

```
from flask import Flask
app = Flask(__name__)

@app.route('/')
def home():
   return '<button>나는 버튼이다</button>'


if __name__ == '__main__':
   app.run('0.0.0.0',port=5000,debug=True)
```

/static : CSS나 이미지파일을 담아둘 때 사용하는 것<br/>
/templates : html 파일들을 담아두는 폴더

<br/>

## 본격 API 만들기

### 들어가기 전에 GET, POST 리마인드

#### GET

- 통상적으로! 데이터 조회(Read)를 요청 할 때
- 예) 영화목록 조회
- 데이터 전달 : URL 뒤에 물음표를 붙여 key=value로 전달
- 예) google.com?q=북극곰

##### GET 요청 API코드

```
@app.route('/test', methods=['GET'])
def test_get():
   title_receive = request.args.get('title_give')
   print(title_receive)
   return jsonify({'result':'success', 'msg': '이 요청은 GET!'})
```

##### GET 요청 확인 Ajax코드

```
$.ajax({
    type: "GET",
    url: "/test?title_give=봄날은간다",
    data: {},
    success: function(response){
       console.log(response)
    }
  })
```

<br/>

#### POST

- 통상적으로! 데이터 생성(Create), 변경(Update), 삭제(Delete)요청 할 때
- 예) 회원가입, 회원탈퇴, 비밀번호 수정
- 데이터 전달: 바로 보이지 않는 HTML body에 key:value 형태로 전달

##### POST 요청 API코드

```
@app.route('/test', methods=['POST'])
def test_post():
   title_receive = request.form['title_give']
   print(title_receive)
   return jsonify({'result':'success', 'msg': '이 요청은 POST!'})
```

##### POST 요청 확인 Ajax코드

```
$.ajax({
    type: "POST",
    url: "/test",
    data: { title_give:'봄날은간다' },
    success: function(response){
       console.log(response)
    }
  })
```

API를 만들고 클라이언트에서 Ajax를 만들어 요청을 해보자.

고객이 Ajax로 콜을 해서 API로 처리를 해서 response 함.

항상 API에서 제공하는 이름과 Ajax에서 요청하는 이름은 같아야 한다.
안 그럼 에러남. 500

<br/>

# API 만들고 사용하기

1. 클라이언트와 서버 확인하기
2. 서버부터 만들기
3. 클라이언트 만들기
4. 완성 확인하기

<br/>

# API 설계하기

1. 서비스에서 어떤 기능들이 필요한 지<br/>
   어떤 데이터가 오고 가는지, 클라이언트에서 넘어오는 데이터들이 어떤 것인지 등
2. 요청 정보를 확인<br/>
   요청 URL, 요청 방식, 요청 데이터 등
3. 서버가 제공할 기능<br/>
   URL의 meta태그 정보를 바탕으로 스크래핑, DB에 정보 저장, DB에 저장된 정보 가져오기 등
4. 응답 데이터<br/>
   API가 정상적으로 작동하는지 클라이언트에게 성공메세지 보내기<br/>
   (JSON 형식) 'result'='sucess'<br/>
   브라우저에 나타날 정보들 붙이기<br/>
   (JSON 형식) 'article':아티클 정보

<br/>

# 조각 기능 구현하기

## URL에서 페이지 정보 가져오기(meta태그 스크래핑)

API에서 수행해야하는 작업 중 익숙하지 않는 것들은 따로 파일을 만들어 실행해보고 잘되면 코드를 붙여넣는 방식이 편하다.

<br/>

## meta 태그란?

HTML의 `<head></head>` 부분에 들어가는, 눈으로 보이는 것(body) 외에 사이트의 속성을 설명해주는 태그들<br/>
예) 구글 검색 시 표시될 설명문, 사이트 제목, 카톡 공유 시 표시 될 이미지 등

<br/>

## meta 태그 스크래핑 하기

meta태그를 스크래핑 할 때는 'meta[속성:속성값]'으로 가져온다.

```
import requests
from bs4 import BeautifulSoup

url = 'https://movie.naver.com/movie/bi/mi/basic.nhn?code=171539'

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(url,headers=headers)


soup = BeautifulSoup(data.text, 'html.parser')

title = soup.select_one('meta[property="og:title"]')['content']
image = soup.select_one('meta[property="og:image"]')['content']
description = soup.select_one('meta[property="og:description"]')['content']

print(title,image,description)
```
