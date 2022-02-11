import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int inputInt = keyboard.nextInt();
		// 아래에 구현하세요
		if(!(1<inputInt && inputInt<10)){
			System.out.println("잘못된 숫자가 입력되었습니다");
			return;
		}
		System.out.println("\n"+inputInt+"단 출력");
		for(int i=1; i<10; i++){
			System.out.println(inputInt+"*"+i+"=\t"+inputInt*i);
		}
	}// main
}//class

