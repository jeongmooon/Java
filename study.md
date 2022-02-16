# 02-11 study

### example2

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554291-77706ecf-da13-499b-96ff-d470601c6334.PNG" />

#### 코드

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

### exapmle3

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554349-7b852fee-928b-429f-8bb1-f1903cefbe2c.PNG" />

#### 코드

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

### exapmle4

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554464-5c48edd4-c2a0-46d1-9a91-26f469d7b0a8.PNG" />

#### 코드

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

### exapmle5

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/153554505-0e54b2ef-6dbc-4a95-ad3a-78d35b99d735.PNG" />

#### 코드

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

# 02-16 과제

### prob01
숫자구하기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236270-7baee156-c8a8-4e2d-b403-fbf6f75d61b6.png" />

#### 코드

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


### prob02
소팅하기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236482-e5e00c78-f7a7-44be-853d-b28143d49f1e.png" />

#### 코드

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


### prob03
윤달구하기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154236701-980e787d-e481-4b91-aaa2-9da07e3f8022.png" />

#### 코드

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


# 02-17 과제

### prob01
두숫자의 차이 절대값 구하기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237039-10c41f87-d308-4a0d-8a56-c642f74fc826.png" />

#### 코드

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

### SortUtil
소팅하기메소드 만들기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237248-bf50aafd-2b47-45a3-8a33-8f999f43b4c2.png" />

#### 코드

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
				String s = "";
				for(int j=1; j<i; j++){
					s += " ";
				}
				for(int j = 1; j <= num-2*i+2; j++){
					s += "*";
				}
				System.out.println(s);
				if( i > num/2){
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


### Prob02
역피라미드 별찍기

#### 결과값

<img src="https://user-images.githubusercontent.com/92348108/154237693-ab4a2efb-5b5e-420d-a90d-710e0fe52493.png" />

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