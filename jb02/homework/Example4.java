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
