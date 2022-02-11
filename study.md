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
