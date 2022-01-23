# 🌱 ECOding 

<div align="center">💡인하대학교 슈퍼챌린지 해커톤💡</div>
<div align="center"> 2022.01.14 ~ 2022.01.23 </div>

<br>

## 👬 팀 소개
---------
**ECOding : ECO + coding을 합쳐 환경을 생각하며 코딩하겠다는 뜻**

<br>

### 팀원 소개
이름|학번|학과|역할
---|---|---|---|
이예담|12191803|정보통신공학과|팀장<br>AI팀 : 회의자료 관리, 데이터셋, 코드 서칭, 라벨링<br>ppt 제작, 앱디자인
이두열|12151595|정보통신공학과|AI팀 : 데이터셋, 코드 서칭, 라벨링, 모델 훈련<br>ppt 제작
남수진|12191754|정보통신공학과|AI팀 : 데이터셋, 코드 서칭, 라벨링, 코드 주석 달기<br>Front-end팀 : php로 서버연동, 레이아웃 수정, 인트로 화면/메인 화면/상점 기능 구현<br>README.MD 파일 작성
김민겸|12201863|정보통신공학과|앱개발 팀장 : 앱팀 엔지니어링 위키, 회의록 관리<br>Back-end팀 : ERD 설계, Member와 Board API설계, Github code flow 관리<br>ppt 제작, README.MD 파일 작성
윤효정|12171662|컴퓨터공학과|Back-end팀 : Comments API 설계 Naver Cloud 서버 생성 및 관리<br>README.MD 파일 작성
이슬|12201931|컴퓨터공학과|Front-end팀 : 로그인&회원가입 / 카메라 기능 구현, 딥러닝 모델 연결, 분리수거 리스트/ 북마크 / 마이페이지 / 내가 쓴 글 activity 및 layout 구현<br>ppt 제작
김민서|12171729|컴퓨터공학과|Front-end팀 : 로그인&회원가입 / 메뉴바 기능 구현, QnA 게시판 구현

### 협업 방법
- Allo : 아이디어 회의
- 노션 : 웹개발 팀 회의록 기록, 엔지니어링 위키, 조사 자료 공유
- 구글 ppt : AI팀 데이터셋, 코드 자료 공유 및 분석, comment 작성
- github : code 공유, 협업

<br>

## 💡 제작 배경
------------
1. 코로나 19로 인해 증가한 쓰레기
    - 코로나 19가 지속되면서 배달 증가로 인한 일회용기 사용이 증가하였지만, 분리배출이 제대로 되지 않아 50% 이상이 소각된다.
2. 분리수거 기준의 변화
    - 지역별로 분리수거 방법이 다르다.
    - '단독 주택 투명 페트병 분리수거 법령'과 같이 법이 계속하여 바뀌어 간다.
3. 헷갈리는 분리수거
    - ex) 종이팩과 종이류 구분 / 음식물 쓰레기 구분 / 복합 재질 쓰레기
4. 분리배출을 해도 재활용이 안되는 경우
    - 이물질을 제거하지 않은 일회용기는 재활용이 되지 않으므로 일반쓰레기로 분류해야 한다.

<br>

## 💡 아이템 소개
------------
<img width = "250" src = "https://user-images.githubusercontent.com/77006790/150676458-02b28c43-ca9b-4455-be96-bd6595abd651.png" >

**에코 버디**
------

### : 환경 보호를 위해 물건/ 쓰레기를 분류하여 사용자의 분리수거/ 재활용을 도와주는 어플

1. 물체 인식 딥러닝을 이용하여 쓰레기의 종류를 인식한다.
2. 헷갈리는 쓰레기 이미즈를 전부 딥러닝을 통해 학습하여 분리수거 가이드를 함께 제공한다.
3. 북마크, 게시판, QnA, 대형 폐기물 처리 가이드 등의 서비스를 제공한다.
4. 마일리지 시스템을 통해 업사이클링 제품 구매가 가능하도록 한다.

<br>

## 📱 기능
------
* 회원 가입, 로그인

