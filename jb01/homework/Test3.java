public class Test3
{
	public static void main(String[] args) 
	{
		// int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
		int[] a = new int[3];

		for(int i=0; i<args.length; i++){
			a[i] = Integer.parseInt(args[i]);

			if(a[i]%2 == 0){
				// a�� ¦����
				if(a[i]%3 == 0){
					//a�� 3�ǹ����
					System.out.println((i+1)+"��° ���ڰ� "+a[i]+"�� ¦���̸� 3�ǹ�� �̴�");
				} else {
					//a�� 3�ǹ���� �ƴϴ�
					System.out.println((i+1)+"��° ���ڰ� "+a[i]+"�� ¦���̸� 3�ǹ���� �ƴմϴ�");
				}
			} else {
				// a�� Ȧ����
				if(a[i]%3 == 0){
					//a�� 3�ǹ����
					System.out.println((i+1)+"��° ���ڰ� "+a[i]+"�� Ȧ���̸� 3�ǹ�� �̴�");
				} else {
					//a�� 3�ǹ���� �ƴϴ�
					System.out.println((i+1)+"��° ���ڰ� "+a[i]+"�� Ȧ���̸� 3�ǹ���� �ƴմϴ�");
				}
			}
		}// for��		
	}// main
}// class