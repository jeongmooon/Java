package jb01.part07;
/*
	1. 문자를 int DataType으로 변경하는 Integer.parseInt()사용
	3. 특수문자 사용하기(\t, \n, \")
*/
public class IsElseETC
{	
	//main method
	public static void main(String[] args) 
	{
		//==> \" 사용 확인
		System.out.println("입력하신 \"1번째 인수\"는 :" + args[0]);
		System.out.println("입력하신 \"2번째 인수\"는 :" + args[1]);

		System.out.println("========================================");

		//입력한 문자를 int DataType으로 변경하는 Integer.parseInt()사용
		Int i = Integer.parseInt(args[0]);
		Int j = Integer.parseInt(args[1]);

		//i, j 변수에 값을 확인
		System.out.println("i ="+i+"\t k ="+j);	// <== 특수문자 \t사용 : 출력결과확인
		System.out.println("한줄 처리 \n");		// <== 특수문자 \n사용 : 출력결과확인
		System.out.println("==================================================");

		if(i>j){
			System.out.println("i가 j보다 큽니다");
		} else if(i == j){
			System.out.println("i와 j는 같습니다");
		} else if(i<j){
			System.out.println("i 보다 j가 큽니다");
		}
	}
}
