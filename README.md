# SUM SUM
프로젝트명 : SUM SUM 

# 프로젝트 소개   

자신의 이상형에 맞는 사람을 선택하여 호감을 전할 수 있는 매칭 플랫폼
 썸썸만의 기능
 이상형 설문조사를작성하고, 프로필 사진을 올려 자신의 정체성을 나타낸다.
 상대방의 다양한 정보를 보고, 마음에 드는 상대에게 쪽지를 보낸다.
 썸썸 커뮤니티 게시판을 통해 일상공유, 고민공유, 자신을 어필 할 수 있는 서비스.

![image](https://github.com/kovengerss/SumSum/assets/34277606/2092a295-0959-45f7-bfe0-7a6979c4dc4f)
![image](https://github.com/kovengerss/SumSum/assets/34277606/1d7de255-2d48-4082-94ff-f46f37c5da50)



## 👤 이재원(팀장) 맡은 역할 : Business Tier

# [Front-end]
### 메인페이지
### 마이페이지(글 목록)
### 댓글 목록
### 관리자 페이지

# [Back-end]

### 아이디 찾기 & 비밀번호 찾기 기능 구현
### 전체 이용자 수 기능 구현

### 결제 API
#### - 결제 내역
  
### 인증 API
#### - 휴대폰 번호 인증
#### - 이메일 인증

[아임포트, webSocket]

‘IMP.request_pay()’ 함수의 ‘param’ 파라미터에는 결제에 필요한 정보들을 설정했습니다.
함수를 호출하여 결제 창을 띄우고, 결제에 필요한 파라미터를 전달합니다. 이 함수는 콜백
함수를 인자로 받으며, 결제 완료 여부에 따라 콜백 함수가 실행됩니다.
결제 요청에 대한 응답을 받은 후 서버와의 통신을 Ajax를 사용하여 데이터를 전송하고,
결제 성공 또는 실패에 따라 적절한 알림창이 띄워지도록 구현했습니다.


🎈프로젝트 전체적인 타임라인 <br>
|일자|내용|구체적인 활동|
|:---------:|:--------:|:-------:|
|6월 8일 ~ 6월 10일|주제 선정|주제 선정|
|6월 10일 ~ 6월 12일|설계|메뉴트리 작성, ERD 설계|
|6월 12일 ~ 6월 18일|설계, Front 작업|프론트엔드 역할 분담 및 프론트 작업|
|6월 19일 ~ 6월 20일|설계|백엔드 사전 설계 작업|
|6월 21일 ~ 7월 6일|Back 작업|백엔드 역할 분담 및 백 작업|


## 📚 기술스택
<div>
	<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat&logo=Spring Boot&logoColor=white" />
  <img src="https://img.shields.io/badge/html5-%23E34F26.svg?style=flat&logo=html5&logoColor=white"/></a> &nbsp
  <img src="https://img.shields.io/badge/css-1572B6?style=flat-square&logo=css3&logoColor=white"/></a>&nbsp 
  <img src="https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E"/></a> &nbsp
  <img src="https://img.shields.io/badge/jquery-0769AD?style=flat&logo=jquery&logoColor=white"></a> &nbsp
   <img src="https://img.shields.io/badge/JSON-000000?style=flat-square&logo=JSON&logoColor=white"/></a>&nbsp 
  <img src="https://img.shields.io/badge/oracle-F80000?style=flat&logo=oracle&logoColor=white"></a>&nbsp 
</div>

## ⚙️ 협업 Tools
<div>
  <img src="https://img.shields.io/badge/github-181717.svg?style=flat&logo=github&logoColor=white"></a>&nbsp 
  <img src="https://img.shields.io/badge/git-F05032.svg?style=flat&logo=git&logoColor=white"></a>&nbsp 
  <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=flat&logo=intellij-idea&logoColor=white"/></a>&nbsp 
  <img src="https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=flat&logo=visual-studio-code&logoColor=white"></a>&nbsp 
  <img src="https://img.shields.io/badge/Sourcetree-0052CC.svg?style=flat&logo=Sourcetree&logoColor=white"></a>&nbsp 
</div>

## 💡 주요기능
### 일반 회원
### 1. 회원가입
### 2. 유저 로그인/ 로그아웃
### 3. 이상형 설문조사
### 4. 사진 업로드
### 5. 실시간 사이트 이용자 수
### 6. 포인트 충전(결제 금액 선택 -> 결제 수단 선택 -> 결제 진행하기)
### 7. 이상형 매칭 상대에게 쪽지 보내기
### 8. 선택한 이상형 상세정보 보기
### 9. 게시글 ,댓글 작성 / 수정 / 삭제
### 10. 쪽지 보내기
### 11. 신고하기


### 관리자
### 1. 관리자 로그인/ 로그아웃
### 2. 사이트 내 게시글 검색기능
### 3. 유저 탈퇴 / 게시글 삭제
### 4. 회원 상세보기


## 🧱 ERD
![image](https://github.com/kovengerss/SumSum/assets/34277606/9a1652fc-af3c-4e94-8c50-3bdd1d0a56f1)

## Query
![image](https://github.com/kovengerss/SumSum/assets/34277606/e9b6a3c9-ac95-498a-b49c-61e40dc15fa3)
