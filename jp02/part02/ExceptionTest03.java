public class ExceptionTest03 {
	//Field
	private int sum;
	private int avg;

	//Construcotr
	public ExceptionTest03(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1.==> sum 시작");
		sum = x+y;
		System.out.println("1.==> 합 : "+sum);
		System.out.println("1.==> sum 끝");
	}
	
	// JVM에서 던진 ArithmeticException을 다시 자신을 호출한 곳으로 던진(위임)한다.
	public void avg(int z) throws ArithmeticException{
		System.out.println("2.==> avg 시작");
		//z = 0일 경우 불능
		avg = sum/z;		
		System.out.println("평균 : "+avg);
		System.out.println("2. ==> avg 끝");
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
