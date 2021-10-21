# 1. 프로젝트 세팅

## flask 폴더 구조 만들기

- static
- templates
- venv
- app.py
  <br/>

오타에 유의하도록 한다.

# 2. DB 만들기(데이터 쌓기)

## 프로젝트에서 사용할 데이터 넣기(웹 스크래핑)

- init_db.py

```
import requests
from bs4 import BeautifulSoup

from pymongo import MongoClient

client = MongoClient('localhost', 27017)
db = client.dbsparta


# DB에 저장할 영화인들의 출처 url을 가져옵니다.
def get_urls():
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get('https://movie.naver.com/movie/sdb/rank/rpeople.nhn', headers=headers)

    soup = BeautifulSoup(data.text, 'html.parser')

    trs = soup.select('#old_content > table > tbody > tr')

    urls = []
    for tr in trs:
        a = tr.select_one('td.title > a')
        if a is not None:
            base_url = 'https://movie.naver.com/'
            url = base_url + a['href']
            urls.append(url)

    return urls


# 출처 url로부터 영화인들의 사진, 이름, 최근작 정보를 가져오고 mystar 콜렉션에 저장합니다.
def insert_star(url):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get(url, headers=headers)

    soup = BeautifulSoup(data.text, 'html.parser')

    name = soup.select_one('#content > div.article > div.mv_info_area > div.mv_info.character > h3 > a').text
    img_url = soup.select_one('#content > div.article > div.mv_info_area > div.poster > img')['src']
    recent_work = soup.select_one(
        '#content > div.article > div.mv_info_area > div.mv_info.character > dl > dd > a:nth-child(1)').text

    doc = {
        'name': name,
        'img_url': img_url,
        'recent': recent_work,
        'url': url,
        'like': 0
    }

    db.mystar.insert_one(doc)
    print('완료!', name)


# 기존 mystar 콜렉션을 삭제하고, 출처 url들을 가져온 후, 크롤링하여 DB에 저장합니다.
def insert_all():
    db.mystar.drop()  # mystar 콜렉션을 모두 지워줍니다.
    urls = get_urls()
    for url in urls:
        insert_star(url)


### 실행하기
insert_all()
```

# 3. 파일 준비하기

### 프로젝트에서 사용할 파일 준비

index.html, app.py, etc...

# 4. GET

## 1. 분석하기

- 만들 기능 : 영화인 정보를 카드로 보여주기(Read)
- 화면에 어떤 데이터가 어떤 부분에 보여지는지 분석하기<br/>
  영화인 이름, 이미지(src), 좋아요 개수, 최근 작품 내용
- html의 어떤 요소에 어떤 데이터가 보일 지 분석
  <br/>

## 2. API 만들고 사용하기 - 영화인 조회 API (Read → GET)

### 만들 API 정보<br/>

- 요청 URL : /api/list, 요청 방식 : GET, 요청 데이터 : 없음<br/>
- 서버가 제공할 기능 : 데이터베이스에 영화인 정보를 조회(Read)하고, 영화인 정보를 응답 데이터로 보냄<br/>
- 응답 데이터 : (JSON 형식) 'stars_list' = 영화인 정보 리스트

### 1) 서버와 클라이언트 연결 확인하기.

- 서버

```python
@app.route('/api/list', methods=['GET'])
def show_stars():
    sample_receive = request.args.get('sample_give')
    print(sample_receive)
    return jsonify({'msg': 'list 연결되었습니다!'})
```

- 클라이언트

```js
function showStar() {
  $.ajax({
    type: "GET",
    url: "/api/list?sample_give=샘플데이터",
    data: {},
    success: function (response) {
      alert(response["msg"]);
    },
  });
}
```

### 2) 서버부터 만들기

조건 없이 모든 정보를 보여줄 생각이니 서버가 받을 정보는 없다.<br/>
따라서 서버 로직은 다음 단계로 구성이 된다.

1. mystar 목록 전체를 검색한다. ID는 제외하고 like가 많은 순으로 정렬
2. 성공하면 success 메세지와 함께 stars_list 목록을 클라이언트에 전달

### 3) 클라이언트 만들기

클라이언트 로직 구성

1. #star_box의 내부 html 태그 모두 삭제
2. 서버에 1) GET 방식으로, 2) /api/list 라는 주소로 star_list를 요청
3. 서버가 돌려준 stars_list를 stars라는 변수에 저장
4. for문을 활용하여 stars 배열의 요소를 차례대로 조회
5. stars[i] 요소의 name, url, img_url, recent, like 키 값을 활용하여 값 조회
6. 영화인 카드 코드 만들어 #star-box에 붙이기

