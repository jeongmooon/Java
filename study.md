# Idex

- [02-11](#0211-����)
- [02-16](#0216-����)
- [02-17](#0217-����)
- [02-18](#0218-����)
- [02-22](#0222-����)
- [02-23](#0223-����)


<hr />


# 02.11 ����

## example2

### �����

<img src="https://user-images.githubusercontent.com/92348108/153554291-77706ecf-da13-499b-96ff-d470601c6334.PNG" />

### �ڵ�

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

## exapmle3

### �����

<img src="https://user-images.githubusercontent.com/92348108/153554349-7b852fee-928b-429f-8bb1-f1903cefbe2c.PNG" />

### �ڵ�

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

## exapmle4

### �����

<img src="https://user-images.githubusercontent.com/92348108/153554464-5c48edd4-c2a0-46d1-9a91-26f469d7b0a8.PNG" />

### �ڵ�

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

## exapmle5

### �����

<img src="https://user-images.githubusercontent.com/92348108/153554505-0e54b2ef-6dbc-4a95-ad3a-78d35b99d735.PNG" />

### �ڵ�

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

## prob01
���ڱ��ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/154236270-7baee156-c8a8-4e2d-b403-fbf6f75d61b6.png" />

### �ڵ�

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


## prob02
�����ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/154236482-e5e00c78-f7a7-44be-853d-b28143d49f1e.png" />

### �ڵ�

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


## prob03
���ޱ��ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/154236701-980e787d-e481-4b91-aaa2-9da07e3f8022.png" />

### �ڵ�

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

## prob01
�μ����� ���� ���밪 ���ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/154237039-10c41f87-d308-4a0d-8a56-c642f74fc826.png" />

### �ڵ�

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

## SortUtil
�����ϱ�޼ҵ� �����

### �����

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


## Prob02
���Ƕ�̵� �����

### �����

<img src="https://user-images.githubusercontent.com/92348108/154237693-ab4a2efb-5b5e-420d-a90d-710e0fe52493.png" />

### �ڵ�

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

## prob01
- ���ﰢ�� Ư������ ���
- Ư�̻���
	- Ű����� ������
	- �޼ҵ�� ����

### �����

<img src="https://user-images.githubusercontent.com/92348108/154442617-5ea12bca-8c08-454a-823b-6d6a5722ce7a.png" />

### �ڵ�

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


## prob02
- �¾ ���� �޾� ���� ����ϱ�
- Ư�̻���
	- �Ű������� ����
	- �޼ҵ��� �ñ״��ķ� ����
	- �ݵ�� switch���� ���
	- ������ �ɷ�����

### �����

<img src="https://user-images.githubusercontent.com/92348108/154443026-fc829cfa-408d-4fb5-b8d7-3fe1b3d329fc.png" />

### �ڵ�

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


## TestRectabgle
- �簢�� �ΰ� �Է¹ް� ���ϱ�
- Ư�̻���
	- Ű���� ���
	- Rectangle Ŭ������ �űԷ� �ۼ��Ͻÿ�
	- get,set���

### �����

<img src="https://user-images.githubusercontent.com/92348108/154443443-b2687a0c-0d96-4705-b689-8f8542d44648.png" />

### �ڵ�

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


# 02.20 ����

## prob01
- Ȧ¦ ������ �ձ��ϱ�
- Ư�̻���
	- ������ ������
	- �޼ҵ�� ����

### �����

<img src="https://user-images.githubusercontent.com/92348108/154640119-37248f61-d765-4aa8-9a18-51044c460b1e.png" />

### �ڵ�

```
// Ȧ���� �հ� ¦���� ���� ����ϱ�
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
		System.out.println("Ȧ���� �� : "+b);
		System.out.println("¦���� �� : "+a);
	}

	//main
	public static void main(String[] args) {
		int [] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int [] ib = new int[]{1,2,3,4,5};

		Prob01 p = new Prob01();
		System.out.println("(�迭 ia)");
		p.calc(ia);
		System.out.println("(�迭 ib)");
		p.calc(ib);
	}
}

```

## FactoriaUtil
- ���丮�� ���ϱ�
- Ư�̻���
	- Ű���� ���
	- �޼ҵ�� ����
	- ������� ��� �̿�
	- retrun

### �����

<img src="https://user-images.githubusercontent.com/92348108/154640486-150df309-6a5d-4c45-b46a-70ee9f14416b.png" />

### �ڵ�

```
import java.util.Scanner;

public class FactoriaUtil {
	//Field
	int i=1;
	int r=1;

	//method
	public int factorial(int n){
		// �����Ͻÿ�		
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
- ���� �����
- Ư�̻��ױ�
	- �޼ҵ�� ����
	- retrun

### �����

<img src="https://user-images.githubusercontent.com/92348108/154640853-0e94d8d8-33d1-44fb-9834-27cc35c93d7e.png" />

### �ڵ�

#### Account Bean�ڵ�
```
class Account {
	//Field
	String accNo;
	int balance;
	
	//Constructor
	public Account(String str){
		accNo = str;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
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
		//�Ա�
		balance += save;
		System.out.println(accNo+" ������ �ܰ� "+balance+"������ �ԱݵǾ����ϴ�.");
	}

	public void deposit(int deposit){
		//���
		balance -= deposit;
		System.out.println(accNo+" ������ �ܰ� "+balance+"������ ��ݵǾ����ϴ�.");
	}
}


```

#### Account APP�ڵ�

```
public class TestAccount {
	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�����Դϴ�");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " ������ �ܰ�� "+balance+"�����Դϴ�");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� "+balance+"�����Դϴ�");
	}
}

```

## Prob2
- �б������ý���
- Ư�̻��ױ�
	- �޼ҵ�� ����
	- extends

### �����

<img src="https://user-images.githubusercontent.com/92348108/154641307-6c99b743-1abb-4906-8fcd-3cf5873b0a61.png" />

### �ڵ�

#### Account Bean�ڵ�

- School �ڵ� super �ڵ�
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


- ������ 3�з� �ڵ�
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
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t��\t�� : "+id);
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
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t���  ���� : "+subject);
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
		System.out.println("��\t�� : "+getName()+"\t\t��\t�� : "+getAge()+"\t\t��\t�� : "+dept);
	}
}
```


#### Account APP�ڵ�

```
public class Prob02 {
	public static void main(String[] args) {

		Student s = new Student("ȫ�浿", 20 , 200201);
		Teacher t = new Teacher("�̼���", 30, "Java");
		Employee e = new Employee("������", 40, "������");
		
		s.print();
		t.print();
		e.print();
	}
}

```

# 02.22 ����

## ArrayCompare
- message ����
- static method���

### �����

<img src="https://user-images.githubusercontent.com/92348108/155076785-59e84740-72b8-48a6-8ec9-c11eff3f95fa.png" />

### �ڵ�

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
- Book, BookMgr Ŭ���� �����
- private ���������� ����ϱ�
- setter/getter����ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/155077198-6e0fa01c-d49b-4e31-a730-08687ee152f8.png" />

### �ڵ�

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
		System.out.println("��ü å ������ �� : "+total);
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

		System.out.println("=== å ��� ===");
		mgr.printBooklist();
		System.out.println("");

		System.out.println("=== å ������ ���� ===");
		mgr.printTotalPrice();
	}
}

```


## Prob02
- ��ȣ�����
- API����ϱ�
- if, �ǳʶٱ� ����ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/155077427-fb5972f1-8bbe-4940-9321-586e4fdd47fd.png" />

### �ڵ�

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
		//�ƽ�űŸ��
	}
}

```


<hr />



# 02.23 ����

## Prob01
- ������ �����
- Method����

### �����

<img src="https://user-images.githubusercontent.com/92348108/155077701-df3c5c0d-6061-4f16-a701-0aaa3e739d0c.png" />

### �ڵ�

```
public class Prob01 {
	public static void printGugudan(int no){
		if(no<0 || 9<no){
			System.out.println("1 �̻� 9 ������ ���� �Է��ϼž� �մϴ�"); 
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
		System.out.println("�־��� ���ڱ����� �������� ����ϴ�");
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
- Polymorphism������ ����� �����ε�
- Object Array�����
- abstrac�� ���� method �������̵��ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/155077916-708f2d52-4de9-4eb0-b428-002ec8067c4a.png" />

### �ڵ�

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
		System.out.println(getName()+"�� ������"+area);
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
		// Math APIȣ���ؼ� PI�� ��������(public�̿��� ȣ�Ⱑ��)
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

		shape[0] = new Circle("��", 10);
		//System.out.print(shape[0].area);
		shape[1] = new Rectangular("���簢��", 10,20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}
	}
}

```


## Adder
- ���ڿ� �ձ��ϱ��

### �����

<img src="https://user-images.githubusercontent.com/92348108/155291525-073f6dce-1124-4bd4-a4d2-2673337923ef.png" />

### �ڵ�

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



# 02.24 ����

## Prob01
- �Ҽ�����, �Ҽ� ã��
- Array����

### �����

<img src="https://user-images.githubusercontent.com/92348108/155291799-adf43d9d-3ad9-45b1-a2ae-5f5da45170eb.png" />

### �ڵ�

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
		// �ʱⰪ �ʱ�ȭ
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i���� i-1������ ������ ������ �������� 0 ���ִٸ� �Ҽ��� �ƴ�
				prime = true;
			}
		}
		if(!prime){
			// false ��� �Ҽ� true��� �Ҽ����ƴ�
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
		System.out.println("1~ "+limit+"������ �Ҽ��� ������ "+primeCount +"EA �̸� �Ҽ��� �Ʒ��� ����");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}

