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