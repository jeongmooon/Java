import java.util.Scanner;

public class Prob01 {
	
	// Method
	public void printStar(String star, int num){
		for(int i=1; i<=num; i++){
				// String ����
				String s = "";

				for(int j=0;  j<=num-i; j++){
					// ���� ��ĭ ���
					s += " ";
				}

				for(int j=1; j<=(2*i)-1; j++){
					// �����
					s += star;
				}
				System.out.println(s);
			}
	}

	//Main
	public static void main(String[] args) {
		//int num = Integer.parseInt(args[0]);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ���");
		String star = keyboard.next();

		System.out.print("1���� ū ���ڸ� �Է��� �ּ���>>");
		int num = keyboard.nextInt();

		if(num<1){
			System.out.println("1���� ū ���� �Է�");
		}

		new Prob01().printStar(star,num);

	}//main
}//class