# OAuth2.0을 통한 Authorization 과정  
- Client	사용자가 사용하려는 우리가 만든 서비스.
- Resource Server	서비스에 자신의 API를 제공하는 타사 서비스.
- Resource Owner	타사 서비스 API의 정보의 주인, 즉 우리가 만든 서비스를 타사 서비스를 통해 이용하려는 사용자.  
1) Client가 Resource Server API를 사용한다고, Resource Serever에 등록 해야함. ( Twitter, Instagram etc. )  
2) Resource Server는 Client를 식별할 수 있는 Client ID, Client Secret 발급  
3) Resource Owner가 우리가 만든 Client에서 Google 계정으로 로그인 후 로그인 요청  
4) Client는 Resource Owner에게 Resource Server 로그인 창을 띄워줌  
5) 만일 Resource Owner가 Client에게 Resource Server에 있는 자신의 정보에 접근을 허락하면 Resource Server는 Client에게 일련의 암호화된 코드를 제공하고 이 코드와 함께 해당 정보의 사용 등록을 했는지의 여부를 판단하는 Client ID와 Client Secret을 함께 보내 모든 것이 일치한다면 최종 접근 권한 부여의 암호인 Access Token을 발급하게 됩니다  

> 이러한 Authorization의 과정을 걸쳐 Client는 Resource Server의 특정 정보에 대한 접근 권한을 얻게 되어 해당 정보를 토대로 Resource Owner를 인증(Authentication)하여 Client의 서비스를 이용할 수 있게 합니다.

## Google, Facebook, Kakao 로그인  
- Google  
google developers console에 접속해서 project를 생성해준다.  
사용자인증정보 > OAuth 클라이언트 ID 만들기
