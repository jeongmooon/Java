import java.util.Scanner;

public class Prob03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 :");
		
		int inputInt = keyboard.nextInt();
		int r = 1;
		// 아래에 구현하시오
		if(inputInt < 2 || 9 <inputInt){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}

		// 팩토리얼
		for(int i=1; i<=inputInt; i++){
			r = r*i;
		}
		System.out.println(r);
	}
}
