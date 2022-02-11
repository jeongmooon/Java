public class Example1
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		String g;
///*
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
			System.out.println("잘못 입력했습니다");
		}
//*/
/*
		if(args.length != 1){
			System.out.println("하나만 입력해 주세요");
			return;
		}
		if( 0 >a || 100<a){
			System.out.println("0~100사이값 입력해주세요");
			return;
		}
		switch(a/10){

			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				g = "가";
				break;
			case 6:
				g = "양";
				break;
			case 7:
				g = "미";
				break;
			case 8:
				g = "우";
				break;
			case 9:
			case 10:
			default:
				g = "수";
		}*/
		//System.out.println("입력하신 값 "+a+"점은 "+g+"입니다");
	}
}
