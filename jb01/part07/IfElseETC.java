package jb01.part07;
/*
	1. ���ڸ� int DataType���� �����ϴ� Integer.parseInt()���
	3. Ư������ ����ϱ�(\t, \n, \")
*/
public class IsElseETC
{	
	//main method
	public static void main(String[] args) 
	{
		//==> \" ��� Ȯ��
		System.out.println("�Է��Ͻ� \"1��° �μ�\"�� :" + args[0]);
		System.out.println("�Է��Ͻ� \"2��° �μ�\"�� :" + args[1]);

		System.out.println("========================================");

		//�Է��� ���ڸ� int DataType���� �����ϴ� Integer.parseInt()���
		Int i = Integer.parseInt(args[0]);
		Int j = Integer.parseInt(args[1]);

		//i, j ������ ���� Ȯ��
		System.out.println("i ="+i+"\t k ="+j);	// <== Ư������ \t��� : ��°��Ȯ��
		System.out.println("���� ó�� \n");		// <== Ư������ \n��� : ��°��Ȯ��
		System.out.println("==================================================");

		if(i>j){
			System.out.println("i�� j���� Ů�ϴ�");
		} else if(i == j){
			System.out.println("i�� j�� �����ϴ�");
		} else if(i<j){
			System.out.println("i ���� j�� Ů�ϴ�");
		}
	}
}
