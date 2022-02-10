public class Example3
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0;
		

		if(a == b){
			// a와b가 같다면
			System.out.println("[usage]"+a+"와 "+b+"는 같다");
			return;
		}

		if(a<b){
			// a가 b보다 크다면
			int i =a;
			while(i<=b){
				sum = sum+i;
				i++;
			}

		} else {
			// a가 b보다 작다면
			int i =b;
			while(i<=a){
				sum = sum+i;
				i++;
			}
		}
		// 결과값 출력
		System.out.println(a+"~"+b+"의 총합은 "+sum+"이다");
	}//main
}//class
