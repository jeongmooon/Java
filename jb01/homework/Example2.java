public class Example2
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = a/10;

		switch(b){

			case 0:

			case 1:

			case 2:

			case 3:

			case 4:

			case 5:

			case 6:
				System.out.println("입력하신 값 "+a+"점은 가입니다");
				break;

			case 7:
				System.out.println("입력하신 값 "+a+"점은 양입니다");
				break;

			case 8:
				System.out.println("입력하신 값 "+a+"점은 미입니다");
				break;

			case 9:
				System.out.println("입력하신 값 "+a+"점은 우입니다");
				break;

			case 10:
				System.out.println("입력하신 값 "+a+"점은 수입니다");
				break;

			default:
				System.out.println("잘못 입력했습니다");
				break;
		}
		
	}// main

}// class
