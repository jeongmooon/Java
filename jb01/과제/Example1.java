public class Example1
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);

		if(0<= a && a<=100){

			if(a<60){
				System.out.println("입력하신 값 "+a+"점은 가입니다");
				return;
			}
			if(a<70){
				System.out.println("입력하신 값 "+a+"점은 양입니다");
				return;
			}
			if(a<80){
				System.out.println("입력하신 값 "+a+"점은 미입니다");
				return;
			}
			if(a<90){
				System.out.println("입력하신 값 "+a+"점은 우입니다");
				return;
			}
			System.out.println("입력하신 값 "+a+"점은 수입니다");

		} else {
			System.out.println("숫자 범위 틀립니다");
		}
	}
}
