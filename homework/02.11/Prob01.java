import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		int inputInt = keyboard.nextInt();
		// �Ʒ��� �����ϼ���
		if(!(1<inputInt && inputInt<10)){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�");
			return;
		}
		System.out.println("\n"+inputInt+"�� ���");
		for(int i=1; i<10; i++){
			System.out.println(inputInt+"*"+i+"=\t"+inputInt*i);
		}
	}// main
}//class

