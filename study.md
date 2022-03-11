# Idex

- [02-11](#0211-과제)
- [02-16](#0216-과제)
- [02-17](#0217-과제)
- [02-18](#0218-과제)
- [02-22](#0222-과제)
- [02-23](#0223-과제)


<hr />


# 02.11 과제

## example2

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554291-77706ecf-da13-499b-96ff-d470601c6334.PNG" />

### 코드

```
public class Example2
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int i = 1;
		System.out.println(a+"단을 출력합니다");
		while(i<10){			
			System.out.println(i+"*"+a+"="+i*a);
			i++;
		}// while
	}// main
}// class

```

## exapmle3

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554349-7b852fee-928b-429f-8bb1-f1903cefbe2c.PNG" />

### 코드

```
public class Example3
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i = 0;
		int sum = 0;

		if(a == b){
			// a와b가 같다면
			System.out.println("[usage]"+a+"와 "+b+"는 같다");
			return;
		}

		if(a<b){
			// a가 b보다 크다면
			i = a;
			a = b;			

		} else {
			// a가 b보다 작다면
			i = b;			
		}
		while(i<=a){
				sum = sum+i;
				i++;
		}
		// 결과값 출력
		System.out.println(Integer.parseInt(args[0])+"~"+b+"의 총합은 "+sum+"이다");
	}//main
}//class

```

## exapmle4

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554464-5c48edd4-c2a0-46d1-9a91-26f469d7b0a8.PNG" />

### 코드

```
public class Example4
{
	public static void main(String[] args) 
	{		
		System.out.println("구구단 출력기");
		for(int i=0; i<9; i++){
			System.out.println((i+1)+"단");
			for(int j=0; j<9; j++){
				int a = i+1;
				int b = j+1;
				System.out.println(a+"*"+b+"="+a*b);
			}
			System.out.println("===================================================");
		}
	}// main
}// class

```

## exapmle5

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554505-0e54b2ef-6dbc-4a95-ad3a-78d35b99d735.PNG" />

### 코드

```
public class Example5
{
	public static void main(String[] args) 
	{
		int[][] gugu = new int[9][9];
		
		System.out.println("구구단 출력기");
		for(int i=0; i<gugu.length; i++){
			System.out.println((i+1)+"단");
			for(int j=0; j<gugu[i].length; j++){
				int a = i+1;
				int b = j+1;
				gugu[i][j] =a*b;
				System.out.println(a+"*"+b+"="+gugu[i][j]);
			}
			System.out.println("===================================================");
		}
	}// main
}// class

```

# 02.16 과제

## prob01
숫자구하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236270-7baee156-c8a8-4e2d-b403-fbf6f75d61b6.png" />

### 코드

```
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int sum = 0;
		// 최고숫자
		int maxInt=1001;

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" 양의 정수를 입력하세요 : ");
		number = keyboard.nextInt();
		
		// 범위
		if(0<number && number<maxInt){
			// 숫자반복문
			for(int i=1; i<maxInt; i++){
				// 카운트, 합 구하기
				if(i%number == 0){
					count++;
					sum += i;
				}
			}
		}
		// 결과값
		System.out.println(number + "의 배수 개수 = " +count);
		System.out.println(number + "의 배수 합 = " + sum);
	}// main
}// calss

```


## prob02
소팅하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236482-e5e00c78-f7a7-44be-853d-b28143d49f1e.png" />

### 코드

```
public class Prob02 {
	public static void main(String[] args) {
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		int[] copyArray = new int[array.length];
		String special = "";
		//int c =0;
		System.arraycopy(array, 0, copyArray, 0, array.length);

		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				
				if(array[i] > array[j]){
					//c++;
					// 값 대입
					array[i] = copyArray[j];
					array[j] = copyArray[i];
										
					copyArray[i] = array[i];
					copyArray[j] = array[j];					
				}
			}
			if(i<array.length-1){
				special = ", ";
			} else {
				special = " ";
			}
			System.out.print(array[i]+special);
		}

	}// main
}// class

```


## prob03
윤달구하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236701-980e787d-e481-4b91-aaa2-9da07e3f8022.png" />

### 코드

```
public class Prob03 {
	public static void main(String[] args) {
		int year = 2010;
		int month = 2;
		int maxDay = 0;
		
		if(year%4 ==0){
			if(year%100 ==0){
				if(year%400 ==0){
					maxDay=29;
				}
				maxDay = 28;				 
			}
			maxDay = 29;
		} else {
			maxDay = 28;
		}

		System.out.println(year+"년 "+month+"월의 말일은 "+maxDay+"일 입니다");
	}
}


```


# 02.17 과제

## prob01
두숫자의 차이 절대값 구하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237039-10c41f87-d308-4a0d-8a56-c642f74fc826.png" />

### 코드

```
import java.util.Scanner;

public class  Prob01 {
	
	// 메소드 시그니처로 작성
	public int abs(int num1, int num2){
		if(num1 <num2){
			return -(num1-num2);
		}
		if(num2 < num1){
			return (num1-num2);
		}
		return 0;
	}//abs

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("숫자 두개를 입력해주세요>>");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		Prob01 prob = new Prob01();
		System.out.println("두수의 차는 "+prob.abs(num1, num2));
	}// main

}//class
```

## SortUtil
소팅하기메소드 만들기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237248-bf50aafd-2b47-45a3-8a33-8f999f43b4c2.png" />

#### 코드

```
public class SortUtil {
	public int[] ascending(int[] inputNumbers){
		int[] array = inputNumbers;
		int[] copyArray = new int[array.length];
		String special = "";
		System.arraycopy(array, 0, copyArray, 0, array.length);

		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				
				if(array[i] > array[j]){
					// 값 대입
					array[i] = copyArray[j];
					array[j] = copyArray[i];
										
					copyArray[i] = array[i];
					copyArray[j] = array[j];					
				}
			}
			/*if(i<array.length-1){
				special = ", ";
			} else {
				special = " ";
			}
			System.out.print(array[i]+special);*/
		}
		return array;
	}//method

	public static void main(String[] args) {
		SortUtil util = new SortUtil();
		int[] numbers = new int[]{7,5,2,19,34,51,32,11,67,21};

		numbers = util.ascending(numbers);

		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);

			if( i != numbers.length-1){
				System.out.print(", ");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println("Successfull!!!");		
	}//main
}//class
```


## Prob02
역피라미드 별찍기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237693-ab4a2efb-5b5e-420d-a90d-710e0fe52493.png" />

### 코드

```
import java.util.Scanner;

public class Prob02 {

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("0보다 큰 홀수를 입력해 주세요>>");
		int num = keyboard.nextInt();

		if(num%2 == 1 && 0 < num){
			for(int i=1; i<=num; i++){
				// String 생성
				String s = "";
				for(int j=1; j<i; j++){
					// 왼쪽 빈칸 찍기
					s += " ";
				}
				for(int j = 1; j <= num-2*i+2; j++){
					// 별찍기
					s += "*";
				}
				System.out.println(s);
				if( i > num/2){
					// 별찍기가 끝나고 나머지줄 없애기
					System.out.println();
					return;
				}
			}			
		} else {
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
		}
	}//main
}//class
```

# 02.18 과제

## prob01
- 정삼각형 특수문자 찍기
- 특이사항
	- 키보드로 구현함
	- 메소드로 만듬

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154442617-5ea12bca-8c08-454a-823b-6d6a5722ce7a.png" />

### 코드

```
import java.util.Scanner;

public class Prob01 {
	
	// Method
	public void printStar(String star, int num){
		for(int i=1; i<=num; i++){
				// String 생성
				String s = "";

				for(int j=0;  j<=num-i; j++){
					// 왼쪽 빈칸 찍기
					s += " ";
				}

				for(int j=1; j<=(2*i)-1; j++){
					// 별찍기
					s += star;
				}
				System.out.println(s);
			}
	}

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("원하는 기호를 입력하세요");
		String star = keyboard.next();

		System.out.print("1보다 큰 숫자를 입력해 주세요>>");
		int num = keyboard.nextInt();

		if(num<1){
			System.out.println("1보다 큰 숫자 입력");
		}

		new Prob01().printStar(star,num);

	}//main
}//class
```


## prob02
- 태어난 달을 받아 계절 출력하기
- 특이사항
	- 매개변수로 만듬
	- 메소드의 시그니쳐로 만듬
	- 반드시 switch문을 사용
	- 에러값 걸러낼것

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154443026-fc829cfa-408d-4fb5-b8d7-3fe1b3d329fc.png" />

### 코드

```
public class Prob02 {
	//method
	public void printSeason(int month){
		String s="";
		
		switch(month){
			case 1 :
			case 2 :
			case 3 :
				s = "봄";
				break;
			case 4 :
			case 5 :
			case 6 :
				s = "여름";
				break;
			case 7 :
			case 8 :
			case 9 :
				s = "가을";
				break;
			case 10 :
			case 11:
			case 12 :
				s = "겨울";
				break;
		}
		System.out.println(s+"에 태어나셨네요.");
	}

	//main
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		
		//필터링
		if (month<1 || 12<month) {
			System.out.println("1~12 사이의 숫자를 입력하셔야 합니다.");
			return;
		}
		
		//호출
		new Prob02().printSeason(month);
	}// main
}//class

```


## TestRectabgle
- 사각형 두개 입력받고 비교하기
- 특이사항
	- 키보드 사용
	- Rectangle 클래스를 신규로 작성하시오
	- get,set사용

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154443443-b2687a0c-0d96-4705-b689-8f8542d44648.png" />

### 코드

```
import java.util.Scanner;

class Rectangle {

	//Field
	String color;
	int width;
	int length;
	int area;
	int perimeter;
	
	//Constructor
	public Rectangle(){
	}

	//setter
	public void setColor(String str) {
		color = str;
	}

	public void setWidth(int a) {
		width = a;
	}

	public void setLength(int a) {
		length = a;
	}

	//getter
	public String getColor(){
		return color;
	}
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	
	//method
	public int area() {
		area = (width*length);
		return area;
	}

	public int perimeter() {
		perimeter = 2*(width+length);
		return perimeter;
	}

}//class*/

public class TestRectangle {	

	//main
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로");
		rec1.setLength(keyboard.nextInt());


		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로");
		rec2.setLength(keyboard.nextInt());
		
		// TODO 1) 두 직사각형의 넓이를 비교하시오
		if(rec1.area() > rec2.area()){
			System.out.println("넓이는 "+rec1.getColor()+"직사각형이 더 큽니다");
		} else if(rec1.area() < rec2.area()){
			System.out.println("넓이는 "+rec2.getColor()+"직사각형이 더 큽니다");
		} else {
			System.out.println("넓이는 같습니다");
		}

		// TODO 2) 두 직사각형의 둘레를 비교하시오
		if(rec1.perimeter() > rec2.perimeter()){
			System.out.println("둘레는 "+rec1.getColor()+"직사각형이 더 큽니다");
		} else if(rec1.perimeter() < rec2.perimeter()){
			System.out.println("둘레는 "+rec2.getColor()+"직사각형이 더 큽니다");
		} else {
			System.out.println("둘레는 같습니다");
		}
	}//main
}// class

```


# 02.20 과제

## prob01
- 홀짝 나눠서 합구하기
- 특이사항
	- 나머지 연산자
	- 메소드로 만듬

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154640119-37248f61-d765-4aa8-9a18-51044c460b1e.png" />

### 코드

```
// 홀수의 합과 짝수의 합을 출력하기
public class Prob01 {
	//method
	public void calc(int[] ix){
		int a =0;
		int b =0;
		for(int i=0; i<ix.length; i++){
			if(ix[i]%2 == 0){
				a += ix[i];
			} else{
				b += ix[i];
			}
		}
		System.out.println("홀수의 합 : "+b);
		System.out.println("짝수의 합 : "+a);
	}

	//main
	public static void main(String[] args) {
		int [] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int [] ib = new int[]{1,2,3,4,5};

		Prob01 p = new Prob01();
		System.out.println("(배열 ia)");
		p.calc(ia);
		System.out.println("(배열 ib)");
		p.calc(ib);
	}
}

```

## FactoriaUtil
- 팩토리얼 구하기
- 특이사항
	- 키보드 사용
	- 메소드로 만듬
	- 재귀적인 방법 이용
	- retrun

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154640486-150df309-6a5d-4c45-b46a-70ee9f14416b.png" />

### 코드

```
import java.util.Scanner;

public class FactoriaUtil {
	//Field
	int i=1;
	int r=1;

	//method
	public int factorial(int n){
		// 구현하시오		
			i++;		
			r = r*i;
		if(n-i>0){	
			factorial(n);
		}
		return r;
	}

	// main
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input\t\t\t\t= ");

		FactoriaUtil util = new FactoriaUtil();
		System.out.print("Result = " + util.factorial(keyboard.nextInt()));
	}
}

```

## TestAccount
- 계좌 만들기
- 특이사항기
	- 메소드로 만듬
	- retrun

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154640853-0e94d8d8-33d1-44fb-9834-27cc35c93d7e.png" />

### 코드

#### Account Bean코드
```
class Account {
	//Field
	String accNo;
	int balance;
	
	//Constructor
	public Account(String str){
		accNo = str;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}

	//getter
	public String getAccNo(){
		return accNo;
	}
	public int getBalance(){
		return balance;
	}

	//method
	public void save(int save){
		//입금
		balance += save;
		System.out.println(accNo+" 계좌의 잔고에 "+balance+"만원이 입금되었습니다.");
	}

	public void deposit(int deposit){
		//출금
		balance -= deposit;
		System.out.println(accNo+" 계좌의 잔고에 "+balance+"만원이 출금되었습니다.");
	}
}


```

#### Account APP코드

```
public class TestAccount {
	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원입니다");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " 계좌의 잔고는 "+balance+"만원입니다");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 "+balance+"만원입니다");
	}
}

```

## Prob2
- 학교관리시스템
- 특이사항기
	- 메소드로 만듬
	- extends

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154641307-6c99b743-1abb-4906-8fcd-3cf5873b0a61.png" />

### 코드

#### Account Bean코드

- School 코드 super 코드
```
class School {
	//Field
	private String name;
	private int age;
	
	//Constructor
	public School(String str, int i){
		name = str;
		age = i;
	}

	//setter
	public void setName(String str){
		name = str;
	}
	public void setAge(int i){
		age = i;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}// class
```


- 나머지 3분류 코드
```
class Student extends School {

	//Field
	private int id;

	//Constructor
	public Student(String str, int age, int id){
		super(str, age);
		this.id = id;
	}

	//setter
	public void setId(int id){
		this.id = id;
	}

	//getter
	public int getId(){
		return id;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t학\t번 : "+id);
	}
}

class Teacher extends School {

	//Field
	private String subject;

	//Constructor
	public Teacher(String str, int age,  String subject){
		super(str, age);
		this.subject = subject;
	}

	//setter
	public void setId(String subject){
		this.subject = subject;
	}

	//getter
	public String getSubject(){
		return subject;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t담당  과목 : "+subject);
	}
}

class Employee extends School {

	//Field
	private String dept;

	//Constructor
	public Employee(String str, int age,  String dept){
		super(str, age);
		this.dept = dept;
	}

	//setter
	public void setId(String dept){
		this.dept = dept;
	}

	//getter
	public String getDept(){
		return dept;
	}

	//method
	public void print(){
		System.out.println("이\t름 : "+getName()+"\t\t나\t이 : "+getAge()+"\t\t부\t서 : "+dept);
	}
}
```


#### Account APP코드

```
public class Prob02 {
	public static void main(String[] args) {

		Student s = new Student("홍길동", 20 , 200201);
		Teacher t = new Teacher("이순신", 30, "Java");
		Employee e = new Employee("유관순", 40, "교무과");
		
		s.print();
		t.print();
		e.print();
	}
}

```

# 02.22 과제

## ArrayCompare
- message 전달
- static method사용

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155076785-59e84740-72b8-48a6-8ec9-c11eff3f95fa.png" />

### 코드

```
public class ArrayCompare {
	private static boolean equalsArr(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length){
			return false;
		}

		for(int i=0; i<arr1.length; i++){
			if(arr1[i] == arr2[i]){
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr1 = {3,5,6,9,10,2,7};
		int[] arr2 = {3,5,6,9,10,2,7};
		if(equalsArr(arr1,arr2)){
			System.out.println("two array eqauls");
		} else {
			System.out.println("two array not equals");
		}

		System.out.println("==============================================");

		int[] arr3 = {3,5,6,9};
		int[] arr4 = {3,5,6,9,8};
		if(equalsArr(arr3,arr4)){
			System.out.println("two array eqauls");
		} else {
			System.out.println("two array not equals");
		}

		
	}
}

```


## Prob01
- Book, BookMgr 클래스 만들기
- private 접근제한자 사용하기
- setter/getter사용하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155077198-6e0fa01c-d49b-4e31-a730-08687ee152f8.png" />

### 코드

```
class Book {
	//Field
	private String title;
	private int price;

	//Constructor
	public Book(){
	}

	public Book(String title, int price){
		this.title = title;
		this.price = price;
	}

	//setter
	public void setTitle(String title){
		this.title = title;
	}
	public void setPrice(int price){
		this.price = price;
	}

	//getter
	public String getTitle(){
		return title;
	}
	public int getPrice(){
		return price;
	}
}//class

//
class BookMgr{
	//Field
	Book[] booklist;

	public BookMgr(Book[] booklist){
		this.booklist = booklist;
	}
	
	public void printBooklist(){
		for(int i=0; i<booklist.length; i++){
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice(){
		int total = 0;
		for(int i=0; i<booklist.length; i++){
			total += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+total);
	}
}
public class Prob01 {
	public static void main(String[] args) {
		Book[] booklist = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);

		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		//System.out.println(book1.getPrice());

		BookMgr mgr = new BookMgr(booklist);

		System.out.println("=== 책 목록 ===");
		mgr.printBooklist();
		System.out.println("");

		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}

```


## Prob02
- 암호만들기
- API사용하기
- if, 건너뛰기 사용하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155077427-fb5972f1-8bbe-4940-9321-586e4fdd47fd.png" />

### 코드

```
public class Prob02 {
	public String encoded(String sourceString){
		String str = "";
		for(int i=0; i<sourceString.length(); i++){
			int a = sourceString.charAt(i)+3;
			if(a>122){
				a -= 26;
				char b = (char)a;
				str += b;
			}else if(a == 35){
				str += " ";
			}else {
				char b = (char)a;
				str += b;
			}
		}
		return str;
	}

	public String decoded(String encodedeString){
		String str = "";
		for(int i=0; i<encodedeString.length(); i++){
			int a = encodedeString.charAt(i)-3;
			if(93<a && a<97){
				a += 26;
				char b = (char)a;
				str += b;
			} else if(a == 29){
				str += " ";
			} else {
				char b = (char)a;
				str += b;
			}
		}
		return str;
	}

	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedeString = "";
		String decodedString = "";
		
		Prob02 str = new Prob02();
		encodedeString = str.encoded(sourceString);
		System.out.println(encodedeString);
		
		decodedString = str.decoded(encodedeString);
		System.out.println(decodedString);
		//	sourceString.length();
		//아스킥타입
	}
}

```


<hr />



# 02.23 과제

## Prob01
- 구구단 만들기
- Method정의

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155077701-df3c5c0d-6061-4f16-a701-0aaa3e739d0c.png" />

### 코드

```
public class Prob01 {
	public static void printGugudan(int no){
		if(no<0 || 9<no){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다"); 
			return;
		}

		for(int i=0; i<9; i++){
			for(int j=0; j<no; j++){
				System.out.print((j+1)+"*"+(i+1)+"="+(j+1)*(i+1)+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("주어진 숫자까지의 구구단을 찍습니다");
		System.out.println("=========Sample 1========");
		printGugudan(4);

		System.out.println("=========Sample 2========");
		printGugudan(9);

		System.out.println("=========Sample 3========");
		printGugudan(-1);

		System.out.println("=========Sample 4========");
		printGugudan(10);
	}
}

```


## TestShape
- Polymorphism다형성 만들기 오버로딩
- Object Array만들기
- abstrac를 만들어서 method 오버라이딩하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155077916-708f2d52-4de9-4eb0-b428-002ec8067c4a.png" />

### 코드

```
abstract class Shape {
	//Field
	private String name;
	protected double area;

	public Shape(){
	}
	public Shape(String name){
		this.name = name;
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setArea(double area){
		this.area = area;
	}
	//getter
	public String getName(){
		return name;
	}
	public double getArea(){
		return area;
	}
	
	public void print(){
		System.out.println(getName()+"의 면적은"+area);
	}

	public abstract void calculationArea();
}

class Circle extends Shape {
	private double radius;

	public Circle(){}
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void calculationArea(){
		// Math API호출해서 PI값 가져오기(public이여서 호출가능)
		super.setArea(radius*radius*Math.PI);
		
	}
}

class Rectangular extends Shape {
	private double width;
	private double hight;

	public Rectangular(){}
	public Rectangular(String name, double width, double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}

	//setter
	public void setWidth(double width){
		this.width=width;
	}
	public void setHight(double higth){
		this.hight=hight;
	}
	//getter
	public double getWidth(){
		return width;
	}
	public double getHigth(){
		return hight;
	}
	//method
	public void calculationArea(){
		super.setArea(width*hight);
	}
}
public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("원", 10);
		//System.out.print(shape[0].area);
		shape[1] = new Rectangular("직사각형", 10,20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}
	}
}

```


## Adder
- 문자열 합구하기기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155291525-073f6dce-1124-4bd4-a4d2-2673337923ef.png" />

### 코드

```
public class Adder {
	public int excute(String expr){
		int result = 0;
		String[] a = expr.split("\\+");
		 for(int i=0 ; i<a.length ; i++) {
            result += Integer.parseInt(a[i]);
        }
		return result;
	}

	/*public int excute(String expr){
		int result = 0;+
		String strNum ="";
		for(int i=0; i<expr.length();i++){
			char c = expr.charAt(i);
			if(c=='+'){
				result += Integer.parseInt(strNum);
				strNum ="+";
			} else{
				strNum += c;
			}			
		}
		return (result+Integer.parseInt(strNum));
	}*/

	public static void main(String[] args) {
		Adder adder = new Adder();
		String expr ="3+5+9+1";
		System.out.println(expr+"="+adder.excute(expr));
		String expr1 ="11+45+77+3";
		System.out.println(expr+"="+adder.excute(expr1));
		String expr2 ="33+51+12+11";
		System.out.println(expr+"="+adder.excute(expr2));
	}
}

```




<hr />



# 02.24 과제

## Prob01
- 소수갯수, 소수 찾기
- Array연습

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155291799-adf43d9d-3ad9-45b1-a2ae-5f5da45170eb.png" />

### 코드

```
class Util {
	
	public int findPrimeCount(int limit){
		int[] arr = findPrimeReturnArray(limit);
		return arr.length;
	}

	public int[] findPrimeReturnArray(int limit){
		boolean prime = false;
		String[] stringArr;
		String stringPrime = "";

		for(int i=2; i<=limit; i++){
		// 초기값 초기화
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i부터 i-1까지의 모든수를 나눠서 나머지가 0 이있다면 소수가 아님
				prime = true;
			}
		}
		if(!prime){
			// false 라면 소수 true라면 소수가아님
			stringPrime += (i+",");
			}
		}
		stringArr = stringPrime.split(",");

		int intArr[] = new int[stringArr.length];
		for(int i=0; i<stringArr.length; i++){
			intArr[i] = Integer.parseInt(stringArr[i]);
		}

		return intArr;
	}

}
public class Prob01 {	

	public static void main(String[] args) {
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~ "+limit+"까지의 소수의 갯수는 "+primeCount +"EA 이며 소수는 아래와 같다");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}

```


## Prob01
- 소수갯수, 소수 찾기
- Array연습

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155291799-adf43d9d-3ad9-45b1-a2ae-5f5da45170eb.png" />

### 코드

```
class Util {
	
	public int findPrimeCount(int limit){
		int[] arr = findPrimeReturnArray(limit);
		return arr.length;
	}

	public int[] findPrimeReturnArray(int limit){
		boolean prime = false;
		String[] stringArr;
		String stringPrime = "";

		for(int i=2; i<=limit; i++){
		// 초기값 초기화
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i부터 i-1까지의 모든수를 나눠서 나머지가 0 이있다면 소수가 아님
				prime = true;
			}
		}
		if(!prime){
			// false 라면 소수 true라면 소수가아님
			stringPrime += (i+",");
			}
		}
		stringArr = stringPrime.split(",");

		int intArr[] = new int[stringArr.length];
		for(int i=0; i<stringArr.length; i++){
			intArr[i] = Integer.parseInt(stringArr[i]);
		}

		return intArr;
	}

}
public class Prob01 {	

	public static void main(String[] args) {
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~ "+limit+"까지의 소수의 갯수는 "+primeCount +"EA 이며 소수는 아래와 같다");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}

```


## Prob02
- API연습

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155292048-7c5b2574-45f4-4970-8a65-24e72a757262.png" />

### 코드

```
public class Prob02 {
	public String leftPad(String str, int size, char padChar){
		if(str.length()>size){
			return str;
		}
		int c = size-str.length();
		String b ="";
		for(int i=0; i<c; i++){
			b += padChar;
		}

		return b+" "+str;
	}
	//main
	public static void main(String[] args) {
		Prob02 prob03 = new Prob02();

		System.out.println(prob03.leftPad("ABC",6,'#'));
		System.out.println(prob03.leftPad("ABC",5,'$'));
		System.out.println(prob03.leftPad("ABC",2,'&'));
	}
}

```


## StringUtil
- API연습
- 문자열 길이, 합계 숫자등등 구하기

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155292259-7366ac59-757e-4590-838b-9b9b6aaf10cd.png" />

### 코드

```
public class StringUtil {
	public static String replaceString(String[] arr){
		int[] rArr = new int[arr.length];
		int r = 0;
		int max = 0;
		int maxIndex = 0;

		for(int i=0; i<arr.length; i++){
			r=0;
			for(int j=0; j<arr[i].length(); j++){
				if(97 == arr[i].charAt(j)){					
					r++;
				}
				rArr[i] = r;
			}
			//System.out.println(rArr[i]);
			if(max < rArr[i]){
				max = rArr[i];
				maxIndex =i;
			}
		}		
		return arr[maxIndex].replace('a','A');
	}
	public static void main(String[] args) {
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
	}
}


```


<hr />



# 02.25 과제

## Prob01
- static메소드 접근방식


### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155484106-530f8d38-013a-4a10-a4b4-57d3191addbf.png" />

### 코드

```
public class Prob01 {
	public static String myReplace(String str,char oldChar, char newChar){
		String result = "";
		//System.out.println(newChar);
		for(int i=0; i<str.length(); i++){
				if(oldChar == str.charAt(i)){					
					result += newChar;
				} else {
					result += str.charAt(i);
				}					
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("-------Sample 1--------");
		String str1 = myReplace("hello world",'l','*');
		System.out.println(str1);

		System.out.println("-------Sample 2--------");
		String str2 = myReplace("hello world",' ','-');
		System.out.println(str2);

		System.out.println("-------Sample 1--------");
		String str3 = myReplace("hello world",'a','*');
		System.out.println(str3);
	}
}

```

## ArrayUtil
- 배열이 변형되기 때문(data type)
- message return

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155484535-89175fe1-d363-4c37-b9b9-a3a92e8eca6d.png" />

### 코드

```
public class ArrayUtil {
	public char[] reverseString(char[] s, int start, int end){
		int a = 0;

		char[] cs = new char[s.length];
		char[] cs1 = new char[s.length];
		
		System.arraycopy(s, 0, cs, 0, s.length);
		System.arraycopy(s, 0, cs1, 0, s.length);
		
		for(int i=start; i<=end; i++){
				cs[i] = cs1[end-a];
				a++;
				//System.out.println(i);
				//System.out.println("end-i"+(end-i));
				//System.out.print(s[i]);
			}
		return cs;
	}

	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		System.out.println(au.reverseString(s,0,3));
		System.out.println(au.reverseString(s,4,7));
		System.out.println(au.reverseString(s,8,10));
		System.out.println(au.reverseString(s,0,10));
	}
}


```


## ArrayCopy
- 배열이 변형되기 때문(data type)
- message return

### 결과값

<img src="https://user-images.githubusercontent.com/92348108/155500507-2770ca75-0aeb-464f-bff4-e8a49c98e5db.png" />

### 코드

```
package h0225;

import java.util.Vector;

public class ArrayCopy {
	public Vector<String> moveToVector(String[] datas){
		Vector<String> arr = new Vector<String>(datas.length,10);
		
		System.out.println("리턴되는 Vector : ");
		for(int i=0; i<datas.length; i++){	
			arr.add(i,datas[datas.length-1-i]);
			//System.out.print(arr.get(i));
			
			// " 5",.... 모양을 만들고 싶다면
			// 분해해서 배열 인자값을 출력하고 true, false로 쉼표를 출력하면됨
			System.out.print("\" "+arr.get(i)+"\""+((i == datas.length-1) ? "" :","));
		}
		System.out.println("의 순서로 저장된 Vector");
		//System.out.println(arr.get(0));
		
		return arr;
	}
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}
}


```