### 4) 동작 확인하기

# 5. POST

## 1. 좋아요 API (Update → POST)

### 만들 API 정보<br/>

- 좋아요 : 클라이언트에서 받은 이름(name_give)으로 찾아서 좋아요(like)를 증가<br/>
- 요청 URL : /api/like, 요청 방식 : POST, 요청 데이터 : 영화인 이름(name_give)<br/>
- 서버가 제공할 기능 : 영화인 이름(요청 데이터)과 일치하는 영화인 정보의 좋아요 수를 한 개 증가시켜 데이터베이스에 업데이트(Update)하고 성공했다고 응답 메세지를 보냄<br/>
- 응답 데이터 : (JSON 형식) 'msg'='좋아요 완료!'

### 1) 서버와 클라이언트 연결 확인하기

- 서버

```py
@app.route('/api/like', methods=['POST'])
def like_star():
    sample_receive = request.form['sample_give']
    print(sample_receive)
    return jsonify({'msg': 'like 연결되었습니다!'})
```

- 클라이언트

```js
function likeStar(name) {
  $.ajax({
    type: "POST",
    url: "/api/like",
    data: { sample_give: "샘플데이터" },
    success: function (response) {
      alert(response["msg"]);
    },
  });
}
```

### 2) 서버부터 만들기

영화인 카드의 좋아요 수를 증가시키기 위해 서버가 클라이언트에게 전달받아야하는 정보는 다음과 같다.

- 영화인의 이름 (name_give)<br/>

따라서 서버 로직은 다음 단계로 구성되어야 한다.

1. 클라이언트가 전달한 name_give를 name_receive 변수에 넣는다.
2. mystar 목록에서 find_one으로 name이 name_receive와 일치하는 star를 찾는다.
3. star의 like 에 1을 더해준 new_like 변수를 만든다.
4. mystar 목록에서 name이 name_receive인 문서의 like 를 new_like로 변경한다.

### 3) 클라이언트 만들기

클라이언트 로직 구성

1. 서버에<br/>
   POST 방식으로, <br/>
   /api/like 라는 url에, <br/>
   name_give라는 이름으로 name을 전달한다. <br/>
   (참고) POST 방식이므로 data: {'name_give': name} 사용
2. '좋아요 완료!' alert 창을 띄운다.
3. 변경된 정보를 반영하기 위해 새로고침한다.

### 4) 동작 확인하기

## 2. 카드 삭제 API (Delete → POST)

### 만들 API 정보<br/>

- 삭제 : 클라이언트에서 받은 이름(name_give)으로 영화인을 찾고, 해당 영화인을 삭제<br/>
- 요청 URL : /api/delete, 요청 방식 : POST, 요청 데이터 : 영화인 이름(name_give)<br/>
- 서버가 제공할 기능 : 영화인 이름(요청 데이터)와 일치하는 영화인 정보를 데이터베이스에서 삭제(Delete)하고, 성공했다고 응답 메세지를 보냄 <br/>
- 응답 데이터 : (JSON 형식) 'msg'='삭제 완료!'

### 1) 서버와 클라이언트 연결 확인하기

- 서버

```py
@app.route('/api/delete', methods=['POST'])
def delete_star():
    name_receive = request.form['name_give']
    db.mystar.delete_one({'name': name_receive})
    return jsonify({'msg': '삭제 완료!'})
```

- 클라이언트

```js
function deleteStar(name) {
  $.ajax({
    type: "POST",
    url: "/api/delete",
    data: { sample_give: "샘플데이터" },
    success: function (response) {
      alert(response["msg"]);
    },
  });
}
```

### 2) 서버부터 만들기

영화인 카드를 삭제하기 위해 필요한 정보는 다음과 같다.

- 영화인의 이름 (name_give)

따라서 서버 로직은 다음 단계로 구성되어야 한다.

1. 클라이언트가 전달한 name_give를 name_receive 변수에 넣기
2. mystar 에서 delete_one으로 name이 name_receive와 일치하는 star를 제거
3. 성공하면 success 메시지를 반환

### 3) 클라이언트 만들기

클라이언트 로직 구성

1. 서버에 <br/>
   POST 방식으로, <br/>
   /api/delete 라는 url에, <br/>
   name_give라는 이름으로 name을 전달<br/>
   (참고) POST 방식이므로 data: {'name_give': name}
2. '삭제 완료! 안녕!' alert창 띄우기
3. 변경된 정보를 반영하기 위해 새로고침

### 4) 동작 확인하기
