import java.util.Scanner;

public class  Prob01 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� �ΰ��� �Է����ּ���>>");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		Prob01 prob = new Prob01();
		System.out.println("�μ��� ���� "+prob.abs(num1, num2));
	}// main
	
	// �޼ҵ� �ñ״�ó�� �ۼ�
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