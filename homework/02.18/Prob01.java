import java.util.Scanner;

public class Prob01 {
	
	// Method
	public void printStar(String star, int num){
		for(int i=1; i<=num; i++){
				// String 생성
				String s = "";

				for(int j=0;  j<=num-i; j++){
					// 왼쪽 빈칸 찍기
					s += " ";
				}

				for(int j=1; j<=(2*i)-1; j++){
					// 별찍기
					s += star;
				}
				System.out.println(s);
			}
	}

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("원하는 기호를 입력하세요");
		String star = keyboard.next();

		System.out.print("1보다 큰 숫자를 입력해 주세요>>");
		int num = keyboard.nextInt();

		if(num<1){
			System.out.println("1보다 큰 숫자 입력");
		}

		new Prob01().printStar(star,num);

	}//main
}//class