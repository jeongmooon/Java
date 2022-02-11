public class Test2
{
	public static void main(String[] args) 
	{
		if(args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
			
			if( a ==b){
				// 같을 경우
				System.out.println("첫번째 인수: "+a+", 두번째 인수: "+b+"는 서로 같다");
				return;
			}

            if(a<b){
				// 첫번재 인자가 두번재보다 큰 경우
                System.out.println("첫번째 인수: "+a+", 두번째 인수: "+b);
                System.out.println(a+"+"+b+"="+(a+b));
            } else {
				// 첫번째 인자가 두번재보다 작은 경우
                System.out.println("첫번째 인수: "+a+", 두번째 인수: "+b);
                System.out.println(a+"-"+b+"="+(a-b));
            }
        } else {
            System.out.println("잘못 입력하셨습니다");
        }
	}//main
}//class
