public class Test2
{
	public static void main(String[] args) 
	{
		if(args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
			
			if( a ==b){
				// ���� ���
				System.out.println("ù��° �μ�: "+a+", �ι�° �μ�: "+b+"�� ���� ����");
				return;
			}

            if(a<b){
				// ù���� ���ڰ� �ι��纸�� ū ���
                System.out.println("ù��° �μ�: "+a+", �ι�° �μ�: "+b);
                System.out.println(a+"+"+b+"="+(a+b));
            } else {
				// ù��° ���ڰ� �ι��纸�� ���� ���
                System.out.println("ù��° �μ�: "+a+", �ι�° �μ�: "+b);
                System.out.println(a+"-"+b+"="+(a-b));
            }
        } else {
            System.out.println("�߸� �Է��ϼ̽��ϴ�");
        }
	}//main
}//class
