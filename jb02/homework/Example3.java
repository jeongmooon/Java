public class Example3
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0;
		

		if(a == b){
			// a��b�� ���ٸ�
			System.out.println("[usage]"+a+"�� "+b+"�� ����");
			return;
		}

		if(a<b){
			// a�� b���� ũ�ٸ�
			int i =a;
			while(i<=b){
				sum = sum+i;
				i++;
			}

		} else {
			// a�� b���� �۴ٸ�
			int i =b;
			while(i<=a){
				sum = sum+i;
				i++;
			}
		}
		// ����� ���
		System.out.println(a+"~"+b+"�� ������ "+sum+"�̴�");
	}//main
}//class
