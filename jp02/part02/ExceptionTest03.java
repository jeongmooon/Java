public class ExceptionTest03 {
	//Field
	private int sum;
	private int avg;

	//Construcotr
	public ExceptionTest03(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1.==> sum ����");
		sum = x+y;
		System.out.println("1.==> �� : "+sum);
		System.out.println("1.==> sum ��");
	}
	
	// JVM���� ���� ArithmeticException�� �ٽ� �ڽ��� ȣ���� ������ ����(����)�Ѵ�.
	public void avg(int z) throws ArithmeticException{
		System.out.println("2.==> avg ����");
		//z = 0�� ��� �Ҵ�
		avg = sum/z;		
		System.out.println("��� : "+avg);
		System.out.println("2. ==> avg ��");
	}

	//main method
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest03 et = new ExceptionTest03();
		et.sum(i,j);
		et.avg(k);

		System.out.println("main Method End....");
	}
}