```


## Prob01
- �Ҽ�����, �Ҽ� ã��
- Array����

### �����

<img src="https://user-images.githubusercontent.com/92348108/155291799-adf43d9d-3ad9-45b1-a2ae-5f5da45170eb.png" />

### �ڵ�

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
		// �ʱⰪ �ʱ�ȭ
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i���� i-1������ ������ ������ �������� 0 ���ִٸ� �Ҽ��� �ƴ�
				prime = true;
			}
		}
		if(!prime){
			// false ��� �Ҽ� true��� �Ҽ����ƴ�
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
		System.out.println("1~ "+limit+"������ �Ҽ��� ������ "+primeCount +"EA �̸� �Ҽ��� �Ʒ��� ����");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}

```


## Prob02
- API����

### �����

<img src="https://user-images.githubusercontent.com/92348108/155292048-7c5b2574-45f4-4970-8a65-24e72a757262.png" />

### �ڵ�

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
- API����
- ���ڿ� ����, �հ� ���ڵ�� ���ϱ�

### �����

<img src="https://user-images.githubusercontent.com/92348108/155292259-7366ac59-757e-4590-838b-9b9b6aaf10cd.png" />

### �ڵ�

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
		System.out.println("����� ���ڿ� "+result);
	}
}


```


<hr />



# 02.25 ����

## Prob01
- static�޼ҵ� ���ٹ��


### �����

<img src="https://user-images.githubusercontent.com/92348108/155484106-530f8d38-013a-4a10-a4b4-57d3191addbf.png" />

### �ڵ�

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
		System.out.println("���ڿ��� Ư������ �����ϴ� �׽�Ʈ");
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
- �迭�� �����Ǳ� ����(data type)
- message return

### �����

<img src="https://user-images.githubusercontent.com/92348108/155484535-89175fe1-d363-4c37-b9b9-a3a92e8eca6d.png" />

### �ڵ�

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
- �迭�� �����Ǳ� ����(data type)
- message return

### �����

<img src="https://user-images.githubusercontent.com/92348108/155500507-2770ca75-0aeb-464f-bff4-e8a49c98e5db.png" />

### �ڵ�

```
package h0225;

import java.util.Vector;

public class ArrayCopy {
	public Vector<String> moveToVector(String[] datas){
		Vector<String> arr = new Vector<String>(datas.length,10);
		
		System.out.println("���ϵǴ� Vector : ");
		for(int i=0; i<datas.length; i++){	
			arr.add(i,datas[datas.length-1-i]);
			//System.out.print(arr.get(i));
			
			// " 5",.... ����� ����� �ʹٸ�
			// �����ؼ� �迭 ���ڰ��� ����ϰ� true, false�� ��ǥ�� ����ϸ��
			System.out.print("\" "+arr.get(i)+"\""+((i == datas.length-1) ? "" :","));
		}
		System.out.println("�� ������ ����� Vector");
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