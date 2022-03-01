//===========================================//
1. QUERY :: SELECT : TABLE RECORD 검색, 조회
//===========================================//
//==> 모든 COLUMN 조회
SELECT * FROM emp_test;

//==> 필요한 정보(COLUMN)조회
//==> SQL의 주석문을 사용, 이해 /*COMMENT*/
SELECT          /*명령문*/
id, name        /*검색하고자하는 COLUMN name*/
FROM emp_test   /*검색하고자하는 TABLE name*/

SELECT
name,id
FROM emp_test;


//===========================================//
//==> 이름 월급, 연봉검색??
//==> 원하는 정보를 원하는 형식으로 추출
SELECT
name, salary, salary*12     /*산술식 :: EXPRSSION*/
FROM emp_test;


//===========================================//
//==> ALIAS 사용 COLUMN 정확한 의미 부여
SELECT
name AS 이름, salary AS 월급, salary*12 AS 연봉
FROM emp_test;


//===========================================//
//==> ALIAS 사용 COLUMN 정확한 의미 부여 :: AS 생략 가능
SELECT
name 이름, salary 월급, salary*12 연봉
FROM emp_test;

//===========================================//
//==> ALIAS사용 :: 공백문자(특수문자) "~~"사용
SELECT
name 이름, salary 월급, salary*12 "연봉(성과급 제외)"
FROM emp_test;

11