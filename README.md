
## 🔎 Back-End Architecture
<img width="700" alt="Untitled2" src="https://user-images.githubusercontent.com/63863627/150649526-3f0ead2d-04d4-4031-96f6-4cbe449e5a15.png">

* RestController : Client의 요청을 처리하고 JSON 형태로 데이터를 반환한다.
* Service : 비즈니스 로직을 수행한다.
* Repository(JPA) : DB에 접근하기 위한 인터페이스이다.

<br>

## 📑 ERD
![image](https://user-images.githubusercontent.com/67851124/150649138-0caf16e9-30f7-4909-b041-e813489f1962.png)

### Member 

:  질문 게시글 생성, 북마크, 마일리지 기능의 사용 권한이 있는 App 사용자를 관리하기 위한 API

>   - id
>   - name
>   - nickname
>   - password


### Board

: 해당 서비스에서는 총 두가지의 게시판을 제공한다. 첫 번째는 분리수거 가이드를 제시하는 게시판이고, 두 번째는 질문글을 올리는 질문 게시판이다. 후자의 경우 사용자가 자유롭게 CRUD를 수행할 수 있어 동적인 성격을 띄므로, 이러한 게시판을 관리할 수 있는 API를 생성하였다. 
    
    
>    - id
>    - title
>    - contents
>    - writer
>    - comments
>    - hit
>    - created
>    - updated



### Comments

:  현재 게시글의 id와 댓글을 작성하는 작성자의 id를 FK로 지니고 있는 댓글 관련 API이다. 질문 게시판의 댓글로 참조되고 있으며, Board와 동일한 Flow로 CRUD가 가능하다.

>    - id
>    - contents
>    - board
>    - writer
>    - created
>    - updated

<br>

## 🛠 개발 환경
<img width="800" alt="Untitled 22(1)" src="https://user-images.githubusercontent.com/63863627/150652239-db62a14a-c1fe-4325-a81d-62bfb1c2aa19.png">


## 👀추가적인 기능 구현

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



## 🎇Back-End 팀 역할 배분

👩‍💻 김민겸
- ERD 설계
- Member와 Board API 설계
- 앱 팀 엔지니어링 위키, 회의록 관리 (노션 : https://elite-daughter-e3d.notion.site/e0189add6cb34e10b02f37762709688b?v=b98091c2fa0243f689991543805e760d )
- GitHub Code Flow 관리


👩‍💻 윤효정
- Comments API 설계
- Naver Cloud 서버 생성 및 관리

