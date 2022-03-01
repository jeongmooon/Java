//===========================================//
3. KEYWORD :: NULLS FIRST / NULLS LAST

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12 ASC NULLS FIRST;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12 DESC NULLS LAST;


//===========================================//
//==> ORDER BY expr | COLUMN | ALIAS | COLUMN index 사용

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY 연봉;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY 2;

//===========================================//
//==> 아래의 2 QUERY 결과 확인
SELECT
name 이름, salary*12 연봉, dept_name 부서
FROM emp_test
ORDER BY dept_name;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY dept_name;

//===========================================//
//==> 아래의 의미 확인

//==> 연봉 오름차순
SELECT
name 이름, salary*12 연봉, dept_name 부서
FROM emp_test
ORDER BY salary;

//==> 연봉 오름차순 후 부서 오름차순
SELECT
name 이름, salary*12 연봉, dept_name 부서
FROM emp_test
ORDER BY salary, 부서;

//==> 부서 오름차순 후 연봉 오름차순
SELECT
name 이름, salary*12 연봉, dept_name 부서
FROM emp_test
ORDER BY 부서, salary;

//===========================================//
# QUERY :: SELECT : 기타 KEYWORD 를 이용 검색, 조회
//===========================================//
1. KEYWORD :: || CONCATENATION (COLUMN 합성)

//==> || 사용 홍길동대리 형식검색
SELECT
name||tilte
FROM emp_test;

//==> || 사용 홍길동 대리 형식검색
SELECT
name||' '||tilte
FROM emp_test;

//===========================================//
2. KEYWORD :: DISTINCT 중복된 행들 제거

//==> dept_name(부서) 조회
SELECT dept_name 부서 FROM emp_test;

//==> 중복 행 제거 검색결과 ?
SELECT
DISTINCT dept_name 부서명
FROM emp_test;

//===========================================//
//==> 아래 같이 하면 검색 결과?
//==> KEYWORD :: DISTINCT 적용 범위는 ?
SELECT
DISTINCT dept_name, name
FROM emp_test;

//===========================================//
//==> DISTINCT 적용범위 :: DISTINCT 후단 COLUMN 조합의 중복

//==> 홍길동/관리부 동일한 이름, 부서 갖는 RECORD 중복 INSERT
INSERT
INTO emp_test (name, dept_name)
VALUES('홍길동', '관리부');

//==> 아래의 두 QUERRY 비교
SELECT
dept_name, name
FROM emp_test;
==> 관리부의 홍길동 2명 검색 확인

SELECT
DISTINCT dept_name, name
FROM emp_test;
==> 관리부의 홍길동 1명 검색 확인

ROLLBACK
//===========================================//

//===========================================//
3. KEYWORD :: ORDER BY (정렬, SORT)

//==> ORDER BY
//==> ASC(오름차순) / DESC(내림차순)
SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12 ASC;

SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12 DESC;

//==> ASC, DESC 삭제 :: 결과??
SELECT
name 이름, salary*12 연봉
FROM emp_test
ORDER BY salary*12;

1