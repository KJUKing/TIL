# HTTP 헤더

## 1. 일반헤더

  *헤더 분류
    -General 헤더: 메세지 전체에 적용되는 정보 Connnection: close
    -Request 헤더: 요청 정보 User-Agent: Mozilla/5.0
    -Response 헤더: 응답 정보 Server: Apache
    -Entity 헤더(RFC2616 과거) : 엔티티 바디 정보 Content-Type: text/html, Content-Length: 3423
      =엔티티 헤더는 엔티티 본문의 데이터를 해석할 수 있는 정보 제공 ex) 데이터유형(html, json), 데이터길이, 압축 정보


## 2. 표현 Representation
  Representation 헤더(RFC7230 현재) : 표현은 요청이나 응답에서 전달할 실제 데이터
  표현 헤더는 표현 데이터를 해석할 수 있는 정보 제공 ex) 데이터유형(html, json), 데이터길이, 압축 정보

  *Content-Type 표현 데이터의 형식 설명
    -미디어 타입, 문자 인코딩
      예) text/html; charset=utf-8
          application/json
          image/png
  *Content-Encoding 표현 데이터 인코딩
    -표현 데이터 압축위해 사용, 데이터 전달측에서 압축후 인코딩 헤더 추가
      예) gzip
          deflate
          identity(압축안한다는 뜻 원본그대로)
  *Content-Language 표현 데이터의 자연 언어
    -표현 데이터의 자연 언어를 표현
      예) ko
          en 등
  *Content-Length 표현 데이터의 길이
    -바이트 단위,Transfer_Encoding(전송 코딩)을 사용하면 Content_Length를 사용하면 안됨(정보가 전송코딩에 다있기때문)

## 3. 협상 Content Negotiation

  * 협상과 우선순위1
    -Quailty Values(q)값 사용
    -0~1 클수높 높은 우선순위 생략시 1적용
      예) Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7

  * 협상과 우선순위2
    -구체적인것을 우선한다
      예) Accept: text/*, text/plain, text/plain;format=flowed, */*
        1위 text/plain;format=flowed
        2위 text/plain
        3위 text/
        4위 */*

  * 협상과 우선순위3
    -구체적인 것을 기준으로 미디어 타입을 맞춘다.
      예) Accept: text/*;q=0.3, text/html;q=0.7, text/html;level=1, text/html;level=2;q=0.4, */*;q=0.5
        0~1 클수록 높은 우선순위 없을시 plain일시 0.3으로 매칭

## 4. 전송

  * 단순 전송 - 한번에 송신 (길이를 전부 알아야함)
  * 압축 전송 - 압축해서 송신 (대신 Encoding: gzip등) 헤더정보를 같이보내야함
  * 분할 전송 - byte형식으로 나눠서 송신 분할전송시에 Content-length를 보내면안된다. 예측이안되기때문
  * 범위 전송 - Range: bytes=1001-2000 이런식으로 범위지정해서 송신

## 5. 일반 정보

  * From - 유저 에이전트의 이메일 정보(연락을위한수단)
  * Referer - 이전 웹페이지 주소(유입 경로 분석 가능) 
  * User-Agent - 유저 에이전트(클라이언트) 애플리케이션 정보
      -통계정보에 많이 사용되며 어떤 종류의 브라우저에서 장애가 발생하는지 파악 가능
  * Server - 요청을 처리하는 ORIGIN 서버의 소프트웨어 정보
  * Date - 메세지가 발생한 날짜와 시간
      -응답에서만 사용

## 6. 특별 정보

  * Host - 요청한 호스트 정보(도메인)
      -IP만으로 통신하면 같은IP안에 여러개의 주소 중 어디로 가야할지 모르는 상황 발생
      -예) Host: aaa.com 헤더에 실어서 가상호스팅을 시켜줌
  * Location - 페이지 리다이렉션
      -웹 브라우저는 3xx 응답결과에 Location 헤더가 있으면, Location 위치로 자동 이동(201도 가능)
  * Allow - 허용 가능한 HTTP 메서드
      -405(Method Not Allowed) 에서 응답에 포함해야함
      -예) Allow: GET, HEAD, PUT
  * Retry-After - 유저 에이전트가 다음 요청을 하기까지 기다려야 하는 시간
      -서비스가 언제까지 불능인지 알려주는 등의 기능이있지만 실용성은 낮음

    
## 7. 인증

  * WWWW-Authorization
      -리소스 접근시 필요한 인증 방법을 정의하는데, 401 Unauthorized 응답과 함께 사용됨
      -예) WWWW-Authenticate: Newauth realm="apps", type=1, title="Login to \"app\" ", Basic realm="simple"

    

    

    

  
