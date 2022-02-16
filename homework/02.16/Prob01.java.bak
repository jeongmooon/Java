import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int sum = 0;
		// 최고숫자
		int maxInt=1001;

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" 양의 정수를 입력하세요 : ");
		number = keyboard.nextInt();
		
		// 범위
		if(0<number && number<maxInt){
			// 숫자반복문
			for(int i=1; i<maxInt; i++){
				// 카운트, 합 구하기
				if(i%number == 0){
					count++;
					sum += i;
				}
			}
		}
		// 결과값
		System.out.println(number + "의 배수 개수 = " +count);
		System.out.println(number + "의 배수 합 = " + sum);
	}// main
}// calss
