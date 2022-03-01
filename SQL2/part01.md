//===========================================//
# QUERY :: SELECT : WHERE 조건절 연산자 학습
//===========================================//
1. WHERE 조건절 :: 연산자

//==> 월급 5000 이상 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
ORDER BY salary;

//==> 2004-01-01 이후 입사자 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE in_date >= "2004-01-01"
ORDER BY in_date;

//==> 이름 이순신666 이상 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE name >= '이순신666'
ORDER BY name;

==> 위의 이해를 돕기위해 아래를 확인
SELECT name FROM emp_test ORDER BY name;


//===========================================//
2. WHERE 조건절 :: 연산자, 논리연산자(NOT, AND, OR)

//==> 2004-01-01 이후 입사자 이며 월급이 5000 이상 이름, 월급, 입사일조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE in_date > '2004-01-01' AND salary >= 5000;

//==> 2004-01-01 이후 입사자 또는 월급이 5000 이상인자 //==> 논리연산자 OR 사용
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE in_date > '2004-01-01' OR salary >= 5000;

//==> 2007-01-01 이후 입사자 이며 월급이 5000 이상 또는 관리부 직원 이름, 월급, 부서 ,입사일
SELECT
name 이름, salary 월급, in_date 입사일, dept_name 부서
FROM emp_test
WHERE in_date > '2007-01-01' AND salary >= 5000 OR dept_name = '관리부';

//==> ()우선순위의 이해
SELECT
name 이름, salary 월급, dept_name 부서명, in_date 입사일
FROM emp_test
WHERE in_date > '2007-01-01' AND (salary >= 5000 OR dept_name = '관리부');

//===========================================//
3. WHERE 조건절 :: SQL 연산자 BETWEEN A AND B

//==> 월급이 1000 ~ 2500 사이 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE salary BETWEEN 1000 AND 2500
ORDER BY salary;

//==> 위의 SELECT 비교
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE salary BETWEEN 1000 AND 2500
ORDER BY salary;

//==> 월급이 1000 ~ 2500 사이 제외한 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE salary NOT BETWEEN 1000 AND 2500
ORDER BY salary;


//==> 김유신222 ~ 한국990 사이 이름, 월급, 입사일 조회
SELECT
name 이름, salary 월급, in_date 입사일
FROM emp_test
WHERE name BETWEEN '김유신222' AND '한국990'
ORDER BY name;

//==> 아래와 비교 이해
SELECT name FROM emp_test ORDER BY name;

//==> 위의 SELECT 비교(주의 A < B)
SELECT
name 이름, salary 월급, dept_name 부서, in_date 입사일
FROM emp_test
WHERE name BETWEEN '한국990' AND '김유신222';


//===========================================//
4. WHERE 조건절 :: SQL 연산자 IN(일치하는것, 일치하는것, ....)

//==> 관리부와 영업부 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE dept_name IN('관리부','영업부')
ORDER BY dept_name;

//==> 아래 비교
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE dept_name = '관리부' OR dept_name = '영업부'
ORDER BY dept_name;

//==> 관리부와 영업부 제외 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE dept_name NOT IN('관리부','영업부')
ORDER BY dept_name;


//===========================================//
5. WHERE 조건절 :: SQL 연산자 LIKE

//==> _ ==> 하나    % ==> 다중

//==> 김씨성을 갖는 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김%';

//==> 김씨성을 갖고 이름이 1자인 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김_';

//==> 김씨성을 갖고 이름이 2자인 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김__';

//==> 이름이 3자 중 2ㅈ번째 자가 '길' 이름, 부서 조회
SELECT
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '_길_';


//===========================================//
6. WHERE 조건절 :: SQL 연산자 LIKE 및 기타 KEYWORD

//==> 조회 할 문자 중 %, _가 사용된 경우 %, _를 검색하려면.....

INSERT INTO emp_test (name, title) VALUES ('박_%', '특수%');
INSERT INTO emp_test (name, title) VALUES ('김_%', '특수%');
SELECT * FROM emp_test;
COMMIT;

//==> '김_%' 와 '박_%'를 모두 조회 의미는???
SELECT
*
FROM emp_test
WHERE name LIKE '__%';

//==> KEYWORD ESCAPE 옵션사용
SELECT
*
FROM emp_test
WHERE name LIKE '_\_\%' ESCAPE '\';

SELECT
*
FROM emp_test
WHERE name LIKE '_?_?%' ESCAPE '?';


//===========================================//
6. WHERE 조건절 :: SQL 연산자 기타 KEYWORD

SELECT
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '%01';

SELECT
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '04%';

SELECT
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '%0%';

//==> ALL : 모두 만족해야 하며,
//==> ANY : 한쪽만 만족해야 한다.
SELECT
name 이름, salary 월급
FROM emp_test
WHERE salary > ALL(2500,5000);  ==> 최대값의 의미!!

SELECT
name 이름, salary 월급
FROM emp_test
WHERE salary > ANY(2500,5000);  ==> 최소값의 의미!!

SELECT
name 이름, salary 월급
FROM emp_test
WHERE salary NOT IN(3333,4444);

SELECT
name 이름, salary 월급
FROM emp_test
WHERE salary <> ALL(3333,4444); ==> <>는 != 의미

SELECT
name 이름, salary 월급
FROM emp_test
WHERE salary != ALL(3333,4444);

111