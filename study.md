# 02-11 study

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
