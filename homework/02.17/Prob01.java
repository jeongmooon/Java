import java.util.Scanner;

public class  Prob01 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("숫자 두개를 입력해주세요>>");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		Prob01 prob = new Prob01();
		System.out.println("두수의 차는 "+prob.abs(num1, num2));
	}// main
	
	// 메소드 시그니처로 작성
	public int abs(int num1, int num2){
		if(num1 <num2){
			return -(num1-num2);
		}
		if(num2 < num1){
			return (num1-num2);
		}
		return 0;
	}//abs

}//class