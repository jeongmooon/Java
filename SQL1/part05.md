1. DML :: UPDATE : TABLE RECORD 수정

/////////////////////////////////////////////////
//==> SCOTT id2 확인
SELECT * FROM emp_test;

//==> SCOTT id2 ==> 7 변경
UPDATE emp_test;
SET id =7
WHERE name = 'SCOTT';

//==> SCOTT id2 ==> 7 변경 확인
SELECT * FROM emp_test;

/////////////////////////////////////////////////


/////////////////////////////////////////////////
//==> SCOTT id2 ==> 7로 변경 후 COMMIT
UPDATE emp_test
SET id = 7
WHERE name ='SCOTT';

SELECT * FROM emp_test;

COMMIT;
/////////////////////////////////////////////////

//===========================================//
//==> 영업부 ==> 관리부로 변경

UPDATE emp_test
SET dept_name='관리부'
WHERE dept_name ='영업부'

SELECT * FROM emp_test;

COMMIT;

//===========================================//
//==> 홍길순 :: 사장 //2000/영업팀 :: 변경

UPDATE emp_test
SET dept_name ='영업팀', tilte ='사장', salary=2000
WHERE name = "홍길순";

//===========================================//
//==> 월급 1500 이상인 직원 dept_name '대기발령' 변경

UPDATE emp_test
SET dept_name = '대기발령'
WHERE salary >= 1500;

//===========================================//
//==> 전직원 직급 '평사원' 변경 ==> 변경 후 ROLLBACK
//==> WHERE 절이 없다면 ?? => 전체적용

SELECT emp_test
SET dept_name ='평사원';

ROLLBACK;

//===========================================//
//==> 전직원 임금인상 500 ==> 변경후 COMMIT
//==> WHERE 절이 없다면 ?? => 전체적용
//==> :: int i = 10; i= i+5;

UPDATE emp_test
SET salary = salary+500
FROM emp_test

//===========================================//
1. DML :: DELETE : TABLE RECORD 삭제

//==> tilte 장군이 RECORD 삭제
DELETE FROM emp_test
/*DELETE emp_test*/
WHERE tilte ='장군';

SELECT * FROM emp_test;

COMMIT;

//===========================================//
//==> id 6이상 RECORD 삭제 ==> 변경후 ROLLBACK

DELETE FROM emp_test
WHERE id>=6;

ROLLBACK;

SELECT * FROM emp_test;


//===========================================//
//==> id 5이상 6이하 RECORD 삭제 ==> 변경후 ROLLBACK

DELETE FROM emp_test
WHERE id>=5 AND id<=6;

ROLLBACK;

SELECT * FROM emp_test;


//==> 위의 DELETE 조건과 아래의 조건 비교
DELETE FROM emp_test
WHERE id = 5 OR id =6;

SELECT * FROM emp_test;

COMMIT;

SELECT * FROM emp_test;

//===========================================//
//==> 아래와 같은 실수없도록
DELETE FROM emp_test
WHERE id = 2 OR id=3;

SELECT * FROM emp_test;

ROLLBACK;

SELECT * FROM emp_test;

//==> 아래는 의미를 갖는가
DELETE FROM emp_test
WHERE id=2 AND id=3;


//===========================================//
==> DELETE 시 조건절이 없다는 의미는??
DELETE FROM emp_test;

SELECT * FROM emp_test;

ROLLBACK;

SELECT * FROM emp_test;
