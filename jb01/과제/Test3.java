public class Test3
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

		if(a%2 == 0 & a%3 == 0){
			// 짝수고 3의 배수다
			System.out.println("1번째 인자값 "+a+"는 짝수이며 3의 배수이다");
		} else if(a%2 ==0 & a%3 != 0){
			// 짝수고 3의배수가 아니다
			System.out.println("1번째 인자값 "+a+"는 짝수이며 3의 배수가 아니다");
		} else if(a%2 !=0 & a%3 == 0){
			// 홀수고 3의배수다
			System.out.println("1번째 인자값 "+a+"는 홀수이며 3의 배수이다");
		} else if(a%2 !=0 & a%3 != 0){
			// 홀수고 3의배수가 아니다
			System.out.println("1번째 인자값 "+a+"는 홀수이며 3의 배수가 아니다");
		}

		if(b%2 == 0 & b%3 == 0){
			// 짝수고 3의 배수다
			System.out.println("2번째 인자값 "+b+"는 짝수이며 3의 배수이다");
		} else if(b%2 ==0 & b%3 != 0){
			// 짝수고 3의배수가 아니다
			System.out.println("2번째 인자값 "+b+"는 짝수이며 3의 배수가 아니다");
		} else if(b%2 !=0 & b%3 == 0){
			// 홀수고 3의배수다
			System.out.println("2번째 인자값 "+b+"는 홀수이며 3의 배수이다");
		} else if(b%2 !=0 & b%3 != 0){
			// 홀수고 3의배수가 아니다
			System.out.println("2번째 인자값 "+b+"는 홀수이며 3의 배수가 아니다");
		}
	}
}
