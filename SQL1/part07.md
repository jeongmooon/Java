//===========================================//
1. QUERY :: SELECT : TABLE RECORD 검색, 조회

//===========================================//
//==> NULL 처리함수(?, FUNCTION) 사용
//==> NULL 인 경우, NULL 이 아닌 경우 처리함수
//==> NVL(expr1, expr2) :: NOTATION ==> expr(EXPRSSION :: 산술식)

//==> salary가 NULL인 RECORD 확인
SELECT * FROM emp_test;

SELECT
name, NVL(salary,0)
FROM emp_test;

//===========================================//
//==> 아래 QUERY 가 ERROR 발생 이유 ???
SELECT
name, NVL(salary, '무급')
FROM emp_test;

//===========================================//
//==> NVL(expr1, expr2) :: expr1이 NULL인 경우 expr2로 출력
//==> NVL2 (컬럼명, [NULL 값이 아닐 경우], [NULL 값인 경우])
SELECT
name, NVL2(salary, salary,0), NVL(salary*12,0)
FROM emp_test;

//==> 아래의 QUERY 를 통해 NVL() / NVL2() 의 차이점 이해
SELECT
name, NVL2(tilte, tilte,'<직급 없음>'), NVL(tilte,'<직급 없음>')
FROM emp_test;

//===========================================//
//==> DECODE 함수 사용해 보면
//==> if ~ else / if ~ else if ~ else 와 비교 이해

SELECT
name, DECODE(tilte,
            NULL,'<직급 없음>', /* if(tilte =null) <직급 없음>      */
            '직급 있음') /* else 아니면 직급 있음*/
FROM emp_test;


SELECT
name, DECODE(tilte,
            NULL, '<직급 없음>', /*if(tilte=null) <직급 없음>*/
            '사장','회사의 아버지',/*else if(title='사장') 회사의 아버지)*/
            '부사장','회사의 어머니',/*else if(title='부사장') 회사의 어머니*/
            '직급 있음'), tilte
FROM emp_test;


11