* 촬영 - 쓰레기 코멘트
    - 물건을 촬영할 시, 학습시킨 모델이 object detection을 통해 감지하고 감지된 class에 대한 코멘트 출력 
* 분리수거 가이드
    - 각종 쓰레기에 대한 분리수거 가이드를 리스트로 보여줌
* QnA 게시판, 사용자 북마크 기능
    - 사용자 간의 질문/답변이 가능한 질문 게시판,  원하는 게시글을 북마크 가능
* 마일리지 + 상점
    - 처음 사진 촬영시에 마일리지 적립, 적립된 마일리지로 업사이클링 상점에서 상품 구매 가능
* 마이페이지 
    - 북마크 글, 내가 쓴 글, 마일리지, 개인 정보등을 확인할 수 있음

<br>

## 📱 어플 구현 사진
------

![image](https://user-images.githubusercontent.com/77006790/150676234-dc1d73f7-2077-4bc6-82e0-b169702d865f.png)

![image](https://user-images.githubusercontent.com/77006790/150676223-35b7d916-78c3-41fb-9669-669cb3e21f1a.png)

![image](https://user-images.githubusercontent.com/77006790/150676203-0b5b4cb5-7a95-4104-9d28-ce1fc814f553.png)

<br>

## ✨ 기대 효과 및 향후 발전 계획
--------
1. GPS 기능을 통해 지역별 분리수거 기준에 맞게 자동 코멘트를 보여준다.
2. 학습 모델을 변경하여 분리수거 기준을 커스틈 가능하도록 한다.
3. 사용자를 통해 쓰레기 데이터 베이스를 축적한다.
4. 마일리지 시스템을 통해 분리수거를 촉진하고 업사이클링 스타트업을 지원한다.
5. 어린이를 위한 분리수거 교육 시스템 메뉴얼을 제작한다.
6. MZ세대 에코 워리어를 위한 커뮤니티를 제작한다.
7. 재활용이 되지 않는 물건을 재사용할 수 있도록 도와주는 서비스를 홍보한다.
8. 아파트 단지에 사용하여 실시간 쓰레기 분류 카메라 기능을 지원할 수 있다.

<br>

## ✨ 수익 구조
---------
### 홍보
1. '마일리지', '업사이클링 제품'을 키워드로 교내 재학생 대상으로 어플 홍보
2. SNS를 통해 MZ 세대 에코 워리어를 대상으로 홍보
3. 아파트 단지에 설치하여 주부, 어린이를 대상으로 홍보

### 수익구조
1. 사용자 맞춤 광고(업사이클링 제품, 에코 프렌들리 제품) 노출 및 클릭으로 인한 수익
2. 친환경 제품 제작 업체의 홍보비
3. 환경부 홍보 및 지원 추진

<br>

## 🔎 AI, Deaplearning
--------
<img width = "700" src = "https://github.com/ultralytics/yolov5/releases/download/v1.0/model_comparison.png">

### 딥러닝 모델 : yolov5 object to detection
### reference 모델 : https://github.com/manaporkun/Trash-Filter-YOLOV5

<br>

### Dataset
    - AI 허브에 생활폐기물 이미지 데이터 750,000장 사용
    - 계란 쓰레기, 음식물 쓰레기 등을 Augmentation을 적용하여 추가로 class를 생성하여 데이터 추가
    - class : 'egg', 'shell', 'food', 'can', 'lamp', 'glass', 'styrofoam', 'wrap', 'plastic', 'pet', 'toy', 'paper', 'carton', 'clothes', 'ceramic', 'metal' 

- Transfer learning을 통해 pre-trained weight-yolov5x를 사용하여, tresh custom Dataset을 이틀동안 학습시팀.
- 학습시킨 yolov5 모델을 tensorflow lite로 변환




<br>

## 🔎 Front-End Architecture
-------
<img width="700" alt="image1" src="https://user-images.githubusercontent.com/77006790/150667230-07d35470-f9f6-4352-8be2-6c365b052639.PNG">

- 안드로이드 스튜디오 내에서 자바 언어를 사용하여 Activity들을 구현하고, xml 파일들을 작성하여 어플의 레이아웃 구성

### Project
    - app : source code, resource file, manifests을 담을 수 있는 컨테이너를 제공한다.  
        - manifests : Android 시스템이 앱의 코드를 실행하기 전에 알아야할 필수 정보를 시스템에 알려준다.
            - AndroidManifest.xml : package 선언, 권한 정의, 구성요소 선언
    
        - java : 기능을 구현할 코드들이 들어있는 클래스를 관리하는 컨테이너이다. 
            - IntroActivity : 인트로 페이지 구현  
            - LoginActivity : 로그인 기능 구현, LoginRequest(php 파일로 로그인 데이터 전달 후 데이터를 받음)
            - RegisterActivity : 회원가입 기능 구현, RegisterRequest(php 파일로 회원가입 데이터 전달 후 데이터를 받음) 
            - MainActivity : 메인 화면 구현, 어플에 대한 설명 페이지
            - MediaScanner : 이미지 저장 후 미디어 스캐닝을 수행할 때 필요한 utils
            - CameraActivity : 카메라 기능 구현, 사진 촬영 후 저장, 저장한 사진에 object detetion 모델 기능 구현
            - CategoryActivity : 분리수거 카테고리 리스트 구현
            - ListActivity : 분리수거 QnA 게시판 구현
            - DetailActivity : 분리수거 QnA 글 내용을 보여주도록 구현
            - WriteActivity : 글쓰기 페이지 구현
            - StoreActivity : 업사이클링 상점 페이지 구현
            - MyRecycleAdapter : Recyclerview adapter
            - MyAcitivity : 마이페이지 구현
            - BookmarkActivity : 분리수거 카테고리 북마크 기능 구현
            - MyWritingAcitivy : 내가 쓴 글을 보여주는 페이지 구현
        
        - res : 코드가 아닌 모든 리소스(UI)를 담고 있다.
            - drawble : image 폴더
            - font : tmoneyroundwindregular.ttf 폰트 구현
            - layout
                - acitivty_ ... : 각각의 activity에 대한 layout 구현
                - activity_drawer : 네비게이션 드로어 layout 구현
                - row_recyclerview : 리사이클러뷰에서 각각의 item layout 구현

    - Gradle Script: 어플레케이션 빌드에 사용하는 Gradle 툴을 편리하게 사용할 수 잇도록 도와주는 스크립트이다.

<br>

## 🔎 PHP Architecture
------
<img width="700" alt="image2" src="https://user-images.githubusercontent.com/77006790/150667601-37d2d1e2-479c-44cd-b611-1b6e0da1a7c8.png">

* android studio의 보안 문제로 frontend는 데이터베이스에 직접 연결이 불가하다. 따라서 php 프로그램을 매개로 데이터베이스에 연결한다.   

### php 파일

    - login.php : login, password 조건에 따른 select query를 이용한 회원 조회
    - register.php : insert query를 이용한 회원 정보 저장
    - reg_board.php : insert query 이용한 게시글 저장
    - sel_board.php : %title% 조건에 따른 select query를 이용한 게시글 조회
    - del_board.php : id(PK)조건에 따른 delete query를 이용한 게시글 삭제
    - upd_board.php : id(PK)조건에 따른 update query를 이용한 게시글 수정
    - reg_comment.php : insert query를 이용한 댓글 저장
    - del_comment.php : id(PK)조건에 따른 delete query를 이용한 댓글 삭제

<br>

## 🔎 Back-End Architecture
--------
<img width="700" alt="Untitled2" src="https://user-images.githubusercontent.com/63863627/150649526-3f0ead2d-04d4-4031-96f6-4cbe449e5a15.png">

* RestController : Client의 요청을 처리하고 JSON 형태로 데이터를 반환한다.
* Service : 비즈니스 로직을 수행한다.
* Repository(JPA) : DB에 접근하기 위한 인터페이스이다.

<br>

 **마일리지 기능 구현 과정**

> Member Domain에 0으로 초기화되는 필드인 mileage를 넣었으며, 별도의 생성자 초기화는 이루어지지 않았습니다.
> 

```java
// 회원의 마일리지 증가
    @GetMapping("/mileage")
    public Integer addMileage(@RequestParam Long id){
        return memberService.addMileage(id);
    }
```

> 이렇게 컨트롤러에 member/mileage 를 매핑해,  Service 내부의 addMileage를 호출합니다.

```java
@Override
    public Integer addMileage(Long id){
        Member member = memberRepository.findById(id).get();
        member.setMileage(member.getMileage() + 1);
        return member.getMileage();
    }
```

> 그리고 Service단에서 이렇게 member의 Mileage에 접근해 1을 증가시키는 코드를 작성하여 구현했습니다.

<br>

 **북마크 기능 구현**

> Member 테이블에서  bookMark에 대한 기능을 추가하였습니다. 이에 따라 BoardService에서 특정 버튼을 눌렀을 때 현재 유저에 대해 해당 게시글의 Id가 List에 저장되도록 구현하기 위해 다음 코드를 설계하였습니다.
> 

```java
// BoardController.java
@GetMapping("bookMark")
    public void bookMarkingBoard(@RequestParam Long boardId, @RequestBody Long memberId){
        boardService.addBookMark(boardId, memberId);
    }

// BoardServiceImpl.java
@Override
    public void addBookMark(Long boardId, Long memberId) {
        Optional<Member> member = memberRepository.findById(memberId);
        member.get().getBookMarkId().add(boardId);
    }
```

<br>

## 📑 ERD
----------
![image](https://user-images.githubusercontent.com/67851124/150649138-0caf16e9-30f7-4909-b041-e813489f1962.png)

### Member Table

    질문 게시글 생성, 북마크, 마일리지 기능의 사용 권한이 있는 App 사용자를 관리하기 위한 API

Field|Type|Null|Key|Default|Extra
---|---|---|---|---|---
id|bigint(20)|NO|PRI|NULL|
password|varchar(255)|NO||NULL|
name|varchar(255)|YES||NULL|
nickname|varchar(255)|YES||NULL|
mileage|int(11)|YES||NULL|

### Board Table

    해당 서비스에서는 총 두가지의 게시판을 제공한다.        
        1. 첫 번째는 분리수거 가이드를 제시하는 게시판이고, 두 번째는 질문글을 올리는 질문 게시판이다.         
        2. 후자의 경우 사용자가 자유롭게 CRUD를 수행할 수 있어 동적인 성격을 띄므로, 이러한 게시판을 관리할 수 있는 API를 생성하였다. 

Field|Type|Null|Key|Default|Extra
---|---|---|---|---|---
id|bigint(20)|NO|PRI|NULL|
title|varchar(255)|YES||NULL|
contents|varchar(255)|YES||NULL|
writer|bigint(20)|NO|MUL|NULL|
created_at|datetime(6)|YES||NULL|
updated_at|datetime(6)|YES||NULL|



### Comment Table

    현재 게시글의 id와 댓글을 작성하는 작성자의 id를 FK로 지니고 있는 댓글 관련 API이다. 질문 게시판의 댓글로 참조되고 있으며, Board와 동일한 Flow로 CRUD가 가능하다.

Field|Type|Null|Key|Default|Extra
---|---|---|---|---|---
id|bigint(20)|NO|PRI|NULL|
contents|varchar(255)|YES||NULL|
created_at|datetime(6)|YES||NULL|
updated_at|datetime(6)|YES||NULL|
writer|bigint(20)|NO|MUL|NULL|
board|bigint(20)|NO|MUL|NULL|


<br>

## 🛠 개발 환경
-------
<img width="800" alt="Untitled 22(1)" src="https://user-images.githubusercontent.com/63863627/150652239-db62a14a-c1fe-4325-a81d-62bfb1c2aa19.png">

