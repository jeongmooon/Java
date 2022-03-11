# SQL

## SQL(Structured Query Language)
- ����ȭ ���Ǿ�/�ν� RDBMS(������ ������ ���̽� ���� �ý���)�� �����ϱ� ���� ���Ե� Ư�� ������ ���α׷��� ���
- �ڷ��� �˻�/����/�����ͺ��̽� ��Ű������/����/�����ͺ��̽� ��ü���� ���� ���� ������

## SQL ����

### ������ ���� ���(DDL)
- ���̺�� �ε��� ������ ����
- CREATE : �����ͺ��̽� ��ü(���̺�, �ε���, ��������)���� ����
- DROP : �����ͺ��̽� ��ü ����
- ALTER : �����ͺ��̽� ��ü ���� ����

### ������ ���� ���(DML)
- DB����ڰ� ������ �˻�/���/����/������ ���� �����ͺ��̽� ���
- INSERT : ��/���̺� �������� ����
- UPDATE : ǥ ������Ʈ
- DELETE : ���̺��� Ư�� �� ����
- SELECT : ���̺� �������� �˻� ��� ������ ���

### ������ ���� ���(DCL)
- DB���� �����Ϳ� ���� �������� �����ϱ� ���� DB���
- GRANT : DB����ڿ��� Ư�� �۾��� ���� ���� �ο�
- REVOKE : DB�̿��ڷκ��� �� ���� ��Ż
- SET TRANSATION : Ʈ����� ��� ����
- BEGIN : Ʈ����� ����
- COMMIT : Ʈ����� ����
- ROLLBACK : Ʈ����� ���
- SAVEPOINT : �������� �ѹ� ������ ����
- LOCK : TABLE �ڿ��� ����

## ������

<details>
	<summary>�ֿ� ������</summary>
	<div markdwon="1">
		<table>
			<th bgcolor="gray">������</th>
			<th bgcolor="gray">����</th>
			<tr>
				<td>=</td>
				<td>����</td>
			</tr>
			<tr>
				<td><> or !=</td>
				<td>���� �ʴ�</td>
			</tr>
			<tr>
				<td>> or <</td>
				<td>�ʰ�/�̸�</td>
			</tr>
			<tr>
				<td><= or >=</td>
				<tb>����/����</tb>
			</tr>
			<tr>
				<td>BETWEEN</td>
				<tb>���� ���� ����</tb>
			</tr>
			<tr>
				<td>LIKE</td>
				<tb>���� �˻�</tb>
			</tr>
			<tr>
				<td>IN</td>
				<tb>�÷��� ���� ������ ������ ����</tb>
			</tr>
			<tr>
				<td>IS NULL/IS NOT NULL</td>
				<tb>NULL�̴�/�ƴϴ�</tb>
			</tr>
		</table>
	</div>
</details>

## SQL �⺻����

```

SELECT C/N
FROM T/N
WHERE ����
GROUP BY C/N
HAVING ����
ORDER BY ����

```

## INNER JOIN

```
SELECT C/N(T/N1 && T/N2 && T/N3)
FROM T/N1
INNER JOIN T/N2 ON T/N1.C/N = T/N2.C/N;
INNER JOIN T/N3 ON T/N1.C/N = T/N3.C/N;
```

- �̷������� �÷����⵵ ����
- SELECT������ �ٸ� ���̺��� �÷��� ��� �� �� ����

## LEFT JOIN

```
SELECT C/N(T/N1 && T/N2)
FROM T/N1
LEFT JOIN T/N2 ON T/N1.C/N = T/N2.C/N;
```