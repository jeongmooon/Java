//===========================================//
# FUNCTION ==> 내부적으로 제공되는 함수
    :: SINGLE ROW FUNCTION          ==> 1개의 RECORD에서 사용 단일행함수
    :: MULLTI ROW FUNCTION          ==> 여러개의 RECORD에서 사용 다중행 함수


//===========================================//
1. 단일행 함수 :: 문자 함수 CONCAT/SUBSTR/LENGTH

//==> CONCAT(문자,문자) => || 비교 이해
SELECT
name || '님의 월급은' || salary || '원' "사원 월급"
FROM emp_test;

//==> 위와 비교
SELECT
CONCAT(CONCAT(name,'님의 월급은'), CONCAT(salary, '원')) "사원 월급"
FROM emp_test;


//==> SUBSTR(문자, 시작위치, 잘라낼갯수)
//==> 2001 년도에 입사자 이름, 입사년 조회
SELECT
name 이름, in_date 입사연도
FROM emp_test
WHERE in_date LIKE '01%';

//==> 위와 비교
SELECT
name 이름, in_date 입사연도
FROM emp_test
WHERE SUBSTR(in_date,1,2) = '01';

//==> 위와 비교
SELECT
name 이름, in_date 입사연도 
FROM emp_test
WHERE SUBSTR(in_date, -8, 2) = '01';

//==> LENGTH(문자) => 문자의 갯수 리턴
SELECT
TITLE 두자직책
FROM emp_test
WHERE LENGTH(TITLE) = 2;

1