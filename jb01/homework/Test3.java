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
				// a는 짝수다
				if(a[i]%3 == 0){
					//a는 3의배수다
					System.out.println((i+1)+"번째 인자값 "+a[i]+"는 짝수이며 3의배수 이다");
				} else {
					//a는 3의배수가 아니다
					System.out.println((i+1)+"번째 인자값 "+a[i]+"는 짝수이며 3의배수가 아닙니다");
				}
			} else {
				// a는 홀수다
				if(a[i]%3 == 0){
					//a는 3의배수다
					System.out.println((i+1)+"번째 인자값 "+a[i]+"는 홀수이며 3의배수 이다");
				} else {
					//a는 3의배수가 아니다
					System.out.println((i+1)+"번째 인자값 "+a[i]+"는 홀수이며 3의배수가 아닙니다");
				}
			}
		}// for문		
	}// main
}// class
