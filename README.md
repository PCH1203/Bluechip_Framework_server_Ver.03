# BluechipFramework_server_Ver.03

## 개요
* 자사 프레임워크 개발

## 특징
* 기존 Legacy 환경에서 서버/클라이언트 분리 (RESTFul) 및 자체 프레임워크 개발을 목적으로
* 개발중이며 SpringBoot를 통한 서버 개발과 React를 통한 클라이언트 개발로 서버와 클라이언트 개발을 분리한다.
* API문서 자동화 프레임워크인 Swagger-ui을 사용하여 API 명세를 관리하고 서버 / 클라이언트간 필요한 자원을 공유한다.

## 구성
* JAVA 프레임워크 : SpringBoot (gradle)
* ORM : JPA(Hibernate) + Mybatis
* DB : Mysql
* WAS : 내장 Tomcat

## API 문서 (Swagger)
* http://{host_주소}/framework/demo

## DB 접속정보

* url: jdbc:mysql://localhost:3306/framework?characterEncoding=UTF-8&serverTimezone=UTC
* username: root
* password: 1234

## sms 전송
* coolSMS API 사용 (변경 예정)