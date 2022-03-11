# SQL

## SQL(Structured Query Language)
- 구조화 질의어/로써 RDBMS(관계형 데이터 베이스 관리 시스템)을 관리하기 위해 설게된 특수 목적의 프로그래밍 언어
- 자료의 검색/관리/데이터베이스 스키마생성/수정/데이터베이스 객체접근 조정 관리 용이함

## SQL 구문

### 데이터 정의 언어(DDL)
- 테이블과 인덱스 구조를 관리
- CREATE : 데이터베이스 개체(테이블, 인덱스, 제약조건)등을 정의
- DROP : 데이터베이스 개체 삭제
- ALTER : 데이터베이스 개체 정의 변경

### 데이터 조작 언어(DML)
- DB사용자가 데이터 검색/등록/삭제/갱신을 위한 데이터베이스 언어
- INSERT : 행/테이블 데이터의 삽입
- UPDATE : 표 업데이트
- DELETE : 테이블에서 특정 행 삭제
- SELECT : 테이블 데이터의 검색 결과 집합의 취득

### 데이터 제어 언어(DCL)
- DB에서 데이터에 대한 엑세스를 제어하기 위한 DB언어
- GRANT : DB사용자에게 특정 작업을 위한 권한 부여
- REVOKE : DB이용자로부터 준 권한 박탈
- SET TRANSATION : 트랜잭션 모드 설정
- BEGIN : 트랜잭션 시작
- COMMIT : 트랜잭션 실행
- ROLLBACK : 트랜잭션 취소
- SAVEPOINT : 무작위로 롤백 지점을 설정
- LOCK : TABLE 자원을 차지

## 연산자

<details>
	<summary>주요 연산자</summary>
	<div markdwon="1">
		<table>
			<th bgcolor="gray">연산자</th>
			<th bgcolor="gray">설명</th>
			<tr>
				<td>=</td>
				<td>같다</td>
			</tr>
			<tr>
				<td><> or !=</td>
				<td>같지 않다</td>
			</tr>
			<tr>
				<td>> or <</td>
				<td>초과/미만</td>
			</tr>
			<tr>
				<td><= or >=</td>
				<tb>이하/이하</tb>
			</tr>
			<tr>
				<td>BETWEEN</td>
				<tb>일정 범위 사이</tb>
			</tr>
			<tr>
				<td>LIKE</td>
				<tb>패턴 검색</tb>
			</tr>
			<tr>
				<td>IN</td>
				<tb>컬럼의 여러 가능한 값들을 지정</tb>
			</tr>
			<tr>
				<td>IS NULL/IS NOT NULL</td>
				<tb>NULL이다/아니다</tb>
			</tr>
		</table>
	</div>
</details>

## SQL 기본구조

```

SELECT C/N
FROM T/N
WHERE 조건
GROUP BY C/N
HAVING 조건
ORDER BY 조건

```

## INNER JOIN

```
SELECT C/N(T/N1 && T/N2 && T/N3)
FROM T/N1
INNER JOIN T/N2 ON T/N1.C/N = T/N2.C/N;
INNER JOIN T/N3 ON T/N1.C/N = T/N3.C/N;
```

- 이런식으로 늘려가기도 가능
- SELECT절에서 다른 테이블의 컬럼도 들고 올 수 있음

## LEFT JOIN

```
SELECT C/N(T/N1 && T/N2)
FROM T/N1
LEFT JOIN T/N2 ON T/N1.C/N = T/N2.C/N;
```