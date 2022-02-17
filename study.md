# Idex

- [02-11](#02.11 ����)
- [02-16](#02.16 ����)
- [02-17](#02.17 ����)
- [02-18](#02.18 ����)


<hr />


# 02.11 ����

### example2

#### �����

<img src="https://user-images.githubusercontent.com/92348108/153554291-77706ecf-da13-499b-96ff-d470601c6334.PNG" />

#### �ڵ�

```
public class Example2
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int i = 1;
		System.out.println(a+"���� ����մϴ�");
		while(i<10){			
			System.out.println(i+"*"+a+"="+i*a);
			i++;
		}// while
	}// main
}// class

```

### exapmle3

#### �����

<img src="https://user-images.githubusercontent.com/92348108/153554349-7b852fee-928b-429f-8bb1-f1903cefbe2c.PNG" />

#### �ڵ�

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
			// a��b�� ���ٸ�
			System.out.println("[usage]"+a+"�� "+b+"�� ����");
			return;
		}

		if(a<b){
			// a�� b���� ũ�ٸ�
			i = a;
			a = b;			

		} else {
			// a�� b���� �۴ٸ�
			i = b;			
		}
		while(i<=a){
				sum = sum+i;
				i++;
		}
		// ����� ���
		System.out.println(Integer.parseInt(args[0])+"~"+b+"�� ������ "+sum+"�̴�");
	}//main
}//class

```

### exapmle4

#### �����

<img src="https://user-images.githubusercontent.com/92348108/153554464-5c48edd4-c2a0-46d1-9a91-26f469d7b0a8.PNG" />

#### �ڵ�

```
public class Example4
{
	public static void main(String[] args) 
	{		
		System.out.println("������ ��±�");
		for(int i=0; i<9; i++){
			System.out.println((i+1)+"��");
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

#### �����

<img src="https://user-images.githubusercontent.com/92348108/153554505-0e54b2ef-6dbc-4a95-ad3a-78d35b99d735.PNG" />

#### �ڵ�

```
public class Example5
{
	public static void main(String[] args) 
	{
		int[][] gugu = new int[9][9];
		
		System.out.println("������ ��±�");
		for(int i=0; i<gugu.length; i++){
			System.out.println((i+1)+"��");
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

# 02.16 ����

### prob01
���ڱ��ϱ�

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154236270-7baee156-c8a8-4e2d-b403-fbf6f75d61b6.png" />

#### �ڵ�

```
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int sum = 0;
		// �ְ����
		int maxInt=1001;

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" ���� ������ �Է��ϼ��� : ");
		number = keyboard.nextInt();
		
		// ����
		if(0<number && number<maxInt){
			// ���ڹݺ���
			for(int i=1; i<maxInt; i++){
				// ī��Ʈ, �� ���ϱ�
				if(i%number == 0){
					count++;
					sum += i;
				}
			}
		}
		// �����
		System.out.println(number + "�� ��� ���� = " +count);
		System.out.println(number + "�� ��� �� = " + sum);
	}// main
}// calss

```


### prob02
�����ϱ�

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154236482-e5e00c78-f7a7-44be-853d-b28143d49f1e.png" />

#### �ڵ�

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
					// �� ����
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
���ޱ��ϱ�

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154236701-980e787d-e481-4b91-aaa2-9da07e3f8022.png" />

#### �ڵ�

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

		System.out.println(year+"�� "+month+"���� ������ "+maxDay+"�� �Դϴ�");
	}
}


```


# 02.17 ����

### prob01
�μ����� ���� ���밪 ���ϱ�

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154237039-10c41f87-d308-4a0d-8a56-c642f74fc826.png" />

#### �ڵ�

```
import java.util.Scanner;

public class  Prob01 {
	
	// �޼ҵ� �ñ״�ó�� �ۼ�
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
		System.out.print("���� �ΰ��� �Է����ּ���>>");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		Prob01 prob = new Prob01();
		System.out.println("�μ��� ���� "+prob.abs(num1, num2));
	}// main

}//class
```

### SortUtil
�����ϱ�޼ҵ� �����

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154237248-bf50aafd-2b47-45a3-8a33-8f999f43b4c2.png" />

#### �ڵ�

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
					// �� ����
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


### Prob02
���Ƕ�̵� �����

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154237693-ab4a2efb-5b5e-420d-a90d-710e0fe52493.png" />

#### �ڵ�

```
import java.util.Scanner;

public class Prob02 {

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("0���� ū Ȧ���� �Է��� �ּ���>>");
		int num = keyboard.nextInt();

		if(num%2 == 1 && 0 < num){
			for(int i=1; i<=num; i++){
				// String ����
				String s = "";
				for(int j=1; j<i; j++){
					// ���� ��ĭ ���
					s += " ";
				}
				for(int j = 1; j <= num-2*i+2; j++){
					// �����
					s += "*";
				}
				System.out.println(s);
				if( i > num/2){
					// ����Ⱑ ������ �������� ���ֱ�
					System.out.println();
					return;
				}
			}			
		} else {
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
		}
	}//main
}//class
```

# 02.18 ����

### prob01
- ���ﰢ�� Ư������ ���
- Ư�̻���
	- Ű����� ������
	- �޼ҵ�� ����

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154442617-5ea12bca-8c08-454a-823b-6d6a5722ce7a.png" />

#### �ڵ�

```
import java.util.Scanner;

public class Prob01 {
	
	// Method
	public void printStar(String star, int num){
		for(int i=1; i<=num; i++){
				// String ����
				String s = "";

				for(int j=0;  j<=num-i; j++){
					// ���� ��ĭ ���
					s += " ";
				}

				for(int j=1; j<=(2*i)-1; j++){
					// �����
					s += star;
				}
				System.out.println(s);
			}
	}

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ���");
		String star = keyboard.next();

		System.out.print("1���� ū ���ڸ� �Է��� �ּ���>>");
		int num = keyboard.nextInt();

		if(num<1){
			System.out.println("1���� ū ���� �Է�");
		}

		new Prob01().printStar(star,num);

	}//main
}//class
```


### prob02
- �¾ ���� �޾� ���� ����ϱ�
- Ư�̻���
	- �Ű������� ����
	- �޼ҵ��� �ñ״��ķ� ����
	- �ݵ�� switch���� ���
	- ������ �ɷ�����

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154443026-fc829cfa-408d-4fb5-b8d7-3fe1b3d329fc.png" />

#### �ڵ�

```
public class Prob02 {
	//method
	public void printSeason(int month){
		String s="";
		
		switch(month){
			case 1 :
			case 2 :
			case 3 :
				s = "��";
				break;
			case 4 :
			case 5 :
			case 6 :
				s = "����";
				break;
			case 7 :
			case 8 :
			case 9 :
				s = "����";
				break;
			case 10 :
			case 11:
			case 12 :
				s = "�ܿ�";
				break;
		}
		System.out.println(s+"�� �¾�̳׿�.");
	}

	//main
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		
		//���͸�
		if (month<1 || 12<month) {
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}
		
		//ȣ��
		new Prob02().printSeason(month);
	}// main
}//class

```


### TestRectabgle
- �簢�� �ΰ� �Է¹ް� ���ϱ�
- Ư�̻���
	- Ű���� ���
	- Rectangle Ŭ������ �űԷ� �ۼ��Ͻÿ�
	- get,set���

#### �����

<img src="https://user-images.githubusercontent.com/92348108/154443443-b2687a0c-0d96-4705-b689-8f8542d44648.png" />

#### �ڵ�

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
		System.out.println("ù��° ���簢���� ����");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����");
		rec1.setLength(keyboard.nextInt());


		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setLength(keyboard.nextInt());
		
		// TODO 1) �� ���簢���� ���̸� ���Ͻÿ�
		if(rec1.area() > rec2.area()){
			System.out.println("���̴� "+rec1.getColor()+"���簢���� �� Ů�ϴ�");
		} else if(rec1.area() < rec2.area()){
			System.out.println("���̴� "+rec2.getColor()+"���簢���� �� Ů�ϴ�");
		} else {
			System.out.println("���̴� �����ϴ�");
		}

		// TODO 2) �� ���簢���� �ѷ��� ���Ͻÿ�
		if(rec1.perimeter() > rec2.perimeter()){
			System.out.println("�ѷ��� "+rec1.getColor()+"���簢���� �� Ů�ϴ�");
		} else if(rec1.perimeter() < rec2.perimeter()){
			System.out.println("�ѷ��� "+rec2.getColor()+"���簢���� �� Ů�ϴ�");
		} else {
			System.out.println("�ѷ��� �����ϴ�");
		}
	}//main
}// class

```